//16. Write a Java program to insert elements into the linked list at the first and last positions.
package org.coll;
import java.util.LinkedList;
public class task_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String>colors=new LinkedList<>();
colors.add("Red");
colors.add("Black");
colors.add("Grey");
System.out.println(colors);
colors.addFirst("Green");
colors.addLast("Blue");
System.out.println(colors);

	}

}
