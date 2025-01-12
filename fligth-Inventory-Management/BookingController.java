import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public class BookingController {

  UserController userController;
  FlightController flightController;
  Map<String, Booking> bookings;

  public BookingController(UserController userController,
      FlightController flightController) {
    this.userController = userController;
    this.flightController = flightController;
    this.bookings = new HashMap<>();
  }

  public void bookFlight(String userId, String flightNumber, int departDate, String fareType, List<String> seats) {

    // Check User:
    User user = userController.getUserById(userId);
    if (user == null)
      throw new IllegalStateException("User Not Found!");

    // Check Seat Availability:
    Flight flight = flightController.searchFlightFrom("", "", departDate, seats.size()).stream()
        .filter(f -> f.toString().contains(flightNumber))
        .findFirst()
        .orElse(null);
    if (flight == null)
      throw new IllegalStateException("Flight Not Found!");

    // Check FareType:
    FareType fare = flight.getFareType(fareType);
    if (fare == null)
      throw new IllegalStateException("Fare Type Not Found!");

    // Calculate Fare:
    double totalFare = fare.getPrice() * seats.size();

    // Check Money:
    if (user.getFunds() < totalFare)
      throw new IllegalStateException("Insufficent balance!");

    // Book Seat:
    synchronized (fare) {
      if (!fare.bookSeats(seats)) {
        System.out.println("Some or all seat are already booked!");
        return;
      }
    }

    user.deductMoney(totalFare);
    String bookingId = UUID.randomUUID().toString();
    Booking booking = new Booking(bookingId, userId, flightNumber, departDate, fareType, seats, totalFare);
    bookings.put(bookingId, booking);

    System.out.println("Booking successfully!");
    return;
  }

  public Booking getBookingDetails(String bookingId) {
    return bookings.get(bookingId);
  }

  public List<Booking> getUserBookings(String userId) {
    return bookings.values().stream()
        .filter(booking -> booking.getUserId().equals(userId))
        .collect(Collectors.toList());
  }
}