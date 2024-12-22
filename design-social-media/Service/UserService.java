package Service;

import Repository.UserRepository;

import java.util.Set;

import Model.User;

public class UserService {

  public UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void followUser(int userId, int followingId) {

    // Fetch The current user:
    User currentUser = userRepository.getUser(userId);

    // Fetch Following:
    Set<Integer> followings = currentUser.getFollowing();
    followings.add(followingId);
    System.out.println("You have followed this userId " + followingId + " Successfully!");
  }

  public void unfollowUser(int userId, int unfollowUserId) {
    User currentUser = userRepository.getUser(userId);

    // Fetch Following:
    Set<Integer> followings = currentUser.getFollowing();
    followings.remove(unfollowUserId);
    System.out.println("You have unfollow this userId " + unfollowUserId + " Successfully!");
  }
}