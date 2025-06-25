package eight;

import java.util.Scanner;

public class Student {

    // student attributes
    // ID, name, attendance, performance scores and trainer ratings
    // basic details
    int studentID;
    String studentName;

    // complete details
    int studentMobileNumber;
    int studentAge;

    int attendanceCredits;
    int performanceCredits;
    int finalCredits;
    int trainerRatings;

    // Set constructor for Student -> empty object to assign rating for trainer
    public Student(){
        System.out.println("Default Called");
    }

    // Set constructor for Student to set ID & Name
    public Student(int studentID, String studentName){
        // calling another constructor using this() 
        this(101,"Ravi",888888,20);
    }

    // Set constructor for Student to set ID & Name
    public Student(int studentID, String studentName, int studentMobileNumber, int studentAge){
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentMobileNumber = studentMobileNumber;
        this.studentAge = studentAge;
    }

    // display student info --> basic details --> hover
    public void studentInfo() {
        System.out.println("===============STUDENT DETAILS===============");
        System.out.println("Student ID: "+studentID);
        System.out.println("Student NAME: "+studentName);
    }

    // display student info --> complete details --> click -> show profile
    public void studentCompleteInfo() {
        System.out.println("===============STUDENT COMPLETE DETAILS===============");
        System.out.println("Student ID: "+studentID);
        System.out.println("Student NAME: "+studentName);
        System.out.println("Student MOBILE: "+studentMobileNumber);
        System.out.println("Student AGE: "+studentAge);
    }


    // Take Input
    Scanner sc = new Scanner(System.in);

    // calculate attendance credits based on sessions attended
    public int sessionsAttendedCredits(){
        System.out.println("Enter Number Of Sessions Attended");
        int noOfSessionsAttended = sc.nextInt();

        // condition
        if (noOfSessionsAttended >=30) {
            return attendanceCredits+=5;
        } else if (noOfSessionsAttended >=20) {
            return attendanceCredits+=3;
        } else {
            // return attendanceCredits+=0; // 1st
            return attendanceCredits=0;  // 2nd
        }
    }

    // calculate performance credits based on score 
    public int performanceScoreCredits(int score){
        if (score>=85) {
            return performanceCredits+=5;
        } else if(score>=60){
            return performanceCredits+=3;
        } else {
            return performanceCredits+=0;
        }
    }

    // calculate final achievement credits
    public String achievementStatus(){
        finalCredits = attendanceCredits + performanceCredits;
        if (finalCredits>=10) {
            return "GOLD";
        } else if (finalCredits>=8) {
            return "SILVER";
        } else {
            return "You Need To IMPROVE";
        }
    }
    
    // trainer rating 
    int addBouns;
    public int trainerRatings(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Trainers Traing (1-5)");
        trainerRatings = sc.nextInt();
        if (trainerRatings==5) {
            return addBouns+=5000;
        } else {
            return addBouns+=0;
        }
        // return trainerRatings;
    }

}