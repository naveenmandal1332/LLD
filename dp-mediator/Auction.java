import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator {
  List<Colleague> colleagues = new ArrayList<>();

  Colleague topBidder;
  int bidHighestAmount = 0;
  int count = 10;

  @Override
  public void addBidder(Colleague bidder) {
    colleagues.add(bidder);
  }

  @Override
  public void placeBid(Colleague bidder, int bidAmount) {

    if (bidAmount > bidHighestAmount) {
      topBidder = bidder;
      bidHighestAmount = bidAmount;
    }

    for (Colleague colleague : colleagues) {
      if (!colleague.getName().equals(bidder.getName())) {
        colleague.receivedBidNotification(bidAmount);
      }
    }

    // Start Count donw:
    countDown();
  }

  @Override
  public void countDown() {
    while (count > 0) {
      System.out.println("Count down: " + count);
      try {
        // Sleep for 1 second between each number
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        System.out.println("Countdown was interrupted.");
      }
      count--;
    }

    if (count == 0)
      announceWinner(topBidder.getName());

  }

  @Override
  public void announceWinner(String name) {
    System.out.println("Winner is " + name);
  }
}