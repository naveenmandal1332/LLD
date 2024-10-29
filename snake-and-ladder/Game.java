import java.util.Deque;
import java.util.LinkedList;

public class Game {
  Board board;
  Dice dice;
  Deque<Player> playerList = new LinkedList<>();
  Player winner;

  public Game() {
    initializeGame();
  }

  private void initializeGame() {
    board = new Board(10, 5, 4);
    dice = new Dice(1);
    winner = null;

    addPlayer();
  }

  private void addPlayer() {
    Player p1 = new Player("Player-1", 0);
    Player p2 = new Player("Player-2", 0);

    playerList.add(p1);
    playerList.add(p2);

  }

  public void startGame() {
    while (winner == null) {
      // Check Player Turn:
      Player playerTurn = findPlayerTurn();
      System.out.println("player turn is: " + playerTurn.id + " current position is: " + playerTurn.currentPosition);

      // Rolled The Dice:
      int diceNumber = dice.rollDice();

      System.out.println("Dice value--> " + diceNumber);

      // Now Get The New Position:
      int playerNewPosition = playerTurn.currentPosition + diceNumber;
      playerNewPosition = jumpCheck(playerNewPosition);
      playerTurn.currentPosition = playerNewPosition;

      System.out.println("player turn is:" + playerTurn.id + " new Position is: " + playerNewPosition);

      // Check For Winning condition:
      if (playerNewPosition >= (board.cells.length * board.cells.length - 1)) {
        winner = playerTurn;
        System.out.println("WINNER IS:" + winner.id);
      }
    }
  }

  public Player findPlayerTurn() {
    Player playerTurn = playerList.removeFirst();
    playerList.addLast(playerTurn);
    return playerTurn;
  }

  public int jumpCheck(int playerNewPosition) {
    if (playerNewPosition > board.cells.length * board.cells.length - 1)
      return playerNewPosition;

    // Check For Snake & Ladder:
    Cell cell = board.getCell(playerNewPosition);
    if (cell.jump != null && cell.jump.start == playerNewPosition) {
      String jumpBy = cell.jump.start < cell.jump.end ? "Ladder" : "Snake";
      System.out.println("jump done by: " + jumpBy);
      return cell.jump.end;
    }
    return playerNewPosition;
  }
}