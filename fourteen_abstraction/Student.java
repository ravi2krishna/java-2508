package fourteen_abstraction;

import java.util.Scanner;

// it's also an use case for hybrid inheritance
public class Student extends AbstractPerson implements Personable, Payables {

    // static variables --> common for all student objects
    private  static String courseName = "Java";
    private static String instituteName = "Digital Edify";
    private  static double globalDiscount = 0.1;

    // static block
    static {
        System.out.println("===============INSTITUTE DETAILS===============");
        System.out.println("Welcome To "+instituteName);
        System.out.println("Current Course Attending "+courseName);
        System.out.println("You Got Discount "+globalDiscount);
    }

    private  double courseFee;
    private int attendanceCredits;
    private int performanceCredits;
    private int finalCredits;
    private int trainerRatings;
    private int [] subjectScores;

    Scanner sc = new Scanner(System.in);
    
    @Override
    public void setPersonDetails() {
        // Take Input
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

        System.out.println("Enter Course Fee: ");
        courseFee = sc.nextDouble();

    }
    @Override
    public void displayPersonDetails() {
        System.out.println("DETAILS");
        System.out.println("ID: "+getPersonID());
        System.out.println("NAME: "+getPersonName());
        System.out.println("AGE: "+getPersonAge());
        System.out.println("DESCRIPTION: "+getPersonDescription());
        System.out.println("MOBILE: "+getPersonMobileNumber());
    }
    @Override
    public void calculatePayment() {
        // init discount
        double discount = 0;

        String description = getPersonDescription().toLowerCase();

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

    // implement achievementStatus from Personable bu overriding default method   
    @Override
    public void achievementStatus() {
        int averageScore = calculateAvgScore();
        finalCredits = performanceScoreCredits(averageScore) + sessionsAttendedCredits();
        if (finalCredits>=10) {
            System.out.println("GOLD");
        } else if (finalCredits>=8) {
            System.out.println("SILVER");
        } else {
            System.out.println("You Need To IMPROVE");
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
