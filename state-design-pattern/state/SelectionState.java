package state;

import java.util.List;

import vending.*;

public class SelectionState implements State {

  public SelectionState() {
    System.out.println("Currently Vending Machine is in Selection State!");
  }

  @Override
  public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
    throw new Exception("Currently Vending Machine is in Selection State, You cannot click insert coin button.");
  }

  @Override
  public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
    return;
  }

  @Override
  public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
    throw new Exception("Currently Vending Machine is in Selection State, You cannot insert coin.");
  }

  @Override
  public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
    Item product = vendingMachine.getInventory().getItem(codeNumber);
    // List<Coin> coinList = vendingMachine.getCoinList();

    int amountPaidByUser = 0;
    for (Coin coin : vendingMachine.getCoinList()) {
      amountPaidByUser += coin.value;
    }

    if (product.getPrice() > amountPaidByUser) {
      System.out.println("Insufficient Amount! You have paid this " + amountPaidByUser + " and product price is "
          + product.getPrice());

      returnFullMoney(vendingMachine);
      throw new Exception("Insufficient Money!");
    } else if (amountPaidByUser >= product.getPrice()) {
      amountPaidByUser -= product.getPrice();
      if (amountPaidByUser != 0)
        getChange(amountPaidByUser);

      vendingMachine.setVendingMachineState(new DispenseState(vendingMachine, codeNumber));
    }

  }

  @Override
  public int getChange(int changeMoney) throws Exception {
    System.out.println("Get Extra Money with amount " + changeMoney);
    return changeMoney;
  }

  @Override
  public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
    throw new Exception("Currently Vending Machine is in Selection State, product cannot dispense!");
  }

  @Override
  public List<Coin> returnFullMoney(VendingMachine vendingMachine) throws Exception {
    System.out.println("Refund Full Money!");
    vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
    return vendingMachine.getCoinList();
  }

  @Override
  public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception {
    throw new Exception("Currently Vending Machine is in Selection State, cannot update Inventory!");
  }
}
