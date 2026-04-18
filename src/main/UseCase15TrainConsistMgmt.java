public class UseCase15TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("Program Started");

        try {
            int a = 10;
            int b = 0;

            int result = a / b; // ❌ will throw exception

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero");

        } finally {
            System.out.println("Finally block executed (always runs)");
        }

        System.out.println("Program continues after exception");
    }
}