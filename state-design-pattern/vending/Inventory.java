package vending;

public class Inventory {
  ItemShelf[] inventory = null;

  Inventory(int itemCount) {
    inventory = new ItemShelf[itemCount];
    initializeEmptyInventory();
  }

  public ItemShelf[] getInventory() {
    return inventory;
  }

  public void setInventory(ItemShelf[] inventory) {
    this.inventory = inventory;
  }

  public void addItem(Item item, int itemCode) throws Exception {
    for (ItemShelf itemShelf : inventory) {
      if (itemShelf.getCode() == itemCode) {
        if (itemShelf.getSoldOut()) {
          itemShelf.setSoldOut(false);
          itemShelf.setItem(item);
        } else {
          throw new Exception("This product is already in shelf!");
        }
      }
    }
  }

  public Item getItem(int itemCode) throws Exception {
    for (ItemShelf itemShelf : inventory) {
      if (itemShelf.getCode() == itemCode) {
        if (itemShelf.getSoldOut()) {
          throw new Exception("This product is already sold out!");
        } else {
          return itemShelf.getItem();
        }
      }
    }

    throw new Exception("Wrong product code!");
  }

  public void updateSoldOutItem(int itemCode) {
    for (ItemShelf itemShelf : inventory) {
      if (itemShelf.getCode() == itemCode) {
        itemShelf.setSoldOut(true);
      }
    }
  }

  public void initializeEmptyInventory() {
    int startCode = 100;
    for (int i = 0; i < inventory.length; i++) {
      ItemShelf itemShelf = new ItemShelf();
      itemShelf.setCode(startCode);
      itemShelf.setSoldOut(false);
      inventory[i] = itemShelf;
      startCode++;
    }
  }

}