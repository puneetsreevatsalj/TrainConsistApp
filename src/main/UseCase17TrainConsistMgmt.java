import java.util.Arrays;

public class UseCase17TrainConsistMgmt {

    public static void main(String[] args) {

        String[] bogieTypes = {"Sleeper", "AC Chair", "General", "First Class"};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieTypes));

        // 🔹 Built-in sort
        Arrays.sort(bogieTypes);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(bogieTypes));
    }
}