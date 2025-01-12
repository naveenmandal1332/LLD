import java.util.Arrays;
import java.util.List;

public class FlightInventory {

  public static void main(String[] args) {

    // Controllers:
    UserController userController = new UserController();
    FlightController flightController = new FlightController();
    BookingController bookingController = new BookingController(userController, flightController);

    // Users:
    User user1 = new User("u1", "Vinit", 5000);
    User user2 = new User("u2", "Neha", 5000);

    userController.addUser(user1);
    userController.addUser(user2);

    // Flights:
    Flight f1 = new Flight("F101", "AirlineX", "DEL", "BLR", 2, 10.30);
    f1.addFareType("Economy", 1500, Arrays.asList("1A", "1B", "1C", "1D"));

    Flight f2 = new Flight("F102", "AirlineY", "BLR", "MBI", 2, 10.30);
    f2.addFareType("Business", 2500, Arrays.asList("1A", "1B", "1C", "1D"));

    flightController.addFlight(f1);
    flightController.addFlight(f2);

    // Search Flight:
    List<Flight> flights = flightController.searchFlight("", "BLR", 2, 1);
    for (Flight f : flights) {
      System.out.println(f.toString());
    }

    // Book Flight:
    bookingController.bookFlight("u1", "F102", 2, "Business", Arrays.asList("1A", "1B"));
    bookingController.bookFlight("u2", "F102", 2, "Business", Arrays.asList("1A", "1B"));

  }
}