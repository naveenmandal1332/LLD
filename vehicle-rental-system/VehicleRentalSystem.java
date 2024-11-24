import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleRentalSystem {

  List<User> users;
  Map<Location, List<Store>> stores;

  public VehicleRentalSystem() {
    this.users = new ArrayList<>();
    this.stores = new HashMap<>();
  }

  public void addUser(User user) {
    users.add(user);
    System.out.println("User Added Successfully! with userId:  " + user.id);
  }

  public void removeUser(User user) {
    users.remove(user);
    System.out.println("Successfully Removed Users!");
  }

  public void displayUsers() {
    for (User user : users) {
      System.out
          .println("User Id: " + user.id + " | " + " User Name: " + user.name + " | " + " DL: " + user.drivingLicense);
    }
  }

  public void addStores(Location location, Store store) {
    List<Store> currStore = new ArrayList<>();
    if (stores.containsKey(location)) {
      currStore = stores.get(location);
    }
    currStore.add(store);

    System.out.println("Store Added!");
    stores.put(location, currStore);
  }

  public void getStoreByLocation(Location location) {
    if (!stores.containsKey(location))
      return;

    List<Store> locationVsStore = stores.get(location);
    for (Store currStore : locationVsStore) {
      System.out.println("Store Id: " + currStore.storeId + " | " + "State "
          + currStore.storeLocation.state
          + " City: " + currStore.storeLocation.city);
    }
  }

}