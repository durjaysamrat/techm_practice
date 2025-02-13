import java.io.File;

public class iotask1 {
    public static void main(String[] args) {
   
        String directoryPath = "D:\\electricity";
        
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            String[] fileList = directory.list();
            
            if (fileList != null) {
                for (String fileName : fileList) {
                    System.out.println(fileName);
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("The given path is not a valid directory.");
        }
    }
}