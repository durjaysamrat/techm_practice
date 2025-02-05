//14. Write a Java program to iterate a linked list in reverse order.
package org.coll;
import java.util.LinkedList;
public class task_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> no=new LinkedList<>();
no.add(10);
no.add(11);
no.add(12);
no.add(13);
no.add(14);
no.add(15);
System.out.println(no);
for(int i=no.size()-1;i>0;i--)
{
	System.out.println(no.get(i));
}
	}

}
