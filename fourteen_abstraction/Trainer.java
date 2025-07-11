package fourteen_abstraction;

import java.util.Scanner;

public class Trainer extends AbstractPerson implements Personable,Payables {
   
    // implement encapsulation by using private 
    private int sessionTaken;
    private int perSessionCost;
    private int totalPayment;
    private int basePayPerSession;

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

    // set trainer details
    @Override
    public void setPersonDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID");
        setPersonID(sc.nextInt());

        System.out.println("Enter Name");
        sc.nextLine(); // buffer
        setPersonName(sc.nextLine());

        System.out.println("Enter Age");
        setPersonAge(sc.nextInt());

        System.out.println("Enter Description");
        sc.nextLine(); // buffer
        setPersonDescription(sc.nextLine());

        System.out.println("Enter Mobile");
        setPersonMobileNumber(sc.nextInt());

        System.out.println("Enter Base Pay");
        basePayPerSession = sc.nextInt();

    }
    
    // display trainer details
    @Override
    public void displayPersonDetails() {
        System.out.println("DETAILS");
        System.out.println("ID: "+getPersonID());
        System.out.println("NAME: "+getPersonName());
        System.out.println("AGE: "+getPersonAge());
        System.out.println("DESCRIPTION: "+getPersonDescription());
        System.out.println("MOBILE: "+getPersonMobileNumber());
    }

    // trainer payment
    @Override
    public void calculatePayment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Sessions Taken");
        int numberOfSessionTaken = sc.nextInt();
        int sessionBasedPayment = numberOfSessionTaken * basePayPerSession;
        // assign trainer rating
        Student s1 = new Student();
        // s1.trainerRatings();
        int bouns =s1.trainerRatings();
        int totalPaymentForTrainer = sessionBasedPayment + bouns;
        System.out.println("Total Trainer Payment: "+totalPaymentForTrainer);
        
    }    

}
