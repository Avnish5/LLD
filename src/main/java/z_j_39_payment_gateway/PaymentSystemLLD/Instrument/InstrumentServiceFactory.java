package z_j_39_payment_gateway.PaymentSystemLLD.Instrument;

public class InstrumentServiceFactory {

    public InstrumentService getInstrumentService(InstrumentType instrumentType) {
        if (instrumentType == InstrumentType.CARD) {
            return new CardService();
        } else if (instrumentType == InstrumentType.BANK) {
            return new BankService();
        }
        else {
            return null;
        }
    }

}
