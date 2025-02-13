import java.io.File;

public class iotask8 {
    public static void main(String[] args) {
        String filePath = "C:/Users/vvrav/OneDrive/Desktop/techm stuff training";
        
        File file = new File(filePath);
        
        if (file.exists()) {
            
            long fileSizeInBytes = file.length();
            
            double fileSizeInKB = fileSizeInBytes / 1024.0;
            double fileSizeInMB = fileSizeInKB / 1024.0;
            
            System.out.println("File size: ");
            System.out.println("Bytes: " + fileSizeInBytes);
            System.out.println("KB: " + fileSizeInKB);
            System.out.println("MB: " + fileSizeInMB);
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
