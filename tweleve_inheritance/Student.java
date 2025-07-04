package tweleve_inheritance;

import java.util.Scanner;

public class Student extends Person {

    // specific student attributes
    String studentDescription;
    double courseFee;

    int attendanceCredits;
    int performanceCredits;
    int finalCredits;
    int trainerRatings;

    // Take 5 Subject Scores --> USE ARRAYS (Dynamic)
    int [] subjectScores;

    // static variables --> common for all student objects
    static String courseName = "Java";
    static String instituteName = "Digital Edify";
    static double globalDiscount = 0.1;

    // static block
    static {
        System.out.println("===============INSTITUTE DETAILS===============");
        System.out.println("Welcome To "+instituteName);
        System.out.println("Current Course Attending "+courseName);
        System.out.println("You Got Discount "+globalDiscount);
    }

    // Set constructor for Student -> empty object to assign rating for trainer
    public Student(){
        System.out.println("Default Called");
    }

    // Set constructor for Student to set ID & Name
    public Student(int studentID, String studentName, int studentMobileNumber, int studentAge, String studentDescription, double courseFee){
        super(studentID, studentName, studentAge, studentMobileNumber);
        this.studentDescription = studentDescription;
        this.courseFee = courseFee;
    }

    // Take Input
    Scanner sc = new Scanner(System.in);

    // calculate course fee
    public void calculateCourseFee(){

        // init discount
        double discount = 0;

        String description = studentDescription.toLowerCase();

        if (description.contains("reference")) {
            discount += 5000;
        } if (description.contains("scholarship")) {
            discount += 7000;
        } if (description.contains("promo")) {
            discount += 3000;
        } 

        // update the global discount
        discount += courseFee * globalDiscount;

        // calculate final fees
        double finalFee = courseFee - discount;
        System.out.println("Original Course Fee: "+courseFee);
        System.out.println("Special Discount Applied: "+discount); // Specific student
        System.out.println("Global Discount Applied: "+globalDiscount); // For all students
        System.out.println("Final Fee To Pay: "+finalFee);

    }    

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

    // calculate avg score --> NO ARRAYS (MANUAL)
    public int calculateAvgScore() {
        System.out.println("Enter Number Of Subjects: ");
        int numSubjects = sc.nextInt();

        // init array with numSubjects
        subjectScores = new int[numSubjects];
        
        int totalScores = 0;

        for (int i=0; i<subjectScores.length; i++) {
            System.out.println("Enter Score For Subject: "+(i+1));
            subjectScores[i] = sc.nextInt();
            totalScores += subjectScores[i]; 
        }

        int averageScore = (totalScores) / subjectScores.length;
        return averageScore;

    }

    // calculate performance credits based on avg score 
    public int performanceScoreCredits(int averageScore){
        if (averageScore>=85) {
            return performanceCredits+=5;
        } else if(averageScore>=60){
            return performanceCredits+=3;
        } else {
            return performanceCredits+=0;
        }
    }

    // calculate final achievement credits
    public String achievementStatus(){
        int averageScore = calculateAvgScore();
        finalCredits = performanceScoreCredits(averageScore) + sessionsAttendedCredits();
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