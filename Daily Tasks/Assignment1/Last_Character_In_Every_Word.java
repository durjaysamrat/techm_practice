package Assignment1;
import java.util.Scanner;
import java.lang.*; 

public class Last_Character_In_Every_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String str="Hey3 Java   Learners";
      
      for(int i=0;i<str.length();i++)
      {
    	 if(str.charAt(i)==' '||i==str.length()-1) {
    		 char c=str.charAt(i-1);
    	     	 if(!Character.isDigit(c)) {
    	     		 if(c!=' '&&i!=str.length()-1)
    	     		 {
    	     			 System.out.print(c);
    	     		 }
    	     		 if(i==str.length()-1)
    	     		 {
    	     			 char b=str.charAt(i);
    	     			 if(b!=' ')
    	     			 {
    	     				 System.out.print(b);
    	     			 }
    	     		 }
    	     	 }

    	 }
    	 }
      
	}

}
