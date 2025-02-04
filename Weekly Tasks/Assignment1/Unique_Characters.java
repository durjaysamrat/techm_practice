package Assignment1;
import java.util.Scanner;

public class Unique_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String str=sc.next();
        str=str.toLowerCase();
        boolean flag=false;
        StringBuilder s=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
        	char c=str.charAt(i);
        	for(int j=0;j<s.length();j++)
        	{
        		char a=s.charAt(j);
                if(a==c)
                {
                	flag=true;
                }
                
        	}
        	if(flag==false)
        	{
        		s.append(c);
        	}
        	flag=false;
        	
        }
        System.out.print(s);
	}

}
