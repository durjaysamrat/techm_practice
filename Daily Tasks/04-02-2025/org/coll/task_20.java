//20. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
package org.coll;
import java.util.LinkedList;
public class task_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedList<String> colors = new LinkedList<>();
    colors.add("Red");
    colors.add("Blue");
    colors.add("Green");
    colors.add("Yellow");
    colors.add("Blue");
    
    int firstIndex = colors.indexOf("Blue");
    int lastIndex = colors.lastIndexOf("Blue");
    
    System.out.println("First occurrence: " + firstIndex);
    System.out.println("Last occurrence: " + lastIndex);
	}

}
