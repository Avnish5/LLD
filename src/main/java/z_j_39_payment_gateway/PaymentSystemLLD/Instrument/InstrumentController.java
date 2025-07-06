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

    public List<InstrumentDO> getAllInstruments(int userId) {
        InstrumentService bankInstrumentController = instrumentServiceFactory.getInstrumentService(InstrumentType.BANK);
        InstrumentService cardInstrumentController = instrumentServiceFactory.getInstrumentService(InstrumentType.CARD);

        List<InstrumentDO> instrumentDOList = bankInstrumentController.getInstrumentsByUserID(userId);
        instrumentDOList.addAll(cardInstrumentController.getInstrumentsByUserID(userId));

        return instrumentDOList;
    }

    public InstrumentDO getInstrumentsByID(int userID, int instrumentID){
        List<InstrumentDO> instrumentDOList = getAllInstruments(userID);

        for (InstrumentDO instrumentDO : instrumentDOList) {
            if (instrumentDO.getInstrumentID() == instrumentID) {
                return instrumentDO;
            }
        }

        return null;
    }



}
