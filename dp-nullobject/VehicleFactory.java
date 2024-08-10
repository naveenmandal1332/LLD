public class VehicleFactory {

  static Vehicle getVehicleObject(String vehicleType) {
    if (vehicleType.equals("car"))
      return new Car();

    return new NullObject();
  }
}