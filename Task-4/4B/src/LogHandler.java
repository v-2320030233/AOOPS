public abstract class LogHandler
{
    protected LogHandler nextHandler;
    public void setNextHandler(LogHandler nextHandler)
    {
        this.nextHandler = nextHandler;
    }
    public void handleRequest(String message, LogLevel level)
    {
        if (canHandle(level))
        {
            writeMessage(message);
        }
        else if (nextHandler != null)
        {
            nextHandler.handleRequest(message, level);
        }
    }
    protected abstract boolean canHandle(LogLevel level);
    protected abstract void writeMessage(String message);
}
