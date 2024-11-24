import java.util.List;

import Vehicle.Vehicle;

public class VehicleInventory {

  List<Vehicle> vehicles;

  public VehicleInventory(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }

  public void setVehicleInventory(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }

  public List<Vehicle> getVehicleInventory() {
    return vehicles;
  }
}