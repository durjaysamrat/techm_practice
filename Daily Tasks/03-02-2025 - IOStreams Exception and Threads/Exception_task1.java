package task_day_4;
import java.util.Scanner;

public class Exception_task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		try {
			int j=10;
			j=j%i;
			System.out.println(j);
		}
		catch(Exception e){
			System.out.println("exception occured");
		}
		finally {
			System.out.println("executed ");
		}

	}

}
