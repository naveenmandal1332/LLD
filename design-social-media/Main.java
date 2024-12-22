import java.util.List;

import Controller.SocialMediaController;
import Model.Post;
import Repository.PostRepository;
import Repository.UserRepository;
import Service.FeedService;
import Service.PostService;
import Service.UserService;

public class Main {
  public static void main(String[] args) {
    // Repositories
    UserRepository userRepository = new UserRepository();
    PostRepository postRepository = new PostRepository();

    // Services
    UserService userService = new UserService(userRepository);
    PostService postService = new PostService(postRepository);
    FeedService feedService = new FeedService(postRepository, userRepository);

    // Controller
    SocialMediaController controller = new SocialMediaController(userService, postService, feedService);

    // Example Usage
    controller.registerUser(1, "Alice");
    controller.registerUser(2, "Bob");

    controller.addPost(1, "First Post", "Alice's first post");
    controller.addPost(2, "First Post", "Bob's first post");
    controller.followUser(1, 2);

    List<Post> feed = controller.getFeed(1);
    System.out.println("Feed for Alice:");
    // feed.forEach(post -> System.out.println(post.getContent()));
  }
}
