import java.util.*;

public class UseCase13TrainConsistMgmt {

    static class Bogie {
        int capacity;

        Bogie(int capacity) {
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        // Create sample data
        for (int i = 0; i < 10000; i++) {
            bogies.add(new Bogie(i));
        }

        // 🔹 LOOP METHOD
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 5000) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();

        // 🔹 STREAM METHOD
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 5000)
                .toList();

        long endStream = System.nanoTime();

        // OUTPUT
        System.out.println("Loop Time: " + (endLoop - startLoop));
        System.out.println("Stream Time: " + (endStream - startStream));

        System.out.println("Loop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());
    }
}