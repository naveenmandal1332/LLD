
package Instrument;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class InstrumentService {

  Map<Integer, List<Instrument>> userVsInstrument = new HashMap<>(); // userid, instruments

  public abstract Instrument addUserInstrument(InstrumentDO objDo);

  public abstract List<Instrument> getInstrumentByUser(int userId);
}