package Day5Task;

	import java.io.File;

	import java.util.Scanner;
	
	public class TextFile {
		
	    public static void main(String[] args) {
	    	
	        try {
	         
	            File file = new File("example.txt");
	            Scanner scanner = new Scanner(file);
	            while (scanner.hasNextLine()) {
	            	
	                String line = scanner.nextLine();
	                System.out.println(line);
	            }
	            
	            scanner.close();
	            
	        } catch (Exception e) {
	        	
	            e.printStackTrace();
	        }
	    }
	}
