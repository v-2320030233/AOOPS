import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class LambdaSortDescending
{
    public static void main(String[] args)
    {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("orange");
        strings.add("banana");
        strings.add("grape");
        Collections.sort(strings, (s1, s2) -> s2.compareTo(s1));
        System.out.println("Sorted list in descending order: " + strings);
    }
}
