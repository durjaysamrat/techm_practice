//11. Write a Java program to append the specified element to the end of a linked list.
package org.coll;
import java.util.LinkedList;
import java.util.Scanner;
public class task_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> colors = new LinkedList<>();
Scanner sc=new Scanner(System.in);   
colors.add("Red");
   colors.add("Blue");
   colors.add("Green");
   System.out.println(colors);
//append at last
   System.out.println("enter the element to append");
   String s=sc.next();
   colors.add(s);
   System.out.println(colors);
	}

}
