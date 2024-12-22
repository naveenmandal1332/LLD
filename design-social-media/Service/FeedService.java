package Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import Model.Post;
import Model.User;
import Repository.PostRepository;
import Repository.UserRepository;

public class FeedService {
  UserRepository userRepository;
  PostRepository postRepository;

  public FeedService(PostRepository postRepository, UserRepository userRepository) {
    this.postRepository = postRepository;
    this.userRepository = userRepository;
  }

  public List<Post> getFeed(int userId) {

    // Fetch User:
    User user = userRepository.getUser(userId);
    if (user == null)
      return new ArrayList<>();

    List<Post> feed = new ArrayList<>();
    feed.addAll(postRepository.getPost(userId));

    // Fetch It's Following:
    Set<Integer> followings = user.getFollowing();

    // Fetch All Post of following:
    for (int id : followings) {
      feed.addAll(postRepository.getPost(id));
    }

    return feed.stream().sorted((p1, p2) -> p2.getDateTime().compareTo(p1.getDateTime())).limit(10)
        .collect(Collectors.toList());
  }
}