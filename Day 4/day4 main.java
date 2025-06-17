import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ResultProcessor {
    
    public static void main(String[] args) {
        String inputFile = "marks.txt";    
        String outputFile = "results.txt"; 
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            
            String line;
            
            writer.write("StudentName,Total,Average,Grade");
            writer.newLine();
            
            while ((line = reader.readLine()) != null) {
                
                String[] parts = line.split(",");
                if (parts.length < 4) {
                    System.out.println("Skipping invalid line: " + line);
                    continue;
                }
                
                String name = parts[0];
                int mark1 = Integer.parseInt(parts[1].trim());
                int mark2 = Integer.parseInt(parts[2].trim());
                int mark3 = Integer.parseInt(parts[3].trim());
                
                int total = mark1 + mark2 + mark3;
                double average = total / 3.0;
                String grade = calculateGrade(average);
                
              
                writer.write(name + "," + total + "," + String.format("%.2f", average) + "," + grade);
                writer.newLine();
            }
            
            System.out.println("Result processing complete! Check " + outputFile);
            
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error processing files:");
            e.printStackTrace();
        }
    }
    
   
    private static String calculateGrade(double avg) {
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }
}
