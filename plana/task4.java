package plana;
import java.util.Arrays;
public class task4 {
	public static void main(String args[]) {

	int[] source = {2,3,12,4,12};
	int[] destination1=Arrays.copyOfRange(source, 0, 4);
	
    System.out.println("destination1 = " + Arrays.toString(destination1));
}
}
