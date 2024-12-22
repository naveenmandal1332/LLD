package Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Model.Post;

public class PostRepository {
  Map<Integer, List<Post>> userPosts;

  public PostRepository() {
    this.userPosts = new HashMap<>();
  }

  public void addPost(int userId, Post post) {
    List<Post> prevPost = new ArrayList<>();
    if (userPosts.containsKey(userId)) {
      prevPost = userPosts.get(userId);
    }

    prevPost.add(post);
    userPosts.put(userId, prevPost);
  }

  public void deletePost(int userId, int postId) {
    if (userPosts.containsKey(userId)) {
      System.out.println("This user does not created any post ever!");
      return;
    }

    List<Post> userCurrentPosts = userPosts.get(userId);
    for (Post post : userCurrentPosts) {
      if (post.getPostId() == postId) {
        userCurrentPosts.remove(post);
        System.out.println("Post Deleted Successfullyt!");
        return;
      }
    }

    System.out.println("Post not found!");
  }

  public List<Post> getPost(int userId) {
    if (!userPosts.containsKey(userId)) {
      System.out.println("This user does not created any post ever!");
      return new ArrayList<>();
    }

    return userPosts.get(userId);
  }
}