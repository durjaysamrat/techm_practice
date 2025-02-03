package plana;
import java.util.Scanner;
public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String nstr="";
    char ch;
    
    System.out.println("Original text is " + str);
    for(int i=0;i<str.length();i++) {
    	ch=str.charAt(i);
    	if(i%2==0) {
    	ch=Character.toUpperCase(ch);

    	}
    	else
    	{
        	ch=Character.toLowerCase(ch);

    	}
    	nstr=nstr+ch;
    }
    System.out.println("Modified text is " + nstr);
    sc.close();
	}

}
