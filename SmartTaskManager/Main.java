package SmartTaskManager;

import SmartTaskManager.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        Executor executor = new Executor();

        while (true) {
            System.out.println("\n===== SMART TASK MANAGER =====");
            System.out.println("1. Add Priority Task");
            System.out.println("2. Add Timed Task");
            System.out.println("3. Show All Tasks");
            System.out.println("4. Execute All Tasks");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1 -> {
                    System.out.print("Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Description: ");
                    String desc = sc.nextLine();

                    System.out.print("Deadline (yyyy-mm-dd): ");
                    LocalDate date = LocalDate.parse(sc.nextLine());

                    System.out.print("Priority: ");
                    int priority = sc.nextInt();

                    Task task = new PriorityTask(id, desc, date, priority);
                    manager.addTask(task);

                    System.out.println("✅ Priority Task added");
                }

                case 2 -> {
                    System.out.print("Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Description: ");
                    String desc = sc.nextLine();

                    System.out.print("Deadline (yyyy-mm-dd): ");
                    LocalDate date = LocalDate.parse(sc.nextLine());

                    System.out.print("Duration (hours): ");
                    int duration = sc.nextInt();

                    Task task = new TimedTask(id, desc, date, duration);
                    manager.addTask(task);

                    System.out.println("✅ Timed Task added");
                }

                case 3 -> manager.AllTaskshowing();

                case 4 -> {
                    System.out.println("Executing tasks...");
                    manager.executeAllTasks(executor);
                    executor.Shutdown();
                }

                case 0 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice");
            }
        }
    }
}
