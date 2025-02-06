//2. Write a Java program to convert a list of strings to uppercase or lowercase using streams.
package streams_java;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class task_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List<String> str= Arrays.asList("apples","Apricot","Orange");
   List<String> uppercased = str.stream().map(String::toUpperCase).collect(Collectors.toList());
   System.out.println("uppercase"+uppercased);
   List<String> lowercased = lowercased = uppercased.stream().map(String::toLowerCase).collect(Collectors.toList());
   System.out.println("Lowercase"+lowercased);
   
	}

}
