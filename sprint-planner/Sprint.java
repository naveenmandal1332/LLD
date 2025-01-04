import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sprint {

  private final String id;
  private String title;
  private Date startDate;
  private Date endDate;
  private final int MAX_SIZE;
  Map<String, Task> tasks;

  public Sprint(String id, String title, Date startDate, Date endDate, int MAX_SIZE) {
    this.id = id;
    this.title = title;
    this.startDate = startDate;
    this.endDate = endDate;
    this.MAX_SIZE = MAX_SIZE;
    tasks = new HashMap<>();
  }

  // add task
  public void addTask(Task task) {
    if (tasks.size() >= MAX_SIZE)
      throw new IllegalStateException("Sprint is Full.. You cannot add new task!");

    tasks.put(task.getId(), task);
    System.out.println("Task Added with this id: " + task.getId());
  }

  // remove task
  public void removeTask(String taskId) {
    if (!tasks.containsKey(taskId))
      throw new IllegalArgumentException("Task Not Found !");

    tasks.remove(taskId);
    System.out.println("Task Removed successfully! " + taskId);
  }

  public void changeTaskStatus(String taskId, Status newStatus) {
    Task task = tasks.get(taskId);
    if (task == null)
      throw new IllegalStateException("Task Not Found!");

    if (!isStatusChangeAllowed(task.getStatus(), newStatus))
      throw new IllegalArgumentException("Status change not allowed from " + task.getStatus() + " to " + newStatus);

    long inProgressCount = tasks.values().stream()
        .filter(t -> t.getAssignTo().equals(task.getAssignTo()) && t.getStatus() == Status.IN_PROGRESS).count();

    if (newStatus == Status.IN_PROGRESS && inProgressCount >= 2)
      throw new IllegalArgumentException("Two Task is Already in progress!");

    task.setStatus(newStatus);
    System.out.println("Task Status Changed Successfully!");
  }

  public void assignTaskToUser(Task task, String userId) {
    if (!tasks.containsKey(task.getId()))
      throw new IllegalArgumentException("Task Not Found !");

    task.setAssignTo(userId);
    System.out.println("Task with id: " + task.getId() + " Assign To User with id: " + userId);
  }

  public List<Task> getTaskAssignedToUser(String userId) {
    List<Task> task = new ArrayList<>();
    for (Task t : tasks.values()) {
      if (t.getAssignTo().equals(userId)) {
        task.add(t);
      }
    }
    return task;
  }

  public List<Task> getDelayedTask() {
    List<Task> task = new ArrayList<>();
    Date currentDate = new Date();

    for (Task t : tasks.values()) {
      if (t.getStatus() != Status.DONE && t.getDueDate().before(currentDate)) {
        task.add(t);
      }
    }

    return task;
  }

  public boolean isStatusChangeAllowed(Status currentStatus, Status newStatus) {
    return (currentStatus == Status.TODO && newStatus == Status.IN_PROGRESS) ||
        (currentStatus == Status.IN_PROGRESS && (newStatus == Status.TODO || newStatus == Status.DONE));
  }

  public String getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public Date getStartDate() {
    return startDate;
  }

  public Date getEndDate() {
    return endDate;
  }
}