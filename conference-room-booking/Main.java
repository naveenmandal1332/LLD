public class Main {

  public static void main(String[] args) {
    ConferenceRoomService service = new ConferenceRoomService();

    service.addBuilding("b1");
    service.addFloor("b1", "1");
    service.addConferenceRoom("b1", "1", "c1");

    service.addBuilding("b2");
    service.addFloor("b2", "2");
    service.addConferenceRoom("b2", "2", "c2");

    service.bookRoom("b1", "1", "c1", 1, 5);
    service.bookRoom("b2", "2", "c2", 6, 10);

    System.out.println("List of Rooms:");
    service.listRooms().forEach(System.out::println);

    System.out.println("\nList of Bookings:");
    service.listBookings().forEach(System.out::println);

    System.out.println("\nSuggestions for 3:10:");
    service.suggestSlots(3, 10).forEach(System.out::println);

    service.cancelBooking("b1", "1", "c1", 1, 5);

    System.out.println("\nList of Bookings after cancellation:");
    service.listBookings().forEach(System.out::println);
  }
}