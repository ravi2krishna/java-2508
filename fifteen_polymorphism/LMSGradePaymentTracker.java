package fifteen_polymorphism;

import java.util.Scanner;

public class LMSGradePaymentTracker {
    public static void main(String[] args) {

        // Scanner
        Scanner sc = new Scanner(System.in);

        // Student s1 = new Student(); --> No Abstraction
        
        // Implement Abstraction
        Personable student = new Student();
        System.out.println("====== ENTER STUDENT DETAILS ====== ");
        student.setPersonDetails();
        student.displayPersonDetails();
        student.achievementStatus();
        
        // call payment
        // Payables studentPay = new Student();
        // studentPay.calculatePayment(); // Good
        ((Payables) student).calculatePayment(); // Casting --> very Good
        
        Personable trainer = new Trainer();
        System.out.println("====== ENTER TRAINER DETAILS ====== ");
        trainer.setPersonDetails();
        trainer.displayPersonDetails();
        ((Payables) trainer).calculatePayment();   

    }
}