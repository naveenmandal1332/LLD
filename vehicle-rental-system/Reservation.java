import java.util.Date;

import Vehicle.Vehicle;

public class Reservation {
  int reservationId;
  User user;
  Vehicle vehicle;
  Date bookingDate;
  Date dateBookedFrom;
  Date dateBookedTo;
  Long fromTimeStamp;
  Long toTimeStamp;
  Location pickUpLocation;
  Location dropLocation;
  ReservationType reservationType;
  ReservationStatus reservationStatus;
  Location location;

  public int createReservation(int reservationId, User user, Vehicle vehicle) {
    this.reservationId = reservationId;
    this.user = user;
    this.vehicle = vehicle;
    this.reservationType = reservationType.DAILY;
    this.reservationStatus = reservationStatus.SCHEDULED;

    return reservationId;
  }
}