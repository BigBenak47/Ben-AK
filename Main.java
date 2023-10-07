import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        while (true) {
            // Display options to the user
            System.out.println("Options:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Mark Task as Completed");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline after nextInt()

            switch (choice) {
                case 1:
                    // Get task details from the user and add it to the to-do list
                    System.out.print("Enter task name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    toDoList.addTask(new Task(name, description));
                    break;
                case 2:
                    // Get task index to remove and remove it from the list
                    System.out.print("Enter the task index to remove: ");
                    int indexToRemove = scanner.nextInt();
                    scanner.nextLine();
                    toDoList.removeTask(indexToRemove - 1);
                    break;
                case 3:
                    // Display all tasks in the list
                    toDoList.displayTasks();
                    break;
                case 4:
                    // Get task index to mark as completed and mark it as completed
                    System.out.print("Enter the task index to mark as completed: ");
                    int indexToMark = scanner.nextInt();
                    scanner.nextLine();
                    toDoList.markTaskAsCompleted(indexToMark - 1);
                    break;
                case 5:
                    // Exit the application
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
