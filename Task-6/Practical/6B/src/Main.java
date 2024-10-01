public class Main
{
    public static void main(String[] args)
    {
        Integer[] intArray = {2, 3, 1, 5, 4};
        MinMax<Integer> intMinMax = new MinMaxImpl<>();
        System.out.println("Integer Array: ");
        System.out.println("Min: " + intMinMax.min(intArray));
        System.out.println("Max: " + intMinMax.max(intArray));    
        String[] strArray = {"apple", "orange", "banana", "pear"};
        MinMax<String> strMinMax = new MinMaxImpl<>();
        System.out.println("\nString Array: ");
        System.out.println("Min: " + strMinMax.min(strArray));
        System.out.println("Max: " + strMinMax.max(strArray));
        Character[] charArray = {'A', 'D', 'B', 'E', 'C'};
        MinMax<Character> charMinMax = new MinMaxImpl<>();
        System.out.println("\nCharacter Array: ");
        System.out.println("Min: " + charMinMax.min(charArray));
        System.out.println("Max: " + charMinMax.max(charArray));
        Float[] floatArray = {1.5f, 2.3f, 0.7f, 4.4f, 3.3f};
        MinMax<Float> floatMinMax = new MinMaxImpl<>();
        System.out.println("\nFloat Array: ");
        System.out.println("Min: " + floatMinMax.min(floatArray));
        System.out.println("Max: " + floatMinMax.max(floatArray));
    }
}