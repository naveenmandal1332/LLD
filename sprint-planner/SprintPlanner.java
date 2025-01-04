import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SprintPlanner {

  private final Map<String, Sprint> sprints;
  private final Lock lock;

  public SprintPlanner() {
    this.sprints = new HashMap<>();
    this.lock = new ReentrantLock();
  }

  public void createSprint(String sprintId, String title, Date startDate, Date enDate, int size) {
    lock.lock();
    try {

      if (sprints.containsKey(sprintId))
        throw new IllegalStateException("This sprint is already exist!");

      Sprint sprint = new Sprint(sprintId, title, startDate, enDate, size);
      sprints.put(sprintId, sprint);
    } finally {
      lock.unlock();
    }
  }

  public void addTaskToSprint(String sprintId, Task task) {
    lock.lock();
    try {
      Sprint sprint = getSprint(sprintId);
      sprint.addTask(task);
    } finally {
      lock.unlock();
    }
  }

  public void assignTask(String sprintId, Task task, String userId) {
    lock.lock();
    try {
      Sprint sprint = getSprint(sprintId);
      sprint.assignTaskToUser(task, userId);
    } finally {
      lock.unlock();
      ;
    }
  }

  public void removeTaskFromSprint(String sprintId, String taskId) {
    lock.lock();
    try {
      Sprint sprint = getSprint(sprintId);
      sprint.removeTask(taskId);
    } finally {
      lock.unlock();
    }
  }

  public void changeTaskStatus(String sprintId, String taskId, Status newStatus) {
    lock.lock();
    try {
      Sprint sprint = getSprint(sprintId);
      sprint.changeTaskStatus(taskId, newStatus);
    } finally {
      lock.unlock();
    }
  }

  public List<Task> getTasksAssignedToUser(String sprintId, String userId) {
    lock.lock();
    try {
      Sprint sprint = getSprint(sprintId);
      return sprint.getTaskAssignedToUser(userId);
    } finally {
      lock.unlock();
    }
  }

  public List<Task> getDelayedTasks(String sprintId) {
    lock.lock();
    try {
      Sprint sprint = getSprint(sprintId);
      return sprint.getDelayedTask();
    } finally {
      lock.unlock();
    }
  }

  private Sprint getSprint(String sprintId) {
    Sprint sprint = sprints.get(sprintId);
    if (sprint == null) {
      throw new IllegalArgumentException("Sprint with this ID does not exist.");
    }
    return sprint;
  }
}