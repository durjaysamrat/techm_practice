//17. Write a Java program to insert the specified element at the front of a linked list.
package org.coll;
import java.util.LinkedList;
public class task_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   LinkedList<String> st=new LinkedList<>();
   st.add("RED");
   st.add("GREEN");
   st.add("BLUE");
   
   st.push("Black");
   System.out.println(st);
	}

}
