import java.io.File;

public class iotask3 {
    public static void main(String[] args) {
        String pathname = "C:/Users/vvrav/OneDrive/Desktop/techm stuff training";
        
        File file = new File(pathname);
        
        if (file.exists()) {
            System.out.println("The file or directory exists.");
        } else {
            System.out.println("The file or directory does not exist.");
        }
    }
}