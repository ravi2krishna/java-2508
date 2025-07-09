package thirteen_encapsulation;

import java.util.Scanner;

public class Trainer extends Person {
   
    // implement encapsulation by using private 
    private int sessionTaken;
    private int perSessionCost;
    private int totalPayment;

    // setters & getters
    public int getSessionTaken() {
        return sessionTaken;
    }

    public void setSessionTaken(int sessionTaken) {
        this.sessionTaken = sessionTaken;
    }

    public int getPerSessionCost() {
        return perSessionCost;
    }

    public void setPerSessionCost(int perSessionCost) {
        this.perSessionCost = perSessionCost;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    // static for trainer
    // static {
    //     System.out.println("===============INSTITUTE DETAILS===============");
    //     System.out.println("Institute Name: "+Student.instituteName);
    //     System.out.println("Training Department: "+Student.courseName);
    // }

    
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
