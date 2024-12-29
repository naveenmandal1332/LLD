public class Driver {

  private String id;
  private String name;
  private Location location;
  private boolean availability;

  public Driver(String id, String name, Location location) {
    this.id = id;
    this.name = name;
    this.location = location;
    this.availability = true;
  }

  public String getId() {
    return id;
  }

  public Location getLocation() {
    return location;
  }

  public void updateLocation(Location location) {
    this.location = location;
  }

  public boolean isAvailability() {
    return availability;
  }

  public void setAvailability(boolean availability) {
    this.availability = availability;
  }

  @Override
  public String toString() {
    return "Driver{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", location=" + location + '}';
  }
}