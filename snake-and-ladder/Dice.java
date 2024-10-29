import java.util.concurrent.ThreadLocalRandom;

public class Dice {
  int numberOfDice;
  int min = 1;
  int max = 6;

  public Dice(int numberOfDice) {
    this.numberOfDice = numberOfDice;
  }

  public int rollDice() {
    int totalSum = 0;
    int diceUsed = 0;

    while (diceUsed < numberOfDice) {
      totalSum += ThreadLocalRandom.current().nextInt(min, max + 1);
      diceUsed++;
    }

    return totalSum;
  }
}
