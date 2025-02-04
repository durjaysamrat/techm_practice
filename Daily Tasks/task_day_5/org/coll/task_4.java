package org.coll;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class task_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList ar=new ArrayList();
     Scanner sc=new Scanner(System.in);
     ar.add("java");
     ar.add(10);
     ar.add(20);
     ar.add(34f);
     System.out.println("enter the 1-3 where you want to edit");
     int n=sc.nextInt();
     System.out.println("enter the number");
     int p=sc.nextInt();
     ar.add(n,p);
     System.out.println(ar);
     }

}
