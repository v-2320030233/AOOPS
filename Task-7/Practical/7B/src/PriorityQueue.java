import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class PriorityQueue<T extends Comparable<T>>
{
    private ArrayList<T> heap;
    public PriorityQueue()
    {
        heap = new ArrayList<>();
    }
    public void enqueue(T item)
    {
        heap.add(item);
        Collections.sort(heap, Comparator.reverseOrder());
    }
    public T dequeue()
    {
        if (isEmpty())
        {
            throw new IllegalStateException("Priority queue is empty");
        }
        return heap.remove(0);
    }
    public T peek()
    {
        if (isEmpty())
        {
            throw new IllegalStateException("Priority queue is empty");
        }
        return heap.get(0);
    }
    public boolean isEmpty()
    {
        return heap.isEmpty();
    }
    public int size()
    {
        return heap.size();
    }
}
