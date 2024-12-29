import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CabBookingSystem {

  Map<String, Driver> drivers;
  Map<String, Rider> riders;

  public CabBookingSystem() {
    this.drivers = new HashMap<>();
    this.riders = new HashMap<>();
  }

  public void addDriver(Driver driver) {
    String driverId = driver.getId();
    drivers.put(driverId, driver);

    System.out.println("Successfully added this driver!");
    driver.toString();
  }

  public void addRider(Rider rider) {
    String riderId = rider.getId();
    riders.put(riderId, rider);

    System.out.println("Successfully added this rider!");
    rider.toString();
  }

  public List<Driver> getAvailableDriverByLocation(Location location, int radius) {
    List<Driver> availableDrivers = new ArrayList<>();
    for (Driver driver : drivers.values()) {
      if (driver.isAvailability() && driver.getLocation().distanceTo(location) <= radius) {
        availableDrivers.add(driver);
      }
    }

    return availableDrivers;
  }

  public Driver getDriverById(String id) {
    return drivers.get(id);
  }

  public Rider getRiderById(String id) {
    return riders.get(id);
  }
}