package Day6Task;


	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.Set;
	
	public class HashSetListOfUnique {

	    public static void main(String[] args) {
	        
	        Set<String> emailSet = new HashSet<>();
	        
	        emailSet.add("john.doe@example.com");
	        emailSet.add("jane.smith@example.com");
	        emailSet.add("john.doe@example.com");
	        emailSet.add("alice.johnson@example.com");
	        
	        System.out.println("Unique Email Addresses:");
	        Iterator<String> iterator = emailSet.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }


}
