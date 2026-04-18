import java.util.Arrays;

public class UseCase19TrainConsistMgmt {

    // 🔹 Binary Search Method
    public static boolean binarySearch(String[] arr, String target) {

        // IMPORTANT: Array must be sorted
        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid].equals(target)) {
                return true;
            } else if (arr[mid].compareTo(target) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] bogieIds = {"BG410", "BG101", "BG309", "BG205"};

        String searchKey = "BG205";

        boolean found = binarySearch(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie found using Binary Search: " + searchKey);
        } else {
            System.out.println("Bogie not found");
        }
    }
}