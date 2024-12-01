package Instrument;

import java.util.List;

public class InstrumentController {
  InstrumentServiceFactory instrumentServiceFactory;

  public InstrumentController() {
    this.instrumentServiceFactory = new InstrumentServiceFactory();
  }

  public Instrument addInstrument(InstrumentDO instrumentDO) {
    InstrumentService instrumentService = instrumentServiceFactory
        .getInstrumentService(instrumentDO.getInstrumentType());

    if (instrumentService == null) {
      System.out.println("Instrument service is null " + instrumentDO.getInstrumentType());
    }

    Instrument instrument = instrumentService.addUserInstrument(instrumentDO);
    System.out.println("Successfully Added instruments!");

    return instrument;
  }

  public List<Instrument> getInstrumentByUserId(int userId) {

    List<Instrument> bankInstrument = instrumentServiceFactory.getInstrumentService(InstrumentType.BANK)
        .getInstrumentByUser(userId);

    List<Instrument> cardInstrument = instrumentServiceFactory.getInstrumentService(InstrumentType.CARD)
        .getInstrumentByUser(userId);

    for (Instrument instrument : cardInstrument) {
      bankInstrument.add(instrument);
    }

    return bankInstrument;
  }

  public Instrument getInstrumentById(int userId, int instrumentId) {
    List<Instrument> totalInstrument = getInstrumentByUserId(userId);

    for (Instrument instrument : totalInstrument) {
      if (instrument.getInstruemntId() == instrumentId) {
        return instrument;
      }
    }

    return null;
  }
}