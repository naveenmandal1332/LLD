import java.util.ArrayList;
import java.util.List;

import Vehicle.Vehicle;

public class Store {

  int storeId;
  VehicleInventory vehicleInventory;
  Location storeLocation;
  List<Reservation> reservations = new ArrayList<>();

  public Store(int storeId, Location storeLocation, VehicleInventory vehicleInventory) {
    this.storeId = storeId;
    this.storeLocation = storeLocation;
    this.vehicleInventory = vehicleInventory;
  }

  public List<Vehicle> getVehicle() {
    return vehicleInventory.getVehicleInventory();
  }

  public void setVehicle() {
    vehicleInventory.setVehicleInventory(getVehicle());
  }

  public Reservation createReservation(int id, User user, Vehicle vehicle) {

    // Check For Already Reservation:
    for (Reservation r : reservations) {
      if (r.vehicle.getVehicleNumber() == vehicle.getVehicleNumber()) {
        System.out.println("This Vehicle is already reserved! " + vehicle.getVehicleNumber());
        return null;
      }
    }

    Reservation r = new Reservation();
    r.createReservation(id, user, vehicle);
    reservations.add(r);

    System.out.println("Reservation successfully with ID: " + id);
    return r;
  }

  public boolean completeReservation(int reservationId) {
    for (Reservation res : reservations) {
      if (res.reservationId == reservationId)
        return true;
    }
    return false;
  }

  public void cancelReservation(int reservationId) {
    for (Reservation res : reservations) {
      if (res.reservationId == reservationId) {
        reservations.remove(res);
        System.out.println("Rservation cancelled with id: " + res.reservationId);
        return;
      }
    }

    System.out.println("No Rservation Found with this id: " + reservationId);
  }
}