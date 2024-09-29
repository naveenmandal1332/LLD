package state;

import java.util.ArrayList;
import java.util.List;

import vending.*;

public class IdleState implements State {
  public IdleState() {
    System.out.println("Vending Maching is currently at Idle State!");
  }

  IdleState(VendingMachine machine) {
    System.out.println("Vending Maching is currently at Idle State!");
    machine.setCoinList(new ArrayList<>());
  }

  @Override
  public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
    machine.setVendingMachineState(new HasMoney());
  }

  @Override
  public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
    throw new Exception("Vending Maching is currently at Idle State, You cannot select product now!");
  }

  @Override
  public void chooseProduct(VendingMachine machine, int code) throws Exception {
    throw new Exception("Vending Maching is currently at Idle State, You cannot choose product right now!");
  }

  @Override
  public int getChange(int changeMoney) throws Exception {
    throw new Exception("You cannot get change in idle state!");
  }

  @Override
  public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
    throw new Exception("You cannot insert coin in idle state!");
  }

  @Override
  public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
    throw new Exception("You cannot dispense product in idle state!");
  }

  @Override
  public List<Coin> returnFullMoney(VendingMachine vendingMachine) throws Exception {
    throw new Exception("You cannot get refund  in idle state!");

  }

  @Override
  public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception {
    vendingMachine.getInventory().addItem(item, codeNumber);
  }

}
