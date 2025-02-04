package Assignment1;
import java.util.Scanner;

public class Character_At_Odd_Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  for(int i=0;i<str.length();i++)
  { 
	  if(i%2!=0)
	  {
	  System.out.print(str.charAt(i));
	  }
  }
	}
}
