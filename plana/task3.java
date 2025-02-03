package plana;

import java.util.Arrays;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr1[] = {1,3,2,4,5};
      int arr2[] = {1,2,3,4,5};
      Object[] array1= {arr1};
      Object[] array2= {arr2};
      System.out.print("DeepEquals :");
      if(Arrays.deepEquals(array1, array2)) {
    	  System.out.println("Both are Equal");
      }
      else {
    	  System.out.println("Both are not equal");
      }
      System.out.print("Equals :");
      if(Arrays.equals(array1, array2))
      {
    	  System.out.println("Both are equal");
      }
      else {
    	  System.out.println("Both are not Equal");
      }
	}

}
