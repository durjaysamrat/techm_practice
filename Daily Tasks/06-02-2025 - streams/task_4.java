//4. Write a Java program to remove all duplicate elements from a list using streams.
package streams_java;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import java.util.List;
public class task_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> no=Arrays.asList(9,8,7,6,5,4,3,2,1,12,1,3,4,5,6,7,8,9);
List<Integer> un=no.stream().distinct().collect(Collectors.toList());
 System.out.println("unique Numbers"+un);
	}

}
