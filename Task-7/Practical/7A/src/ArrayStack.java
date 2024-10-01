class ArrayStack<T> implements GenericStack<T>
{
    private T[] array;
    private int top;
    private int capacity;    
    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity)
    {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        this.top = -1;
    }
    @Override
    public void push(T element)
    {
        if (top == capacity - 1)
        {
            throw new StackOverflowError("Stack is full");
        }
        array[++top] = element;
    }
    @Override
    public T pop()
    {
        if (isEmpty())
        {
            return null;
        }
        return array[top--];
    }
    @Override
    public T peek()
    {
        if (isEmpty())
        {
            return null;
        }
        return array[top];
    }
    @Override
    public boolean isEmpty()
    {
        return top == -1;
    }
}