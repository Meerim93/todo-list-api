package qa.meerim;

import qa.meerim.models.Task;
import qa.meerim.services.TaskService;

import java.util.Scanner;

public class ConsoleApplication {
    public static void main(String[] args) {
        TaskService taskService = new TaskService();
        Scanner scanner = new Scanner(System.in);
        int userInput = -1;
        while (userInput != 0) {
            System.out.println("Please select an option below:");
            System.out.println("1. Get all tasks");
            System.out.println("2. Get a task");
            System.out.println("3. Add a task");
            System.out.println("4. Update a task");
            System.out.println("5. Delete a task");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            userInput = Integer.parseInt(scanner.nextLine());

            switch (userInput) {
                case 1:
                    System.out.println(taskService.getTodoList());
                    break;
                case 2:
                    System.out.print("Please provide and index: ");
                    int taskIndex = Integer.parseInt(scanner.nextLine());
                    System.out.println(taskService.getTask(taskIndex));
                    break;
                case 3:
                    System.out.print("Please provide a text for a task: ");
                    String taskText = scanner.nextLine();
                    Task task = new Task();
                    task.setText(taskText);
                    System.out.println(taskService.addTask(task));
                    break;
                case 4:
                    System.out.print("Please provide and index: ");
                    taskIndex = Integer.parseInt(scanner.nextLine());
                    System.out.print("Please provide a text for a task: ");
                    taskText = scanner.nextLine();
                    task = new Task();
                    task.setText(taskText);
                    System.out.println(taskService.updateTask(taskIndex, task));
                    break;
                case 5:
                    System.out.print("Please provide and index: ");
                    taskIndex = Integer.parseInt(scanner.nextLine());
                    System.out.println(taskService.deleteTask(taskIndex));
                    break;
                default:
                    System.out.println("Please select one of the options");
            }
        }
    }
}
