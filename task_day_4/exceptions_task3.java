package task_day_4;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class exceptions_task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inFile=new File("src//task_day_4//input.dat");
		FileInputStream fis=null;
        try
        {
        	fis=new FileInputStream(inFile);
        	System.out.println("read done");
        }
        catch(IOException e)
        {
        	System.out.println("file not exist");
        }
	}

}
