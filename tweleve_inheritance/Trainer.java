package tweleve_inheritance;

import java.util.Scanner;

public class Trainer extends Person {
    
    int sessionTaken;
    int perSessionCost;
    int totalPayment;
    
    // static for trainer
    static {
        System.out.println("===============INSTITUTE DETAILS===============");
        System.out.println("Institute Name: "+Student.instituteName);
        System.out.println("Training Department: "+Student.courseName);
    }

    public Trainer(int trainerID, String trainerName, int trainerAge, int trainerMobileNumber) {
        super(trainerID, trainerName, trainerAge, trainerMobileNumber);
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
