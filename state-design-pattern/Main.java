
import state.State;
import vending.*;
import vending.Coin;

public class Main {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        try {
            System.out.println("|");
            System.out.println("filling up the inventory");
            System.out.println("|");

            fillUpInventory(vendingMachine);
            displayInventory(vendingMachine);

            System.out.println("|");
            System.out.println("clicking on ProductSelectionButton");
            System.out.println("|");

            State vendingState = vendingMachine.getVendingMachineState();
            vendingState.clickOnInsertCoinButton(vendingMachine);

            vendingState = vendingMachine.getVendingMachineState();
            vendingState.insertCoin(vendingMachine, Coin.NICKLE);
            vendingState.insertCoin(vendingMachine, Coin.DIME);

            System.out.println("|");
            System.out.println("clicking on ProductSelectionButton");
            System.out.println("|");

            vendingState.clickOnStartProductSelectionButton(vendingMachine);

            vendingState = vendingMachine.getVendingMachineState();
            vendingState.chooseProduct(vendingMachine, 100);

            displayInventory(vendingMachine);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception: " + e);
            displayInventory(vendingMachine);
        }

    }

    public static void fillUpInventory(VendingMachine vendingMachine) {
        ItemShelf[] slot = vendingMachine.getInventory().getInventory();

        for (int i = 0; i < slot.length; i++) {
            Item item = new Item();
            if (i >= 0 && i < 3) {
                item.setItemType(ItemType.COKE);
                item.setPrice(10);
            } else if (i >= 3 && i < 5) {
                item.setItemType(ItemType.PEPSI);
                item.setPrice(15);
            } else if (i >= 5 && i < 7) {
                item.setItemType(ItemType.JUICE);
                item.setPrice(20);
            } else if (i >= 7 && i < 10) {
                item.setItemType(ItemType.SODA);
                item.setPrice(5);
            }

            slot[i].setItem(item);
            slot[i].setSoldOut(false);
        }
    }

    private static void displayInventory(VendingMachine vendingMachine) {

        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
        for (int i = 0; i < slots.length; i++) {

            System.out.println("CodeNumber: " + slots[i].getCode() +
                    " Item: " + slots[i].getItem().getItemType().name() +
                    " Price: " + slots[i].getItem().getPrice() +
                    " isAvailable: " + !slots[i].getSoldOut());
        }
    }

}