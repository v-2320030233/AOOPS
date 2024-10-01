import java.util.ArrayList;
import java.util.Scanner;
public class TaskManagementSystem
{
    private ArrayList<String> tasks;
    public TaskManagementSystem()
    {
        tasks = new ArrayList<>();
    }
    public void addTask(String task)
    {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }
    public void updateTask(int index, String newDescription)
    {
        if (index >= 0 && index < tasks.size())
        {
            tasks.set(index, newDescription);
            System.out.println("Task updated at index " + index + ": " + newDescription);
        }
        else
        {
            System.out.println("Invalid index.");
        }
    }
    public void removeTask(int index)
    {
        if (index >= 0 && index < tasks.size())
        {
            String removedTask = tasks.remove(index);
            System.out.println("Task removed: " + removedTask);
        }
        else
        {
            System.out.println("Invalid index.");
        }
    }
    public void displayTasks()
    {
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++)
        {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
    public static void main(String[] args)
    {
        TaskManagementSystem taskSystem = new TaskManagementSystem();
        Scanner scanner = new Scanner(System.in);
        taskSystem.addTask("Buy groceries");
        taskSystem.addTask("Complete assignment");
        taskSystem.displayTasks();
        taskSystem.updateTask(0, "Buy groceries and cook dinner");
        taskSystem.displayTasks();
        taskSystem.removeTask(1);
        taskSystem.displayTasks();
        scanner.close();
    }
}
