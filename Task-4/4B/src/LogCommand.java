public class LogCommand implements Command
{
    private final LogHandler handler;
    public LogCommand(LogHandler handler)
    {
        this.handler = handler;
    }
    @Override
    public void execute(String message, LogLevel level)
    {
        handler.handleRequest(message, level);
    }
}
