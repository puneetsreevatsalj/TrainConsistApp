package main;

import java.util.ArrayList;

public class UseCase2TrainConsistMgmt {

    public static void main(String[] args) {

        ArrayList<String> bogies = new ArrayList<>();

        // Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("After Adding: " + bogies);

        // Remove one bogie
        bogies.remove("AC Chair");

        // Check existence
        System.out.println("Contains Sleeper? " + bogies.contains("Sleeper"));

        // Final list
        System.out.println("Final List: " + bogies);
    }
}