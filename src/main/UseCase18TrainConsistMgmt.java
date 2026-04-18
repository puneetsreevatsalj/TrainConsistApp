public class UseCase18TrainConsistMgmt {

    // 🔹 Linear Search Method
    public static boolean linearSearch(String[] arr, String target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals(target)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG410"};

        String searchKey = "BG309";

        boolean found = linearSearch(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie found: " + searchKey);
        } else {
            System.out.println("Bogie not found");
        }
    }
}