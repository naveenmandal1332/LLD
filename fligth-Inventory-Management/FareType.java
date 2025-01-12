import java.util.List;
import java.util.Set;

public class FareType {
  private String type;
  private double price;
  private Set<String> availableSeats;

  public FareType(String type, double price, Set<String> availableSeats) {
    this.type = type;
    this.price = price;
    this.availableSeats = availableSeats;
  }

  public String getType() {
    return type;
  }

  public double getPrice() {
    return price;
  }

  public Set<String> getAvailableSeats() {
    return availableSeats;
  }

  public boolean bookSeats(List<String> seats) {
    if (!availableSeats.containsAll(seats))
      return false;

    availableSeats.removeAll(seats);
    return true;
  }
}