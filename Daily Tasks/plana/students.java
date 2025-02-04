//Task-2
package plana;
import java.util.Arrays;
import java.util.Scanner;
public class students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("enter the number of students requiresd");
     Scanner sc=new Scanner(System.in);
     
     int b=sc.nextInt();
     for(int i=0;i<b;i++)
     {
    	 int a=0;
    	 int sum=0;
    	 System.out.println("enter the marks of s1");
    	 a=sc.nextInt();
    	 sum=sum+a;
    	 System.out.println("enter the marks of s2");
    	 a=sc.nextInt();
    	 sum=sum+a;
    	 System.out.println("enter the marks of s3");
    	 a=sc.nextInt();
    	 sum=sum+a;
    	 System.out.println("sum="+sum);
    	 System.out.println("avg=" +sum/3);
     }
	}

}
