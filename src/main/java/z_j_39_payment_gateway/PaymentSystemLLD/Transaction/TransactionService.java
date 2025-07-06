package z_j_39_payment_gateway.PaymentSystemLLD.Transaction;

import z_j_39_payment_gateway.PaymentSystemLLD.Instrument.InstrumentController;
import z_j_39_payment_gateway.PaymentSystemLLD.Instrument.InstrumentDO;

import java.util.*;

public class TransactionService {

    public static Map<Integer, List<Transaction>> userVsTransactionList = new HashMap<>();
    InstrumentController instrumentController;
    Processor processor;

    public TransactionService() {
        instrumentController = new InstrumentController();
        processor = new Processor();
    }

    public List<Transaction> getTransactionHistory(int userID) {
        return userVsTransactionList.get(userID);
    }

    public TransactionDO makePayment(TransactionDO transactionDO) {
        InstrumentDO senderInstrumentDO = instrumentController.getInstrumentsByID(transactionDO.getSenderUserID(), transactionDO.getDebitInstrumentID());
        InstrumentDO receiverInstrumentDO = instrumentController.getInstrumentsByID(transactionDO.getReceiverUserID(), transactionDO.getCreditInstrumentID());
        processor.processPayment(senderInstrumentDO, receiverInstrumentDO);

        Transaction txn = new Transaction();
        txn.setAmount(transactionDO.getAmount());
        txn.setTxnID(new Random().nextInt(100-10)+10);
        txn.setSenderUserID(transactionDO.getSenderUserID());
        txn.setReceiverUserID(transactionDO.getReceiverUserID());
        txn.setDebitInstrumentID(transactionDO.getDebitInstrumentID());
        txn.setCreditInstrumentID(transactionDO.getCreditInstrumentID());
        txn.setTransactionStatus(TransactionStatus.SUCCESS);

        List<Transaction> senderTXNList = userVsTransactionList.get(txn.getSenderUserID());

        if (senderTXNList == null) {
            senderTXNList = new ArrayList<>();
            userVsTransactionList.put(txn.getSenderUserID(), senderTXNList);
        }

        senderTXNList.add(txn);

        List<Transaction> receiverTXNList = userVsTransactionList.get(txn.getReceiverUserID());

        if (receiverTXNList == null) {
            receiverTXNList = new ArrayList<>();
            userVsTransactionList.put(txn.getSenderUserID(), receiverTXNList);
        }

        receiverTXNList.add(txn);
        transactionDO.setTxnID(txn.getTxnID());
        transactionDO.setTransactionStatus(txn.getTransactionStatus());

        return transactionDO;
    }

}
