package Day6Task;

import java.util.HashMap;
	import java.util.Map;
	public class HashMapStudentName {
	    public static void main(String[] args) {
	        
	        Map<String, int[]> studentMarks = new HashMap<>();
	        
        studentMarks.put("John Doe", new int[]{85, 90, 78});
	        studentMarks.put("Jane Smith", new int[]{92, 88, 95});
	        studentMarks.put("Alice Johnson", new int[]{79, 84, 91});
	        studentMarks.put("Bob Brown", new int[]{88, 76, 85});

	        for (Map.Entry<String, int[]> entry : studentMarks.entrySet()) {
	            String name = entry.getKey();
	            int[] marks = entry.getValue();
   
	            int sum = 0;
	            for (int mark : marks) {
	                sum += mark;
	            }
	            
	            double average = (double) sum / marks.length;
	         
	            System.out.println(name + " - Average Marks: " + average);
	        }
	    }
	}

