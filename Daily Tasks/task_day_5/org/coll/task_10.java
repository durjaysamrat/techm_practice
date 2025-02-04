//10. Write a Java program to shuffle elements in an array list.
package org.coll;
import java.util.ArrayList;
import java.util.Collections;
public class task_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> color = new ArrayList<>();
     color.add("red");
     color.add("Green");
     color.add("Blue");
     System.out.println(color);
     Collections.shuffle(color);
     System.out.println(color);
	}

}
