package thirteen_encapsulation;

import java.util.Scanner;

public class LMSGradePaymentTracker {
    public static void main(String[] args) {

        // Scanner
        Scanner sc = new Scanner(System.in);

        // complete details --> Constructor Overloading
        Student s1 = new Student();
        System.out.println("Enter Student ID: ");
        s1.setPersonID(sc.nextInt());

        System.out.println("Enter Student Name: ");
        sc.nextLine(); // buffer 
        s1.setPersonName(sc.nextLine());

        System.out.println("Enter Student Age: ");
        s1.setPersonAge(sc.nextInt());

        System.out.println("Enter Mobile Number: ");
        s1.setPersonMobileNumber(sc.nextInt());

        System.out.println("Enter Student Description: ");
        sc.nextLine(); // buffer 
        s1.setStudentDescription(sc.nextLine());

        System.out.println("Enter Course Fee: ");
        s1.setCourseFee(sc.nextDouble());


        s1.displayInfo(); // super class method Person

        System.out.println(s1.achievementStatus());
        s1.calculateCourseFee();

        Trainer t1 = new Trainer();
        System.out.println("Enter Trainer ID: ");
        t1.setPersonID(sc.nextInt());

        System.out.println("Enter Trainer Name: ");
        sc.nextLine(); // buffer 
        t1.setPersonName(sc.nextLine());

        System.out.println("Enter Trainer Age: ");
        t1.setPersonAge(sc.nextInt());

        System.out.println("Enter Mobile Number: ");
        t1.setPersonMobileNumber(sc.nextInt());

        t1.displayInfo(); // super class method Person

        System.out.println(t1.totalPaymentForTrainer());

    }


}
