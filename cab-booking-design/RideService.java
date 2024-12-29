import java.util.List;

public class RideService {
  FareCalStrategy fareCalStrategy;
  CabBookingSystem cabBookingSystem;

  public RideService(FareCalStrategy fareCalStrategy) {
    this.fareCalStrategy = fareCalStrategy;
    this.cabBookingSystem = new CabBookingSystem();
  }

  // Find Ride:
  public Driver findRide(Location location, int radius) {
    List<Driver> availableDriver = cabBookingSystem.getAvailableDriverByLocation(location, radius);

    if (availableDriver.size() == 0) {
      System.out.println("It's Seems busy than usual, please try again!");
      return null;
    }

    return availableDriver.get(0);
  }

  // Book Ride:
  public Ride bookRide(Location location, int radius) {
    Driver driver = findRide(location, radius);
    if (driver == null) {
      System.out.println("It's Seems busy than usual, please try again!");
      return null;
    }

    driver.setAvailability(false);

    return null;
  }
}