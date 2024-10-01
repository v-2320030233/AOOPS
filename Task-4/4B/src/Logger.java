import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Logger
{
    private final List<Command> commands = new ArrayList<>();
    public void addCommand(Command command)
    {
        commands.add(command);
    }
    public void processLogs()
    {
        Iterator<Command> iterator = commands.iterator();
        while (iterator.hasNext())
        {
            Command command = iterator.next();
            command.execute("Processing log message...", LogLevel.INFO);
            command.execute("Processing debug message...", LogLevel.DEBUG);
            command.execute("Processing error message...", LogLevel.ERROR);
        }
    }
}
