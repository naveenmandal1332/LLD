import java.util.Date;

public class Task {

  private final String id;
  private String title;
  private String description;
  private String assignTo;
  private TaskType taskType;
  private Status status;
  private Date dueDate;

  public Task(String id, String title, String description, TaskType taskType, Date dueDate) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.assignTo = null;
    this.taskType = taskType;
    this.status = Status.TODO;
    this.dueDate = dueDate;
  }

  public String getId() {
    return id;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public TaskType getTaskType() {
    return taskType;
  }

  public String getAssignTo() {
    return assignTo;
  }

  public void setAssignTo(String assignTo) {
    this.assignTo = assignTo;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }

  public void displayTask() {
    System.out.println("Task Id: " + id + " Title: " + title + " Description: " + " Assign To " + assignTo
        + " Task Type: " + taskType + " Status: " + status + " Due Date: " + dueDate);
  }
}