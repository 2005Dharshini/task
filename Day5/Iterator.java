import java.util.ArrayList;
import java.util.Iterator;


class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class StudentListExample {
    public static void main(String[] args) {
       
        ArrayList<Student> students = new ArrayList<>();

       
        students.add(new Student("Alice", 101));
        students.add(new Student("Bob", 102));
        students.add(new Student("Charlie", 103));

      
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }
    }
}
