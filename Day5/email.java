import java.util.HashSet;

public class UniqueEmails {
    public static void main(String[] args) {
        
        HashSet<String> emailSet = new HashSet<>();

      
        emailSet.add("a.com");
        emailSet.add("b.com");
        emailSet.add("a.com");  
        emailSet.add("f.com");

        
        System.out.println("Unique email addresses:");
        for (String email : emailSet) {
            System.out.println(email);
        }
    }
}
