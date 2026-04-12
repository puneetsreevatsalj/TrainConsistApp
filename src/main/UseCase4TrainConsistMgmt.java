package main;

import java.util.LinkedList;

public class UseCase4TrainConsistMgmt {

    public static void main(String[] args) {

        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train: " + train);

        // Insert Pantry at position 2
        train.add(2, "Pantry");

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("Final Train Consist: " + train);
    }
}