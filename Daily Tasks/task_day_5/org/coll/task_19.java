//19. Write a Java program to insert some elements at the specified position into a linked list.
package org.coll;
import java.util.LinkedList;
public class task_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList<String> colors = new LinkedList<>();
     colors.add("Red");
     colors.add("Blue");
     colors.add("Green");
     
     
     colors.add(1,"Yellow");
     colors.add(2,"Purple");
     System.out.println(colors);
	}

}
