package Model;

import java.util.Date;

public class Post {

  int postId;
  String postTitle;
  String content;
  int userId;
  Date dateTime;

  public Post(int postId, String postTitle, String content, int userId, Date dateTime) {
    this.postId = postId;
    this.postTitle = postTitle;
    this.content = content;
    this.userId = userId;
    this.dateTime = dateTime;
  }

  public int getPostId() {
    return postId;
  }

  public String getPostTitle() {
    return postTitle;
  }

  public String getContent() {
    return content;
  }

  public int getUserId() {
    return userId;
  }

  public Date getDateTime() {
    return dateTime;
  }

}