import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class iotask7 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Enter some text: ");
            
            String input = reader.readLine();
            
            System.out.println("You entered: " + input);
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}