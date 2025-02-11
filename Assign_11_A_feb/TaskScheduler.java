public class Main {
public static void main(String[] args) {
TaskScheduler scheduler = new TaskScheduler();
scheduler.addTask(1, "Task 1", 3, "2025-02-11", null);
scheduler.addTask(2, "Task 2", 2, "2025-02-12", null);
scheduler.addTask(3, "Task 3", 1, "2025-02-13", null);
System.out.println(scheduler.displayTasks());
scheduler.moveToNextTask();
System.out.println(scheduler.viewNextTask());
System.out.println(scheduler.removeTask(2));
System.out.println(scheduler.displayTasks());
System.out.println(scheduler.searchByPriority(1));
}
}
class TaskNode {
int taskId;
String taskName;
int priority;
String dueDate;
TaskNode next;
public TaskNode(int taskId, String taskName, int priority, String dueDate) {
this.taskId = taskId;
this.taskName = taskName;
this.priority = priority;
this.dueDate = dueDate;
this.next = null;
}
}
class TaskScheduler {
TaskNode head;
public TaskScheduler() {
this.head = null;
}
public void addTask(int taskId, String taskName, int priority, String dueDate, Integer position) {
TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);
if (head == null) {
head = newTask;
newTask.next = head;
} else {
if (position == null) {
TaskNode current = head;
while (current.next != head) {
current = current.next;
}
current.next = newTask;
newTask.next = head;
} else {
TaskNode current = head;
int index = 1;
while (index < position && current.next != head) {
current = current.next;
index++;
}
newTask.next = current.next;
current.next = newTask;
}
}
}
public String removeTask(int taskId) {
if (head == null) {
return "No tasks to remove";
}
TaskNode current = head;
TaskNode previous = null;
while (current.next != head) {
if (current.taskId == taskId) {
if (previous != null) {
previous.next = current.next;
} else {
TaskNode last = head;
while (last.next != head) {
last = last.next;
}
head = current.next;
last.next = head;
}
return "Task " + taskId + " removed";
}
previous = current;
current = current.next;
}
if (current.taskId == taskId) {
if (previous != null) {
previous.next = current.next;
} else {
head = null;
}
return "Task " + taskId + " removed";
}
return "Task " + taskId + " not found";
}
public String viewNextTask() {
if (head == null) {
return "No tasks available";
}
return head.taskName;
}
public void moveToNextTask() {
if (head != null) {
head = head.next;
}
}
public String displayTasks() {
if (head == null) {
return "No tasks to display";
}
StringBuilder tasks = new StringBuilder();
TaskNode current = head;
do {
tasks.append("Task ID: ").append(current.taskId)
.append(", Name: ").append(current.taskName)
.append(", Priority: ").append(current.priority)
.append(", Due Date: ").append(current.dueDate).append("\n");
current = current.next;
} while (current != head);
return tasks.toString();
}
public String searchByPriority(int priority) {
if (head == null) {
return "No tasks available";
}
StringBuilder tasks = new StringBuilder();
TaskNode current = head;
do {
if (current.priority == priority) {
tasks.append("Task ID: ").append(current.taskId)
.append(", Name: ").append(current.taskName)
.append(", Due Date: ").append(current.dueDate).append("\n");
}
current = current.next;
} while (current != head);
return tasks.length() > 0 ? tasks.toString() : "No tasks found with that priority";
}
}
