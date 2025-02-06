//5. Write a Java program to count the number of strings in a list that start with a specific letter using streams.
package streams_java;
import java.util.Arrays;
import java.util.List;

public class task_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> str=Arrays.asList("Apricot","orange","Apple","cherry");
      long count=str.stream().filter(s->s.startsWith("A")).count();
      System.out.println("count   :" +count);
	}

}
