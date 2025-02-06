//3. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
package streams_java;
import java.util.Arrays;
import java.util.List;
public class task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer>no=Arrays.asList(9,8,7,6,5,4,3,2,1,12,1,3,4,5,6,7,8,9);
int eve=no.stream().filter(n ->n%2==0).mapToInt(Integer::intValue).sum();
int odd=no.stream().filter(n->n%2!=0).mapToInt(Integer::intValue).sum();
System.out.println("even :"+eve);
System.out.println("odd :"+odd);
	}

}
