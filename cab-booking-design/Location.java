public class Location {

  private double latitude;
  private double longitude;

  public Location(double latitude, double longitude) {
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public double distanceTo(Location other) {
    double totalDistance = Math.pow(Math.abs(this.latitude - other.latitude), 2)
        + Math.pow(Math.abs(this.longitude - other.longitude), 2);

    return Math.sqrt(totalDistance);
  }

  @Override
  public String toString() {
    return "Location{" + "latitude=" + latitude + ", longitude=" + longitude + '}';
  }
}