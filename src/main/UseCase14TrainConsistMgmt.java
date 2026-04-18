public class UseCase14TrainConsistMgmt {

    // 🔹 Custom Exception
    static class InvalidCapacityException extends RuntimeException {
        InvalidCapacityException(String message) {
            super(message);
        }
    }

    // 🔹 Bogie Class
    static class Bogie {
        int capacity;

        Bogie(int capacity) {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than 0");
            }
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        // ✅ Valid case
        Bogie b1 = new Bogie(72);
        System.out.println("Valid Bogie created with capacity: " + b1.capacity);

        // ❌ Invalid case
        try {
            Bogie b2 = new Bogie(0);
        } catch (InvalidCapacityException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}