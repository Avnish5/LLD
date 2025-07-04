package z_j_39_payment_gateway.PaymentSystemLLD.Instrument;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankService extends InstrumentService{

    @Override
    public InstrumentDO addInstrument(InstrumentDO instrumentDO) {

        BankInstrument bankInstrument = new BankInstrument();
        bankInstrument.instrumentID = new Random().nextInt(100-10)+10;
        bankInstrument.bankAccountNo = instrumentDO.getBankAccountNumber();
        bankInstrument.ifscCode = instrumentDO.getIfsc();
        bankInstrument.instrumentType = instrumentDO.getInstrumentType();
        bankInstrument.userID = instrumentDO.getUserID();
        List<Instrument> userInstrumentList = userVsInstruments.get(bankInstrument.userID);

        if (userInstrumentList == null) {
            userInstrumentList = new ArrayList<>();
            userInstrumentList.add(bankInstrument.userID, bankInstrument);
        }

        userInstrumentList.add(bankInstrument);
        return mapBankInstrumentToInstrumentDO(bankInstrument);
    }

    @Override
    public List<InstrumentDO> getInstrumentsByUserID(int userID) {
       List<Instrument> userInstrument = userVsInstruments.get(userID);
       List<InstrumentDO> userInstrumentFetched = new ArrayList<>();

       for (Instrument instrument : userInstrument){
           if (instrument.getInstrumentType() == InstrumentType.BANK) {
               userInstrumentFetched.add(mapBankInstrumentToInstrumentDO((BankInstrument) instrument));
           }
       }

       return userInstrumentFetched;
    }

    public InstrumentDO mapBankInstrumentToInstrumentDO(BankInstrument bankInstrument)  {
        InstrumentDO instrumentDO = new InstrumentDO();
        instrumentDO.instrumentType = bankInstrument.instrumentType;
        instrumentDO.instrumentID = bankInstrument.instrumentID;
        instrumentDO.bankAccountNumber = bankInstrument.bankAccountNo;
        instrumentDO.ifsc = bankInstrument.ifscCode;
        instrumentDO.userID = bankInstrument.userID;

        return instrumentDO;
    }
}
