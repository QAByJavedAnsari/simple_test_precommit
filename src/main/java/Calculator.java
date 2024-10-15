public class Calculator {
    public int add(int a, int b) {
        System.out.println("Javed Add");
        return a + b;
    }

    public int subtract(int a, int b) {
        System.out.println("Javed Subtract");
        return a - b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        System.out.println("Javed Divide");
        return a / b;
    }
}
