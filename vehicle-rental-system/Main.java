import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import Vehicle.Status;
import Vehicle.Vehicle;
import Vehicle.VehicleType;

public class Main {

  public static void main(String[] args) {

    User user1 = new User("U01", "Naveen Mandal", "DL-ABC2345DFG");
    User user2 = new User("U02", "Vikash Mandal", "DL-ABC4567DFG");

    VehicleRentalSystem system = new VehicleRentalSystem();

    // User Added:
    system.addUser(user1);
    system.addUser(user2);

    system.displayUsers();

    // Vehicle Inventory:
    List<Vehicle> vehicles = new ArrayList<>();
    List<Vehicle> vehicles2 = new ArrayList<>();

    Vehicle v1 = new Vehicle();
    v1.setVehicleID(1);
    v1.setVehicleNumber("DL1RTC2376");
    v1.setVehicleType(VehicleType.CAR);
    v1.setCompanyName("Maruti Suzuki");
    v1.setModelName("Celerio");
    v1.setKmDriven(300000);
    v1.setManufacturingDate(getFormattedDate("2019-06-01"));
    v1.setAverage(70);
    v1.setCc(700);
    v1.setDailyRentalCost(2500);
    v1.setHourlyRentalCost(200);
    v1.setNoOfSeat(4);
    v1.setStatus(Status.ACTIVE);

    Vehicle v2 = new Vehicle();
    v2.setVehicleID(2);
    v2.setVehicleNumber("DL8CR1234");
    v2.setVehicleType(VehicleType.BIKE);
    v2.setCompanyName("Honda");
    v2.setModelName("CBR 250R");
    v2.setKmDriven(15000);
    v2.setManufacturingDate(getFormattedDate("2020-03-15"));
    v2.setAverage(30);
    v2.setCc(250);
    v2.setDailyRentalCost(1200);
    v2.setHourlyRentalCost(150);
    v2.setNoOfSeat(2);
    v2.setStatus(Status.ACTIVE);

    Vehicle v3 = new Vehicle();
    v3.setVehicleID(3);
    v3.setVehicleNumber("MH26MH6789");
    v3.setVehicleType(VehicleType.CAR);
    v3.setCompanyName("Tata Motors");
    v3.setModelName("Tata Ace");
    v3.setKmDriven(100000);
    v3.setManufacturingDate(getFormattedDate("2018-10-05"));
    v3.setAverage(15);
    v3.setCc(1400);
    v3.setDailyRentalCost(5000);
    v3.setHourlyRentalCost(400);
    v3.setNoOfSeat(2);
    v3.setStatus(Status.ACTIVE);

    vehicles.add(v1);
    vehicles.add(v2);

    vehicles2.add(v3);

    VehicleInventory vi1 = new VehicleInventory(vehicles);
    VehicleInventory vi2 = new VehicleInventory(vehicles);

    // Add Store:
    Location l1 = new Location("Ratiya Marg", "New Delhi", "Delhi", "110080");
    Location l2 = new Location("Bandra Marg", "Navi Mumbai", "Maharashtra", "125678");

    Store s1 = new Store(1, l1, vi1);
    Store s2 = new Store(2, l2, vi2);

    system.addStores(l1, s1);
    system.addStores(l2, s2);

    system.getStoreByLocation(l2);

    Reservation r1 = s1.createReservation(1, user1, v1);
    Reservation r2 = s2.createReservation(2, user2, v2);

    Bill b1 = new Bill(r1, true);
    double a1 = b1.computeBillAmount();

    Bill b2 = new Bill(r2, true);
    double a2 = b2.computeBillAmount();

    Payment p1 = new Payment();
    p1.makePayment(1, a1, PaymentMode.CASH);

    Payment p2 = new Payment();
    p2.makePayment(2, a2, PaymentMode.CASH);

  }

  public static Date getFormattedDate(String inputDate) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
    Date date = null;
    try {
      date = dateFormat.parse(inputDate);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return date;
  }
}