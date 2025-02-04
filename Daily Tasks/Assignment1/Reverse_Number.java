package Assignment1;
import java.util.Scanner;
public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int a1=a;
      int rev=0;
      while(a!=0)
      {
    	  int d=a%10;
    	  rev=rev*10+d;
    	  a=a/10;
      }
      System.out.println(a1);
      System.out.println(rev);
      
      
	}

}
