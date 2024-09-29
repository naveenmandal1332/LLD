package state;

import java.util.List;

import vending.*;

public class DispenseState implements State {

  public DispenseState(VendingMachine vendingMachine, int codeNumber) throws Exception {
    System.out.println("Currently Vending Machine is in Dispense State!");
    dispenseProduct(vendingMachine, codeNumber);
  }

  @Override
  public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
    throw new Exception("Currently Vending Machine is in Dispense State, You cannot click insert coin button.");
  }

  @Override
  public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
    throw new Exception("Currently Vending Machine is in Dispense State, You cannot click insert coin button.");
  }

  @Override
  public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
    throw new Exception("Currently Vending Machine is in Dispense State, You cannot click insert coin");
  }

  @Override
  public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
    throw new Exception("Currently Vending Machine is in Dispense State, You cannot choose product");
  }

  @Override
  public int getChange(int changeMoney) throws Exception {
    throw new Exception("Currently Vending Machine is in Dispense State, You cannot get change");
  }

  @Override
  public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
    System.out.println("Product has been dispensed");

    Item product = vendingMachine.getInventory().getItem(codeNumber);
    vendingMachine.getInventory().updateSoldOutItem(codeNumber);
    vendingMachine.setVendingMachineState(new IdleState(vendingMachine));

    return product;
  }

  @Override
  public List<Coin> returnFullMoney(VendingMachine vendingMachine) throws Exception {
    throw new Exception("Currently Vending Machine is in Dispense State, You cannot get full return!");
  }

  @Override
  public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception {
    throw new Exception("Currently Vending Machine is in Dispense State, cannot update Inventory!");
  }
}
