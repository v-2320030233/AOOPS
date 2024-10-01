public class Main
{
    public static void main(String[] args)
    {
        GenericStack<Integer> linkedListStack = new LinkedListStack<>();
        linkedListStack.push(10);
        linkedListStack.push(20);
        linkedListStack.push(30);
        System.out.println("LinkedListStack Integer Peek: " + linkedListStack.peek());
        System.out.println("LinkedListStack Integer Pop: " + linkedListStack.pop());
        System.out.println("LinkedListStack Integer Peek after Pop: " + linkedListStack.peek());
        GenericStack<String> arrayStack = new ArrayStack<>(3);
        arrayStack.push("apple");
        arrayStack.push("banana");
        arrayStack.push("cherry");
        System.out.println("\nArrayStack String Peek: " + arrayStack.peek());
        System.out.println("ArrayStack String Pop: " + arrayStack.pop());
        System.out.println("ArrayStack String Peek after Pop: " + arrayStack.peek());
        GenericStack<Character> charStack = new LinkedListStack<>();
        charStack.push('A');
        charStack.push('B');
        charStack.push('C');
        System.out.println("\nLinkedListStack Character Peek: " + charStack.peek());
        System.out.println("LinkedListStack Character Pop: " + charStack.pop());
        System.out.println("LinkedListStack Character Peek after Pop: " + charStack.peek());
        GenericStack<Float> floatStack = new ArrayStack<>(2);
        floatStack.push(1.1f);
        floatStack.push(2.2f);
        System.out.println("\nArrayStack Float Peek: " + floatStack.peek());
        System.out.println("ArrayStack Float Pop: " + floatStack.pop());
        System.out.println("ArrayStack Float Peek after Pop: " + floatStack.peek());
    }
}
