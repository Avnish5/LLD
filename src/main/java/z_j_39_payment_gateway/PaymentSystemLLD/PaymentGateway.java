package z_j_39_payment_gateway.PaymentSystemLLD;

import z_j_39_payment_gateway.PaymentSystemLLD.Instrument.InstrumentController;
import z_j_39_payment_gateway.PaymentSystemLLD.Instrument.InstrumentDO;
import z_j_39_payment_gateway.PaymentSystemLLD.Instrument.InstrumentType;
import z_j_39_payment_gateway.PaymentSystemLLD.Transaction.TransactionController;
import z_j_39_payment_gateway.PaymentSystemLLD.Transaction.TransactionDO;
import z_j_39_payment_gateway.PaymentSystemLLD.User.UserController;
import z_j_39_payment_gateway.PaymentSystemLLD.User.UserDO;

public class PaymentGateway {
    public static void main(String[] args) {

        InstrumentController instrumentController = new InstrumentController();
        UserController userController = new UserController();
        TransactionController transactionController = new TransactionController();

        //1. add USER1
        UserDO user1 = new UserDO();
        user1.setName("sj");
        user1.setMail("sj@gmail.com");
        UserDO user1Details = userController.addUser(user1);

        //1. add USER2
        UserDO user2 = new UserDO();
        user2.setName("pk");
        user2.setMail("pk@gmail.com");
        UserDO user2Details = userController.addUser(user2);

        //add bank to user 1
        InstrumentDO bankInstrumentDO = new InstrumentDO();
        bankInstrumentDO.setBankAccountNumber("454675758");
        bankInstrumentDO.setInstrumentType(InstrumentType.BANK);
        bankInstrumentDO.setUserID(user1Details.getUserID());
        bankInstrumentDO.setIfsc("1334");
        InstrumentDO user1BankInstrument = instrumentController.addInstrument(bankInstrumentDO);
        System.out.println("Bank Instrument created for User1 : " + user1BankInstrument.getInstrumentID());

        //add card to user 1
        InstrumentDO cardInstrumentDO = new InstrumentDO();
        cardInstrumentDO.setCardNumber("1355556");
        cardInstrumentDO.setInstrumentType(InstrumentType.CARD);
        cardInstrumentDO.setCvv("0000");
        cardInstrumentDO.setUserID(user2Details.getUserID());
        InstrumentDO user2CardInstrument = instrumentController.addInstrument(cardInstrumentDO);
        System.out.println("Card Instrument created for User2 : " + user2CardInstrument.getInstrumentID());

        //make payment
        TransactionDO transactionDO = new TransactionDO();
        transactionDO.setAmount(10);
        transactionDO.setSenderUserID(user1Details.getUserID());
        transactionDO.setReceiverUserID(user2Details.getUserID());
        transactionDO.setDebitInstrumentID(user1BankInstrument.getInstrumentID());
        transactionDO.setCreditInstrumentID(user2CardInstrument.getInstrumentID());
        transactionController.makePayment(transactionDO);

    }
}
