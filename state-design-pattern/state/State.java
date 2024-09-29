package state;

import java.util.List;
import vending.*;

public interface State {

  public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;

  public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception;

  public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;

  public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception;

  public int getChange(int changeMoney) throws Exception;

  public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception;

  public List<Coin> returnFullMoney(VendingMachine vendingMachine) throws Exception;

  public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception;

}