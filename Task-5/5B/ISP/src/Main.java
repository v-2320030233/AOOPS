public class Main
{
    public static void main(String[] args)
    {
        Worker humanWorker = new Human();
        humanWorker.work();
        Eater humanEater = (Eater) humanWorker;
        humanEater.eat();
        Worker robotWorker = new Robot();
        robotWorker.work();
    }
}