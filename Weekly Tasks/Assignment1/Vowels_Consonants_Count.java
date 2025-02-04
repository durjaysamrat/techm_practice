package Assignment1;
import java.util.Scanner;
public class Vowels_Consonants_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      str=str.toLowerCase();
      int c=0,v=0;
      for(int i=0;i<str.length();i++)
      {
    	 char d=str.charAt(i);
    	 if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u')
    	 {
    		 v++;
    	 }
    	 else  if(d=='b'||d=='c'||d=='d'||d=='f'||d=='g'||d=='h'||d=='j'||d=='k'||d=='l'||d=='m'||d=='n'||d=='p'||d=='q'||d=='r'||d=='s'||
    			 d=='t'||d=='v'||d=='w'||d=='x'||d=='y'||d=='z')
    	 {
    		 c++;
    	 }
      }
      System.out.println("Number of vowels are "+ v);
      System.out.println("Number of Consonants are "+ c);
	}

}
