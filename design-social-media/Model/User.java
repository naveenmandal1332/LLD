package Model;

import java.util.HashSet;
import java.util.Set;

public class User {
  int userId;
  String name;
  Set<Integer> following;

  public User(int userId, String name) {
    this.userId = userId;
    this.name = name;
    this.following = new HashSet<>();
  }

  public int getUserId() {
    return userId;
  }

  public String getName() {
    return name;
  }

  public Set<Integer> getFollowing() {
    return following;
  }

  public void follow(int userId) {
    following.add(userId);
  }

  public void unfollow(int userId) {
    following.remove(userId);
  }
}