package org.coll;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<String> colours = new ArrayList<>();
		colours.add("Blue");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String str=sc.next();
			colours.add(str);
		}
		System.out.println(colours);

	}

}
