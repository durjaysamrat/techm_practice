package Assignment1;
import java.util.Scanner;
public class Space_Character_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       int c=0;
       int s=0;
       for(int i=0;i<str.length();i++)
       {
    	   if(str.charAt(i)==' ')
    	   {
    		   s++;
    	   }
    	   else {
    	   c++;
    	   }
       }
       System.out.println("No of Spaces " + s);
       System.out.println("No of Characters " + c);
	}

}
