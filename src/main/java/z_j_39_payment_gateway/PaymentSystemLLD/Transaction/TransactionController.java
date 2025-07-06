package z_j_39_payment_gateway.PaymentSystemLLD.Transaction;

import java.util.List;

public class TransactionController {

    TransactionService txnService;

    public TransactionController() {
        txnService = new TransactionService();
    }

    public TransactionDO makePayment(TransactionDO transactionDO) {
        return txnService.makePayment(transactionDO);
    }

    public List<Transaction> getTransactionHistory(int userID) {
        return txnService.getTransactionHistory(userID);
    }
}
