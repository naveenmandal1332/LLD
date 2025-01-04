import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    SprintPlanner sprintPlanner = new SprintPlanner();

    // Create Sprint:
    sprintPlanner.createSprint("SP01", "Sprint-One", null, null, 5);

    // Create Task:
    LocalDate localDate = LocalDate.of(2025, 1, 2);
    Date dueDate = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    Task task1 = new Task("T01", "This is First Task", "Testing", TaskType.FEATURE, dueDate);
    Task task2 = new Task("T02", "This is second Task", "Testing", TaskType.BUG, dueDate);
    Task task3 = new Task("T03", "This is Third Task", "Testing", TaskType.FEATURE, dueDate);

    sprintPlanner.addTaskToSprint("SP01", task1);
    sprintPlanner.addTaskToSprint("SP01", task2);
    sprintPlanner.addTaskToSprint("SP01", task3);

    // Assign Task to Users:
    sprintPlanner.assignTask("SP01", task1, "U01");
    sprintPlanner.assignTask("SP01", task2, "U01");
    sprintPlanner.assignTask("SP01", task3, "U01");

    // Change Task Status:
    sprintPlanner.changeTaskStatus("SP01", "T01", Status.IN_PROGRESS);
    sprintPlanner.changeTaskStatus("SP01", "T02", Status.IN_PROGRESS);
    sprintPlanner.changeTaskStatus("SP01", "T01", Status.DONE);

    // Fetch Task of Users:
    List<Task> tasks = sprintPlanner.getTasksAssignedToUser("SP01", "U01");
    for (Task task : tasks) {
      task.displayTask();
    }

    // Fetch Delayed Task:
    System.out.println("Delayed Task:");
    List<Task> dealyedTasks = sprintPlanner.getDelayedTasks("SP01");
    for (Task task : dealyedTasks) {
      task.displayTask();
    }
  }
}