public class Client
{
    public static void main(String[] args)
    {
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);
        Command logCommand1 = new LogCommand(infoHandler);
        Command logCommand2 = new LogCommand(debugHandler);
        Command logCommand3 = new LogCommand(errorHandler);
        Logger logger = new Logger();
        logger.addCommand(logCommand1);
        logger.addCommand(logCommand2);
        logger.addCommand(logCommand3);
        logger.processLogs();
    }
}
