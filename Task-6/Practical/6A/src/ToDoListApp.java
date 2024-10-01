import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ToDoListApp
{
    private List<String> toDoList;
    public ToDoListApp()
    {
        toDoList = new ArrayList<>();
    }
    public void addTask(String task)
    {
        toDoList.add(task);
        System.out.println("Task added: " + task);
    }
    public void updateTask(int index, String newDescription)
    {
        if (index >= 0 && index < toDoList.size())
        {
            toDoList.set(index, newDescription);
            System.out.println("Task updated at index " + index + ": " + newDescription);
        }
        else
        {
            System.out.println("Invalid index.");
        }
    }
    public void removeTask(int index)
    {
        if (index >= 0 && index < toDoList.size())
        {
            String removedTask = toDoList.remove(index);
            System.out.println("Task removed: " + removedTask);
        }
        else
        {
            System.out.println("Invalid index.");
        }
    }
    public void displayTasks()
    {
        System.out.println("To-Do List:");
        for (int i = 0; i < toDoList.size(); i++)
        {
            System.out.println((i + 1) + ". " + toDoList.get(i));
        }
    }
    public static void main(String[] args)
    {
        ToDoListApp toDoApp = new ToDoListApp();
        Scanner scanner = new Scanner(System.in);
        toDoApp.addTask("Go to the gym");
        toDoApp.addTask("Read a book");
        toDoApp.displayTasks();
        toDoApp.updateTask(1, "Read two books");
        toDoApp.displayTasks();
        toDoApp.removeTask(0);
        toDoApp.displayTasks();
        scanner.close();
    }
}
