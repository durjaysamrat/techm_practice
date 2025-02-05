package org.coll;
import java.util.ArrayList;
import java.util.Collections;
public class task_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Integer> no=new ArrayList<>();
    no.add(20);
    no.add(200);
    no.add(200000);
    no.add(0);
    no.add(1);
    
    System.out.println(no);
    Collections.sort(no);
    System.out.println(no);

	}

}
