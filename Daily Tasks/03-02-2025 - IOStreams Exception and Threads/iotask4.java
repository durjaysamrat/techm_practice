import java.io.File;

public class iotask4 {
    public static void main(String[] args) {
        String pathname = "C:/Users/vvrav/OneDrive/Desktop/techm stuff training";
        
        File file = new File(pathname);
        
        if (file.exists()) {
            boolean canRead = file.canRead();
            boolean canWrite = file.canWrite();
            
            System.out.println("File or directory: " + pathname);
            System.out.println("Read permission: " + (canRead ? "Yes" : "No"));
            System.out.println("Write permission: " + (canWrite ? "Yes" : "No"));
        } else {
            System.out.println("The file or directory does not exist.");
        }
    }
}