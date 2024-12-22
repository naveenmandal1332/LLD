package Repository;

import java.util.HashMap;
import java.util.Map;

import Model.User;

public class UserRepository {
  Map<Integer, User> users;

  public UserRepository() {
    users = new HashMap<>();
  }

  public void addUser(User user) {
    int userId = user.getUserId();
    users.put(userId, user);
  }

  public User getUser(int userId) {
    return users.get(userId);
  }
}