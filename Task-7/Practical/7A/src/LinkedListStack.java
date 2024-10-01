class LinkedListStack<T> implements GenericStack<T>
{
    private static class Node<T>
    {
        T data;
        Node<T> next;   
        Node(T data)
        {
            this.data = data;
        }
    }
    private Node<T> top;
    @Override
    public void push(T element)
    {
        Node<T> newNode = new Node<>(element);
        newNode.next = top;
        top = newNode;
    }
    @Override
    public T pop()
    {
        if (isEmpty())
        {
            return null;
        }
        T data = top.data;
        top = top.next;
        return data;
    }
    @Override
    public T peek()
    {
        if (isEmpty())
        {
            return null;
        }
        return top.data;
    }
    @Override
    public boolean isEmpty()
    {
        return top == null;
    }
}