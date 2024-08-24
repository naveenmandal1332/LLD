
// This is Auction - Mediator:
public interface AuctionMediator {

  void addBidder(Colleague bidder);

  void placeBid(Colleague bidder, int bidAmount);

  void countDown();

  void announceWinner(String name);

}