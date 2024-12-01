package Instrument;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardInstrumentService extends InstrumentService {

  // @Override
  public Instrument addUserInstrument(InstrumentDO instrumentDO) {

    int userId = instrumentDO.getUserId();

    List<Instrument> instruments = new ArrayList<>();
    if (userVsInstrument.containsKey(userId)) {
      instruments = userVsInstrument.get(userId);
    }

    CardInstrument instrumentOne = new CardInstrument();
    int id = new Random().nextInt(100 - 10) + 10;
    instrumentOne.setInstruemntId(id);
    instrumentOne.setUserId(userId);
    instrumentOne.setInstrumentType(InstrumentType.CARD);
    instrumentOne.setCardNumber(instrumentDO.getCardNumber());
    instrumentOne.setCvvNumber(instrumentDO.getCvvNumber());
    instruments.add(instrumentOne);

    userVsInstrument.put(userId, instruments);

    return instrumentOne;
  }

  // @Override
  public List<Instrument> getInstrumentByUser(int userId) {
    List<Instrument> instruments = userVsInstrument.get(userId);
    List<Instrument> bankInstrument = new ArrayList<>();

    for (Instrument inst : instruments) {
      if (inst.getInstrumentType() == InstrumentType.CARD) {
        bankInstrument.add(inst);
      }
    }

    return bankInstrument;
  }
}