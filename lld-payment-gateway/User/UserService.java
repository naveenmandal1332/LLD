package User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

  List<User> users = new ArrayList<>();

  public void addUser(User user) {
    users.add(user);
    System.out.println("User Added Successfully  with the user id: " + user.getUserId());
  }

  public User getUser(int userId, String email) {
    for (User user : users) {
      if (user.getUserId() == userId || user.getEmail().equals(email)) {
        return user;
      }
    }

    System.out.println("User Does not found with this user id or email " + userId + " " + email);
    return null;
  }

  public List<User> getAllUser() {
    return users;
  }
}