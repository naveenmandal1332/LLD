import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConferenceRoomService {
  Map<String, Building> buildings;

  public ConferenceRoomService() {
    this.buildings = new HashMap<>();
  }

  public void addBuilding(String buildingId) {
    Building building = new Building(buildingId);
    if (buildings.containsKey(building.getBuildingId())) {
      throw new IllegalArgumentException("Building already exists.");
    }

    buildings.put(building.getBuildingId(), building);
  }

  public void addFloor(String buildingId, String floorId) {
    Building building = buildings.get(buildingId);
    if (building == null)
      throw new IllegalArgumentException("Building does not exists!");

    Floor floor = new Floor(floorId);
    building.addFloor(floor);
    System.out.println("Floor Number: " + floorId + " added successfully in building number " + buildingId);
  }

  public void addConferenceRoom(String buildingId, String floorId, String roomId) {
    Building building = buildings.get(buildingId);
    if (building == null)
      throw new IllegalArgumentException("Building does not exists!");

    Floor floor = building.getFloor(floorId);
    if (floor == null)
      throw new IllegalArgumentException("Floor does not exists!");

    ConferenceRoom room = new ConferenceRoom(roomId);
    floor.addConferenceRoom(room);

    System.out
        .println("Room number " + roomId + " added in floor id " + floorId + " in builiding number " + buildingId);
  }

  public List<String> listRooms() {
    List<String> result = new ArrayList<>();
    for (Building building : buildings.values()) {
      for (Floor floor : building.getFloors()) {
        for (ConferenceRoom room : floor.getRooms()) {
          result.add(String.format("%s %s %s %s", room.getRoomId(), floor.getFloorId(), building.getBuildingId(),
              room.getBookings()));
        }
      }
    }
    return result;
  }

  public void bookRoom(String buildingName, String floorNumber, String roomName, int start, int end) {
    if (end - start > 12) {
      throw new IllegalArgumentException("Booking cannot exceed 12 hours.");
    }
    Building building = getBuilding(buildingName);
    Floor floor = building.getFloor(floorNumber);
    ConferenceRoom room = floor.getRoom(roomName);
    room.bookedSlot(start, end);
  }

  public void cancelBooking(String buildingName, String floorNumber, String roomName, int start, int end) {
    Building building = getBuilding(buildingName);
    Floor floor = building.getFloor(floorNumber);
    ConferenceRoom room = floor.getRoom(roomName);
    room.cancelSlot(start, end);
  }

  public List<String> listBookings() {
    List<String> result = new ArrayList<>();
    for (Building building : buildings.values()) {
      for (Floor floor : building.getFloors()) {
        for (ConferenceRoom room : floor.getRooms()) {
          for (Map.Entry<Integer, Integer> booking : room.getBookings().entrySet()) {
            result.add(String.format("%s:%s %s %s %s", booking.getKey(), booking.getValue(), floor.getFloorId(),
                building.getBuildingId(), room.getRoomId()));
          }
        }
      }
    }
    return result;
  }

  public List<String> suggestSlots(int start, int end) {
    List<String> suggestions = new ArrayList<>();
    for (Building building : buildings.values()) {
      for (Floor floor : building.getFloors()) {
        for (ConferenceRoom room : floor.getRooms()) {
          for (int i = start; i < 24 && suggestions.size() < 3; i++) {
            if (room.isAvailable(i, i + (end - start))) {
              suggestions.add(String.format("%d:%d %s %s %s", i, i + (end - start), floor.getFloorId(),
                  building.getBuildingId(), room.getRoomId()));
            }
          }
        }
      }
    }
    return suggestions;
  }

  private Building getBuilding(String buildingName) {
    if (!buildings.containsKey(buildingName)) {
      throw new IllegalArgumentException("Building does not exist.");
    }
    return buildings.get(buildingName);
  }
}