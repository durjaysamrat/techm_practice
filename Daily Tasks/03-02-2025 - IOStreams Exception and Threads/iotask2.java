import java.io.File;

public class iotask2 {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\vvrav\\OneDrive\\Desktop\\techm stuff training\\helloravi.txt";
        
        String extension = ".txt";  

        File directory = new File(directoryPath);
        
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles((dir, name) -> name.endsWith(extension));
            
            if (files != null && files.length > 0) {
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("No files with the extension " + extension + " found.");
            }
        } else {
            System.out.println("The given path is not a valid directory.");
        }
    }
}
