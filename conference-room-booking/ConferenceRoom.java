import java.util.Map;
import java.util.TreeMap;

public class ConferenceRoom {
  String roomId;
  TreeMap<Integer, Integer> bookedSlot;

  public ConferenceRoom(String roomId) {
    this.roomId = roomId;
    this.bookedSlot = new TreeMap<>();
  }

  public boolean isAvailable(int start, int end) {
    for (Map.Entry<Integer, Integer> entry : bookedSlot.entrySet()) {
      if (Math.max(start, entry.getKey()) < Math.min(end, entry.getValue()))
        return false;
    }
    return true;
  }

  public void bookedSlot(int start, int end) {
    if (!isAvailable(start, end))
      throw new IllegalArgumentException("Slot is already booked.");

    bookedSlot.put(start, end);
    System.out.println("Slot Booked Successfully!");
  }

  public void cancelSlot(int start, int end) {
    if (!bookedSlot.containsKey(start) || bookedSlot.get(start) != end) {
      throw new IllegalArgumentException("Booking does not exist.");
    }
    bookedSlot.remove(start);
    System.out.println("Successfully Cancelled the slot!");
  }

  public Map<Integer, Integer> getBookings() {
    return bookedSlot;
  }

  public String getRoomId() {
    return roomId;
  }
}
