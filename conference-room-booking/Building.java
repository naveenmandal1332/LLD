import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Building {

  String buildingId;
  Map<String, Floor> floors;

  public Building(String buildingId) {
    this.buildingId = buildingId;
    floors = new HashMap<>();
  }

  public String getBuildingId() {
    return buildingId;
  }

  public void addFloor(Floor floor) {
    String floorId = floor.getFloorId();
    if (floors.containsKey(floorId))
      throw new IllegalArgumentException("This Floor is Already Exist!");

    floors.put(floorId, floor);
  }

  public Floor getFloor(String floorId) {
    if (!floors.containsKey(floorId))
      throw new IllegalArgumentException("Floor does not exist!");

    return floors.get(floorId);
  }

  public Collection<Floor> getFloors() {
    return floors.values();
  }
}
