import Vehicle.Vehicle;

public class Bill {

  Reservation reservation;
  double amount;
  boolean isPaid;

  public Bill(Reservation reservation, boolean isPaid) {
    this.reservation = reservation;
    this.isPaid = false;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public double computeBillAmount() {
    ReservationType type = reservation.reservationType;
    Vehicle vehicle = reservation.vehicle;

    double value = 0;

    if (type == ReservationType.DAILY) {
      value = vehicle.getDailyRentalCost();
    }

    if (type == ReservationType.HOURLY) {
      value = vehicle.getHourlyRentalCost();
    }

    // Set Amount:
    setAmount(value);

    return value;
  }
}