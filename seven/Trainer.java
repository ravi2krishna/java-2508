package seven;

import java.util.Scanner;

public class Trainer {
    
    int trainerID;
    String trainerName;
    int sessionTaken;
    int perSessionCost;
    int totalPayment;

    // display trainer info
    public void trainerInfo() {
        System.out.println("===============TRAINER DETAILS===============");
        System.out.println("Trainer ID: "+trainerID);
        System.out.println("Trainer NAME: "+trainerName);
    }

    // calculate trainer payment
    public int trainerPaymentCal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Sessions Taken");
        int numberOfSessionTaken = sc.nextInt();
        int sessionBasedPayment = numberOfSessionTaken * 1500;
        return sessionBasedPayment;

    }

    public int totalPaymentForTrainer(){
        // assign trainer rating
        Student s1 = new Student();
        // s1.trainerRatings();
        int bouns=s1.trainerRatings();
        int totalPaymentForTrainer = trainerPaymentCal() + bouns;
        return totalPaymentForTrainer;
    }


}
