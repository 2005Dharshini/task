import java.util.HashMap;
import java.util.Map;

public class StudentMarksAverage {
    public static void main(String[] args) {
    
        HashMap<String, Integer> studentMarks = new HashMap<>();

       
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 90);
        studentMarks.put("Charlie", 78);
        studentMarks.put("Diana", 92);

        
        double total = 0;
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            total += entry.getValue();
        }

        double average = 0;
        if (!studentMarks.isEmpty()) {
            average = total / studentMarks.size();
        }

        System.out.println("Average marks of students: " + average);
    }
}
