package Day5Task;
	import java.io.*;
	import java.nio.file.*;
	import java.util.*;

	public class MarksProcessor {
	    public static void main(String[] args) {
	        String inputFile = "marks.txt";  
	        String outputFile = "results.txt"; 

	        try {
	            List<String> lines = Files.readAllLines(Paths.get(inputFile));
	            List<String> results = new ArrayList<>();

	            for (String line : lines) {
	                String[] parts = line.split(",");
	                String name = parts[0].trim();
	                int[] marks = Arrays.stream(parts, 1, parts.length)
	                                    .mapToInt(Integer::parseInt)
	                                    .toArray();

	                double average = Arrays.stream(marks).average().orElse(0.0);
	                results.add(name + " - Average: " + average);
	            }

	            Files.write(Paths.get(outputFile), results);
	            System.out.println("Results have been written to " + outputFile);

	        } catch (IOException e) {
	            System.err.println("An error occurred: " + e.getMessage());
	        }
	    }
	}

