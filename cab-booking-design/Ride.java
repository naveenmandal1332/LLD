public class Ride {

  private Rider rider;
  private Driver driver;
  private Location pickupLocation;
  private Location dropLocation;
  private double fare;

  public Ride(Rider rider, Driver driver, Location pickLocation, Location dropLocation, double fare) {
    this.rider = rider;
    this.driver = driver;
    this.pickupLocation = pickLocation;
    this.dropLocation = dropLocation;
    this.fare = fare;
  }

  public Rider getRider() {
    return rider;
  }

  public Driver getDriver() {
    return driver;
  }

  public Location getPickupLocation() {
    return pickupLocation;
  }

  public Location getDropLocation() {
    return dropLocation;
  }

  public double getFare() {
    return fare;
  }

  @Override
  public String toString() {
    return "Ride{" +
        "rider=" + rider +
        ", driver=" + driver +
        ", startLocation=" + pickupLocation +
        ", endLocation=" + dropLocation +
        ", fare=" + fare +
        '}';
  }

}