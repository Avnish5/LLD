package z_j_39_payment_gateway.PaymentSystemLLD.Transaction;

import z_j_39_payment_gateway.PaymentSystemLLD.Instrument.InstrumentDO;

public class Processor {

    public void processPayment(InstrumentDO senderTransaction, InstrumentDO receiverTransaction) {
        System.out.println("Processing the payment");
    }
}
