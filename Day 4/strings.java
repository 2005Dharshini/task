import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        String filePath = "output.txt"; 
            "First line",
            "Second line",
            "Third line"
        };

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine(); 
            System.out.println("Writing complete!");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file:");
            e.printStackTrace();
        }
    }
}
