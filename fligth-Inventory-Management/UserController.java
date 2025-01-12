import java.util.HashMap;
import java.util.Map;

public class UserController {

  Map<String, User> users;

  public UserController() {
    this.users = new HashMap<>();
  }

  public void addUser(User user) {
    users.put(user.getUserId(), user);
  }

  public User getUserById(String userId) {
    return users.get(userId);
  }
}