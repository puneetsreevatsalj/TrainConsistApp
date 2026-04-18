public class UseCase12TrainConsistMgmt {

    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            if (capacity <= 0) {
                throw new IllegalArgumentException("Capacity must be greater than 0");
            }
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        Bogie b1 = new Bogie("Sleeper", 72);
        System.out.println("Created: " + b1.type + " " + b1.capacity);

        // Uncomment to test exception
        // Bogie b2 = new Bogie("AC", 0);
    }
}