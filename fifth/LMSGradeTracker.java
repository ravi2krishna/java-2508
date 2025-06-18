package fifth;

import java.util.Scanner;

public class LMSGradeTracker {
    public static void main(String[] args) {
        
        // inputs
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID: ");
        int studentID = scanner.nextInt();

        System.out.println("Enter Name: ");
        scanner.nextLine(); // read the new line
        String studentName = scanner.nextLine();

        double attendance = 90;
        int totalScore = 0;
        int numberOfSubjects = 0;

        // store input given from student
        char continueInput = 'y';

        // why not for here ? -> Which students will input how many subject scores
        while (continueInput == 'y' || continueInput == 'Y') {
            System.out.println("Enter Score For Subject: "+(numberOfSubjects+1));
            int currentScore = scanner.nextInt();
            numberOfSubjects++; // increment subject

            totalScore+= currentScore; //add each currentScore to totalScore
            // Ask the user if they want to enter another score
            System.out.println("Do you want to enter another score ? (y/n) ");
            continueInput = scanner.next().charAt(0);

        }

        // fix the issue here -> Type Casting Needed 
        double avgScore = (double) totalScore/numberOfSubjects;

        // 
        String performance;
        if (avgScore >=85) {
            performance = "Excellent";
        } else if (avgScore>=70) {
            performance = "Good";
        } else if (avgScore>=50) {
            performance = "Average";
        } 
        else {
            performance = "Needs Improvement";
        } 

        // Attendance Status -> Venkatesh
        String AttendanceStatus;
        if (attendance < 75) {
            AttendanceStatus = "WARNING LOW ATTENDANCE";
        } else {
            AttendanceStatus = "OK GOOD ATTENDANCE";
        }

        // Vidya -> Ternary 
        String attendanceStatus = attendance < 75 ? "WARNING LOW ATTENDANCE":"OK GOOD ATTENDANCE";

        System.out.println("Student ID: "+studentID);
        System.out.println("Student Name: "+studentName);
        System.out.println("Total Score: "+totalScore);
        System.out.println("Average Score: "+avgScore);
        System.out.println("Your Performance: "+performance);
        System.out.println("Your Attendance: "+AttendanceStatus);
        System.out.println("Your Attendance: "+attendanceStatus);

        scanner.close();
    }
}
