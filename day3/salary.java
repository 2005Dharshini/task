
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    
}


public class Employee extends Person {
    private double baseSalary;
    private double bonus;

    public Employee(String name, int age, double baseSalary, double bonus) {
        super(name, age);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

   
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    public void displayEmployeeInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 30, 50000, 5000);
        emp.displayEmployeeInfo();
    }
}
