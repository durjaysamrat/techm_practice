//15. Write a Java program to insert the specified element at the specified position in the linked list.
package org.coll;
import java.util.LinkedList;
import java.util.Scanner;
public class task_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedList<String> colors=new LinkedList<>();
    colors.add("Red");
    colors.add("GREY");
    colors.add("Pink");
    colors.add("Blue");
    colors.add("Yellow");
    Scanner sc=new Scanner(System.in);
    System.out.println(colors);
    System.out.println("Enter the position");
    int n=sc.nextInt();
    System.out.println("Enter the string");
    String n1=sc.next();
    colors.add(n,n1);
    System.out.println(colors);
	}

}
