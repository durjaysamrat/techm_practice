//13. Write a Java program to iterate through all elements in a linked list starting at the specified position.
package org.coll;
import java.util.LinkedList;
public class task_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList<String> c=new LinkedList<>();
     c.add("Grey");
     c.add("Black");
     c.add("Blue");
     for(int col=1;col<c.size();col++)
     {
    	 System.out.println(c.get(col));
     }
    		 
     
    }

}
