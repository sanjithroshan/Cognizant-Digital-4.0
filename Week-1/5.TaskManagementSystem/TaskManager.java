public class TaskManager {
    Task head = null;

    // Add task to end of list
    public void addTask(Task newTask) {
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
        System.out.println("Task added: " + newTask.taskName);
    }

    // Search task by ID
    public Task searchTask(int id) {
        Task current = head;
        while (current != null) {
            if (current.taskId == id) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Traverse and list all tasks
    public void listTasks() {
        System.out.println("\n-- Task List --");
        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    // Delete task by ID
    public void deleteTask(int id) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.taskId == id) {
            head = head.next;
            System.out.println("Task with ID " + id + " deleted.");
            return;
        }

        Task current = head;
        Task prev = null;
        while (current != null && current.taskId != id) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Task with ID " + id + " not found.");
        } else {
            prev.next = current.next;
            System.out.println("Task with ID " + id + " deleted.");
        }
    }
}
