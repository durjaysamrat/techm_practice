//18. Write a Java program to insert the specified element at the end of a linked list.
package org.coll;
import java.util.LinkedList;
public class task_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        //adds specific element at tail
        colors.offer("Yellow");
        System.out.println(colors);
	}

}
