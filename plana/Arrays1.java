//task-1
package plana;

import java.util.Arrays;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] source = {1,2,3,4,5,6,7};
		int[] destination1 =new int[4];
		int[] destination2 =new int[4];
		int j=0;
		for(int i=0;i<source.length;i++)
		{
			destination1[j++]=source[i];
			i++;
		}
		j=0;
	    System.out.println("destination1 = " + Arrays.toString(destination1)); 
	    for(int i=0;i<7;i++)
	    {
        System.arraycopy(source, i, destination2,j++, 1);
        i++;
	    }
        System.out.println("destination2 = " + Arrays.toString(destination2));   

}
}