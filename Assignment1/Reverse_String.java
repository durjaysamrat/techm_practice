package Assignment1;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringBuilder s=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--)
		{
			char c=str.charAt(i);
			s.append(c);
		}
		System.out.println(s);
sc.close();
	}

}
