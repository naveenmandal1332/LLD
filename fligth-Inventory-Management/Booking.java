import java.util.ArrayList;
import java.util.List;

public class Booking {

  private String bookingId;
  private String userId;
  private String flightNumber;
  private int departDate;
  private String fareType;
  private List<String> bookedSeats;
  private double totalCost;

  public Booking(String bookingId, String userId, String flightNumber, int departDate, String fareType,
      List<String> bookedSeats, double totalCost) {
    this.bookingId = bookingId;
    this.userId = userId;
    this.flightNumber = flightNumber;
    this.departDate = departDate;
    this.fareType = fareType;
    this.bookedSeats = new ArrayList<>(bookedSeats);
    this.totalCost = totalCost;
  }

  public String getUserId() {
    return userId;
  }

  @Override
  public String toString() {
    return String.format("BookingID: %s, User: %s, Flight: %s, Date: %d, FareType: %s, Seats: %s, TotalCost: %.2f",
        bookingId, userId, flightNumber, departDate, fareType, bookedSeats, totalCost);
  }
}