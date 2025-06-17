public class Student {
    private String name;
    private int rollNumber;
    private int[] marks;

    
    public Student(String name, int rollNumber, int subjectsCount) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = new int[subjectsCount];
    }

    
    public void assignMark(int subjectIndex, int mark) {
        if (subjectIndex >= 0 && subjectIndex < marks.length) {
            if (mark >= 0 && mark <= 100) {
                marks[subjectIndex] = mark;
            } else {
                System.out.println("Invalid mark! Must be between 0 and 100.");
            }
        } else {
            System.out.println("Invalid subject index.");
        }
    }

    
    public int getTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    
    public double getAverageMarks() {
        return (double) getTotalMarks() / marks.length;
    }

    
    public void displayResults() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
        System.out.println("Total Marks: " + getTotalMarks());
        System.out.printf("Average Marks: %.2f\n", getAverageMarks());
    }
}
