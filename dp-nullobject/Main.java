public class Main {

  public static void main(String[] args) {

    VehicleFactory vehicle = new VehicleFactory();
    Vehicle car = vehicle.getVehicleObject("cars");

    System.out
        .println("Fuel Tank Size: " + car.getTankCapacity() + " : " + " Number of seat: " + car.getSeatCapacity());
  }
}