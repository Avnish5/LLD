package z_j_39_payment_gateway.PaymentSystemLLD.Instrument;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardService extends InstrumentService{

    @Override
    public InstrumentDO addInstrument(InstrumentDO instrumentDO) {

       CardInstrument cardInstrument = new CardInstrument();
       cardInstrument.instrumentID = new Random().nextInt(100-10) + 10;
       cardInstrument.cardNumber = instrumentDO.cardNumber;
       cardInstrument.cvvNumber = instrumentDO.cvv;
       cardInstrument.instrumentType = instrumentDO.instrumentType;
       cardInstrument.userID = instrumentDO.userID;

       List<Instrument> userInstrumentList = userVsInstruments.get(cardInstrument.userID);

       if(userInstrumentList == null) {
           userInstrumentList = new ArrayList<>();
           userVsInstruments.put(cardInstrument.userID, userInstrumentList);
       }

       userInstrumentList.add(cardInstrument);

       return mapCardInstrumentToInstrumentDO(cardInstrument);

    }

    @Override
    public List<InstrumentDO> getInstrumentsByUserID(int userID) {
        List<Instrument> userInstruments = userVsInstruments.get(userID);
        List<InstrumentDO> userFetchedInstruments = new ArrayList<>();

        for (Instrument instrument : userInstruments) {
            if (instrument.instrumentType == InstrumentType.CARD) {
                userFetchedInstruments.add(mapCardInstrumentToInstrumentDO((CardInstrument) instrument));
            }
        }

        return userFetchedInstruments;
    }

    public InstrumentDO mapCardInstrumentToInstrumentDO(CardInstrument cardInstrument) {
        InstrumentDO instrumentDO = new InstrumentDO();
        instrumentDO.instrumentID = cardInstrument.instrumentID;
        instrumentDO.instrumentType = cardInstrument.instrumentType;
        instrumentDO.userID = cardInstrument.userID;
        instrumentDO.cardNumber = cardInstrument.cardNumber;
        instrumentDO.cvv = cardInstrument.cvvNumber;

        return instrumentDO;
    }
}
