package org.coll;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;
public class task_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    List<String> col=new ArrayList<>();
    int a=sc.nextInt();
    for(int i=0;i<a;i++)
    {
    	String str=sc.next();
    	col.add(str);
    }
    Iterator itr =col.iterator();
    while(itr.hasNext()) {
    	Object elements = itr.next();
    	System.out.println(elements);
    }
    
	}

}
