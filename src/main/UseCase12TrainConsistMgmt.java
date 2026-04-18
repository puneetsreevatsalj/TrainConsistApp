package main;

public class UseCase12TrainConsistMgmt {

    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            if (capacity <= 0) {
                throw new IllegalArgumentException("Capacity must be > 0");
            }
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        Bogie b = new Bogie("Sleeper", 72);
        System.out.println(b.type + " " + b.capacity);
    }
}

