package main;

import java.util.HashSet;

public class UseCase3TrainConsistMgmt {

    public static void main(String[] args) {

        HashSet<String> bogieIds = new HashSet<>();

        // Adding bogie IDs
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG101"); // duplicate

        System.out.println("Unique Bogie IDs: " + bogieIds);
    }
}