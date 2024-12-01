package Instrument;

public class InstrumentServiceFactory {

  public InstrumentService getInstrumentService(InstrumentType instrumentType) {
    System.out.println("Instruement Type: " + instrumentType);
    if (instrumentType == InstrumentType.BANK) {
      return new BankInstrumentService();
    } else if (instrumentType == InstrumentType.CARD) {
      return new CardInstrumentService();
    } else {
      return null;
    }
  }
}