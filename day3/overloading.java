public class OverloadingDemo {

    
    public int sum(int a, int b) {
        return a + b;
    }

    
    public double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadingDemo demo = new OverloadingDemo();

        int intResult = demo.sum(10, 20);
        double doubleResult = demo.sum(5.5, 7.3);

        System.out.println("Sum of integers: " + intResult);      
        System.out.println("Sum of doubles: " + doubleResult);    
    }
}
