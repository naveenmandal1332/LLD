import strategy.DriveStrategy;

public class Vehicle {
  // Vehicle Has a drive Interface:
  DriveStrategy driveObject;

  // This is known as constructor injection:
  Vehicle(DriveStrategy driveObject) {
    this.driveObject = driveObject;
  }

  // Method to execute drive capability:
  public void drive() {
    driveObject.drive();
  }
}