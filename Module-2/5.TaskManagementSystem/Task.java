public class Task {
    int taskId;
    String taskName;
    String status;
    Task next; // points to next task in the list

    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.next = null; // initially, no next node
    }

    @Override
    public String toString() {
        return "TaskID: " + taskId + ", Name: " + taskName + ", Status: " + status;
    }
}
