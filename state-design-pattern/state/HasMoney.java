package state;

import java.util.List;

import vending.*;

public class HasMoney implements State {

  public HasMoney() {
    System.out.println("Currently Vending Machine is in Has Money State!");
  }

  @Override
  public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
    return;
  }

  @Override
  public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
    System.out.println("Insert Coin!");
    vendingMachine.getCoinList().add(coin);
  }

  @Override
  public List<Coin> returnFullMoney(VendingMachine vendingMachine) throws Exception {
    System.out.println("Money has been fully refunded and back to Idle State!");
    vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
    return vendingMachine.getCoinList();
  }

  @Override
  public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
    vendingMachine.setVendingMachineState(new SelectionState());
  }

  @Override
  public int getChange(int changeMoney) throws Exception {
    throw new Exception("Currently Vending Machine is in Has Money State, You cannot get change!");
  }

  @Override
  public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
    throw new Exception("Currently Vending Machine is in Has Money State, You cannot dispense the product!");
  }

  @Override
  public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
    throw new Exception("Currently Vending Machine is in Has Money State, You cannot choose the product!");
  }

  @Override
  public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception {
    throw new Exception("Currently Vending Machine is in Has Money State, You cannot update Inventory!");
  }
}
