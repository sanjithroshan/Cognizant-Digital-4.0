public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task(1, "Design UI", "Pending"));
        manager.addTask(new Task(2, "Write Backend", "In Progress"));
        manager.addTask(new Task(3, "Test Features", "Pending"));

        manager.listTasks();

        System.out.println("\n Searching for Task ID 2:");
        Task result = manager.searchTask(2);
        System.out.println(result != null ? result : "Task not found");

        System.out.println("\n Deleting Task ID 2...");
        manager.deleteTask(2);

        manager.listTasks();
    }
}
