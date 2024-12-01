package User;

import java.util.List;
import java.util.Random;

public class UserController {
  UserService userService;

  public UserController() {
    this.userService = new UserService();
  }

  public User addUser(String name, String email) {
    User user = new User();
    user.setUserId(new Random().nextInt(100 - 10) + 10);
    user.setName(name);
    user.setEmail(email);

    userService.addUser(user);

    return user;
  }

  public User getUserByIdOrEmail(int userId, String email) {
    User user = userService.getUser(userId, email);
    System.out.println("Successfully Get user by id: " + user.getUserId() + " Name: " + user.getName());
    return user;
  }

  public List<User> getAllUsers() {
    List<User> users = userService.getAllUser();
    for (User user : users) {
      System.out.println("User Id: " + user.getUserId() + " Name: " + user.getName());
    }

    return users;
  }
}