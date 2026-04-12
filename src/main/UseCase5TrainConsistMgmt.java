package main;

import java.util.LinkedHashSet;

public class UseCase5TrainConsistMgmt {

    public static void main(String[] args) {

        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt duplicate
        train.add("Sleeper");

        System.out.println("Train Formation: " + train);
    }
}