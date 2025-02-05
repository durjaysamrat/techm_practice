package task_day_4;
import java.util.Scanner;

public class exception_task2 {
  
	public static void checkOddNumber(int number) throws Exception {
        if (number % 2 != 0) {
            throw new Exception("The number " + number + " is odd.");
        } else {
            System.out.println("The number " + number + " is even.");
        }
    }
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		try {
		checkOddNumber(n);
	}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		}
	
}
