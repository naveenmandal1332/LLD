public class Main {

  public static void main(String[] args) {

    Auction auctionOne = new Auction();

    Bidder b1 = new Bidder("Naveen", auctionOne);
    Bidder b2 = new Bidder("Vishal", auctionOne);
    Bidder b3 = new Bidder("Aman", auctionOne);
    Bidder b4 = new Bidder("Bharti", auctionOne);

    b1.placeBid(5000);
    b2.placeBid(2000);

    // Auction auctionTwo = new Auction();

    // Bidder b5 = new Bidder("Akash", auctionTwo);
    // Bidder b6 = new Bidder("Jaanvi", auctionTwo);

    // b6.placeBid(5000);

  }
}