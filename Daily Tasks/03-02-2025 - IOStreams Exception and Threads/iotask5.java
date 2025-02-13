import java.io.File;

public class iotask5 {
    public static void main(String[] args) {
        String pathname = "C:/Users/vvrav/OneDrive/Desktop/techm stuff training";
        
        File file = new File(pathname);
        
        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println(pathname + " is a directory.");
            } else if (file.isFile()) {
                System.out.println(pathname + " is a file.");
            }
        } else {
            System.out.println("The given pathname does not exist.");
        }
    }
}