package z_j_39_payment_gateway.PaymentSystemLLD.Instrument;

import java.util.List;

public class InstrumentController {

    InstrumentServiceFactory instrumentServiceFactory;

    public InstrumentController() {
        this.instrumentServiceFactory = new InstrumentServiceFactory();
    }

    public InstrumentDO addInstrument(InstrumentDO instrumentDO) {
        InstrumentService instrumentController = instrumentServiceFactory.getInstrumentService(instrumentDO.instrumentType);
        return instrumentController.addInstrument(instrumentDO);
    }


}
