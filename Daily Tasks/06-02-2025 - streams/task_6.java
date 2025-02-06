//6. Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams;
package streams_java;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task_6 {
    public static void main(String[] args) throws Exception{
        List<String> strings = Arrays.asList("Apple", "Orange", "Grapes", "Cheery","Apricot","Pineapple");
        List<String> ascending = strings.stream().sorted().collect(Collectors.toList());
        List<String> descending = strings.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println("Ascending: " + ascending);
        System.out.println("Descending: " + descending);
    }
}