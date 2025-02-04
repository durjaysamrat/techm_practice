package Assignment1;
import java.util.Scanner;
public class Smallest_Vowel_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      s=s.toLowerCase();
      
      StringBuilder str =new StringBuilder();
      int min=10;
      char b=' ';
      for(int i=0;i<s.length();i++)
      {
    	  char c=s.charAt(i);
    	  if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
    	  {
    		  str.append(c);
    	  }
    	  for(int j=0;j<str.length();j++)
    	  {
    		  char a=str.charAt(j);
    		  if(a=='a'&&min>1)
    		  {
    			  min=1;
    			  b=a;
    		  }
    		  if(a=='e'&&min>2)
    		  {
    			  min=2;
    			  b='e';
    		  }
    		  if(a=='i'&&min>3)
    		  {
    			  min=3;
    			  b='i';
    		  }
    		  if(a=='o'&&min>4)
    		  {
    			  min=4;
    			  b='o';
    		  }
    		  if(a=='u'&&min>5)
    		  {
    			  min=5;
    			  b='u';
    		  }
    		 
    	  }
      }
	  System.out.print(b);
	}

}
