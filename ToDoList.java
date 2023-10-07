import java.util.ArrayList;

class ToDoList {
    ArrayList<Task> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    // Method to add a task to the list
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Method to remove a task from the list
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    // Method to display all tasks in the list
    public void displayTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println((i + 1) + ". " + task.name + " - " + task.description + " (" + (task.isCompleted ? "Completed" : "Not Completed") + ")");
        }
    }

    // Method to mark a task as completed
    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.isCompleted = true;
        } else {
            System.out.println("Invalid task index.");
        }
    }
    
}

