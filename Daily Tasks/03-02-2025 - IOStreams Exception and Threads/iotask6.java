import java.io.File;

public class iotask6 {
    public static void main(String[] args) {
        String filePath = "C:/Users/vvrav/OneDrive/Desktop/techm stuff training";
        
        File file = new File(filePath);
        
        if (file.exists()) {
            long lastModified = file.lastModified();
            
            java.util.Date date = new java.util.Date(lastModified);
            
            System.out.println("Last modified date of the file: " + date);
        } else {
            System.out.println("The file does not exist.");
        }
    }
}