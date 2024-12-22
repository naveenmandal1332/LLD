package Service;

import java.util.Date;
import java.util.List;
import java.util.Random;

import Repository.PostRepository;
import Model.Post;

public class PostService {

  PostRepository postRepository;

  public PostService(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public void addPost(int userId, String title, String content) {
    int postId = new Random().nextInt(1000);
    Date currentDateTime = new Date();

    Post newPost = new Post(postId, title, content, userId, currentDateTime);

    postRepository.addPost(userId, newPost);
  }

  public void deletePost(int userId, int postId) {
    postRepository.deletePost(userId, postId);
  }

  public List<Post> getPost(int userId) {
    return postRepository.getPost(userId);
  }
}