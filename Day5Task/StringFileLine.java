package Day5Task;

	import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;
	
	public class StringFileLine {
	
	    public static void main(String[] args) {
	    	
	        String[] lines = {
	            "Hello, World!",
	            "Welcome to Java programming.",
	            "Writing to a file line by line."
	        };

	        String filePath = "output.txt";

	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
	            for (String line : lines) {
	                writer.write(line);
	                writer.newLine();
	            }
	            System.out.println("Data has been written to the file successfully.");
	        } catch (IOException e) {
	            System.err.println("An error occurred while writing to the file: " + e.getMessage());
	        }
	    }
	}


