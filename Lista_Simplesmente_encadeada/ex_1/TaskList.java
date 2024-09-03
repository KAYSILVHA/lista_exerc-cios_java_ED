package Lista_Simplesmente_encadeada.ex_1;

public class TaskList {
    private Task head;

    public TaskList() {
        this.head = null;
    }

    public void addTask(String description) {
        Task newTask = new Task(description);
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
    }

    public void removeTask(String description) {
        if (head == null) return;

        if (head.description.equals(description)) {
            head = head.next;
            return;
        }

        Task current = head;
        while (current.next != null && !current.next.description.equals(description)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void markTaskAsCompleted(String description) {
        Task current = head;
        while (current != null) {
            if (current.description.equals(description)) {
                current.markAsCompleted();
                return;
            }
            current = current.next;
        }
    }

    public void listTasks() {
        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
}
