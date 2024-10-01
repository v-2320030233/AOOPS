public class PriorityQueueTest
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> intQueue = new PriorityQueue<>();
        intQueue.enqueue(10);
        intQueue.enqueue(5);
        intQueue.enqueue(30);
        System.out.println("Highest priority (Integer): " + intQueue.peek());
        System.out.println("Dequeue (Integer): " + intQueue.dequeue());
        PriorityQueue<Double> doubleQueue = new PriorityQueue<>();
        doubleQueue.enqueue(2.5);
        doubleQueue.enqueue(9.1);
        doubleQueue.enqueue(4.3);
        System.out.println("Highest priority (Double): " + doubleQueue.peek());
        System.out.println("Dequeue (Double): " + doubleQueue.dequeue());
        PriorityQueue<String> stringQueue = new PriorityQueue<>();
        stringQueue.enqueue("apple");
        stringQueue.enqueue("orange");
        stringQueue.enqueue("banana");
        System.out.println("Highest priority (String): " + stringQueue.peek());
        System.out.println("Dequeue (String): " + stringQueue.dequeue());
    }   
}
