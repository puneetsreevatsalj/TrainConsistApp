package main;

import java.util.regex.*;

public class UseCase11TrainConsistMgmt {

    public static void main(String[] args) {

        String trainId = "TRN-1234";
        String cargo = "PET-AB";

        boolean trainValid = Pattern.matches("TRN-\\d{4}", trainId);
        boolean cargoValid = Pattern.matches("PET-[A-Z]{2}", cargo);

        System.out.println("Train ID Valid: " + trainValid);
        System.out.println("Cargo Code Valid: " + cargoValid);
    }
}