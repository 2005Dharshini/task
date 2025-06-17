import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentCoursesManager {
    private ArrayList<String> students;
    private HashMap<String, ArrayList<String>> studentCourses;

    public StudentCoursesManager() {
        students = new ArrayList<>();
        studentCourses = new HashMap<>();
    }

     (if not already present)
    public void addStudent(String student) {
        if (!students.contains(student)) {
            students.add(student);
            studentCourses.put(student, new ArrayList<>());
            System.out.println("Added student: " + student);
        } else {
            System.out.println("Student already exists: " + student);
        }
    }

   
    public void removeStudent(String student) {
        if (students.remove(student)) {
            studentCourses.remove(student);
            System.out.println("Removed student: " + student);
        } else {
            System.out.println("Student not found: " + student);
        }
    }

    
    public void addCourseToStudent(String student, String course) {
        if (students.contains(student)) {
            ArrayList<String> courses = studentCourses.get(student);
            if (!courses.contains(course)) {
                courses.add(course);
                System.out.println("Added course '" + course + "' to student " + student);
            } else {
                System.out.println(student + " is already enrolled in " + course);
            }
        } else {
            System.out.println("Student not found: " + student);
        }
    }

  
    public void removeCourseFromStudent(String student, String course) {
        if (students.contains(student)) {
            ArrayList<String> courses = studentCourses.get(student);
            if (courses.remove(course)) {
                System.out.println("Removed course '" + course + "' from student " + student);
            } else {
                System.out.println(student + " is not enrolled in " + course);
            }
        } else {
            System.out.println("Student not found: " + student);
        }
    }

   
    public void displayAllStudents() {
        System.out.println("Students and their enrolled courses:");
        for (String student : students) {
            ArrayList<String> courses = studentCourses.get(student);
            System.out.println(student + " -> " + courses);
        }
    }

    public static void main(String[] args) {
        StudentCoursesManager manager = new StudentCoursesManager();

        
        manager.addStudent("Alice");
        manager.addStudent("Bob");
        manager.addStudent("Charlie");

       
        manager.addCourseToStudent("Alice", "Math");
        manager.addCourseToStudent("Alice", "Physics");
        manager.addCourseToStudent("Bob", "Chemistry");
        manager.addCourseToStudent("Charlie", "Biology");

        
        manager.displayAllStudents();

        
        manager.removeCourseFromStudent("Alice", "Physics");

        
        manager.removeStudent("Charlie");

        
        manager.displayAllStudents();
    }
}
