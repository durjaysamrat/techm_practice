//1. Write a Java program to calculate the average of a list of integers using streams.
package streams_java;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Average");
    List <Integer> no=Arrays.asList(1,2,3,4,5);
    double a= no.stream().mapToInt(Integer::intValue).average().orElse(0);
    System.out.println(a);
		
		
	}

}
