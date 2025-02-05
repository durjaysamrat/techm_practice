package task_day_4;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class exception_task5 {

	private static Exception IOException = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     File inFile=new File("src//task_day_4//input.dat");
     FileInputStream fis=null;
     
     try {
    	 fis=new FileInputStream(inFile);
    	 int ch=fis.read();
    	 if(ch==-1)
    			 {
    		 throw new IOException("End of file or empty file");  
    			 }
    	 else {
    		 System.out.println("read successfull");
    	 }
     }
     catch(IOException e)
     {
    	 System.out.println("IOException occurred");
     }
	}

}
