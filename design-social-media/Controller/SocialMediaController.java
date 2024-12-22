package Controller;

import java.util.List;

import Model.Post;
import Model.User;
import Service.FeedService;
import Service.PostService;
import Service.UserService;

public class SocialMediaController {

  UserService userService;
  PostService postService;
  FeedService feedService;

  public SocialMediaController(UserService userService, PostService postService, FeedService feedService) {
    this.userService = userService;
    this.postService = postService;
    this.feedService = feedService;
  }

  public void registerUser(int userId, String name) {
    User user = new User(userId, name);
    userService.userRepository.addUser(user);
  }

  public void followUser(int userId, int followUserId) {
    userService.followUser(userId, followUserId);
  }

  public void unfollowUser(int userId, int unfollowUserId) {
    userService.unfollowUser(userId, unfollowUserId);
  }

  public void addPost(int userId, String title, String content) {
    postService.addPost(userId, title, content);
  }

  public void deletePost(int userId, int postId) {
    postService.deletePost(userId, postId);
  }

  public List<Post> getFeed(int userId) {
    return feedService.getFeed(userId);
  }
}