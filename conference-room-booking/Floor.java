import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Floor {
  String floorId;
  Map<String, ConferenceRoom> conferenceRooms;

  public Floor(String floorId) {
    this.floorId = floorId;
    this.conferenceRooms = new HashMap<>();
  }

  public String getFloorId() {
    return floorId;
  }

  public void addConferenceRoom(ConferenceRoom room) {
    String roomId = room.getRoomId();
    if (conferenceRooms.containsKey(roomId))
      throw new IllegalArgumentException("This Room is Already Exist!");

    conferenceRooms.put(roomId, room);
  }

  public ConferenceRoom getRoom(String roomId) {
    if (!conferenceRooms.containsKey(roomId))
      throw new IllegalArgumentException("This Room does not Exist!");

    return conferenceRooms.get(roomId);
  }

  public Collection<ConferenceRoom> getRooms() {
    return conferenceRooms.values();
  }
}
