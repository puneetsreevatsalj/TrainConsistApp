public class UseCase20TrainConsistMgmt {

    // 🔹 Search with validation
    public static boolean search(String[] arr, String target) {

        // Edge case check
        if (arr == null || arr.length == 0) {
            throw new IllegalStateException("No bogie data available");
        }

        // Linear search
        for (String s : arr) {
            if (s.equals(target)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] bogieIds = {"BG101", "BG205", "BG309"};

        try {
            boolean found = search(bogieIds, "BG205");

            if (found) {
                System.out.println("Bogie found");
            } else {
                System.out.println("Bogie not found");
            }

            // 🔴 Test exception (optional)
            // search(new String[]{}, "BG101");

        } catch (IllegalStateException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}