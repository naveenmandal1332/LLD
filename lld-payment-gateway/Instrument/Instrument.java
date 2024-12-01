package Instrument;

public abstract class Instrument {
  int instruemntId;
  int userId;
  InstrumentType instrumentType;

  public int getInstruemntId() {
    return instruemntId;
  }

  public void setInstruemntId(int instruemntId) {
    this.instruemntId = instruemntId;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public InstrumentType getInstrumentType() {
    return instrumentType;
  }

  public void setInstrumentType(InstrumentType instrumentType) {
    this.instrumentType = instrumentType;
  }
}