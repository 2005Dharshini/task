package Day6Task;

	import java.util.ArrayList;
	import java.util.Iterator;

	public class ArrayListOfStudents {
		
	    public static void main(String[] args) {
	       
	        ArrayList<String> students = new ArrayList<>();
	        students.add("John Doe");
	        students.add("Jane Smith");
	        students.add("Alice Johnson");
	        students.add("Bob Brown");

	        Iterator<String> iterator = students.iterator();
	        
	        System.out.println("Student List:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}

