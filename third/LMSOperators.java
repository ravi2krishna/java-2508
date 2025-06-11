package third;

public class LMSOperators {
    public static void main(String[] args) {
        // Declare Values
        int studentID = 101;
        String studentName = "John";
        byte age = 25;
        double quizScore = 85;
        double assignmentScore = 90;
        double examScore = 90;
        double attendance = 85;

        // Calculate Total & Avg Scores
        double totalScore = quizScore+assignmentScore+examScore;
        double avgScore = totalScore / 3;

        // If avg score >= 85 -> PASS
        boolean isPassed = avgScore>=85;

        // Simulate Attendance
        attendance++;

        // student qualified for AWARD
        // If avg attendance >= 75 -> OK
        boolean isQualified = isPassed && attendance >=70;
        
        System.out.println("Student Name: "+studentName);
        System.out.println("Total Score: "+totalScore);
        System.out.println("Average Score: "+avgScore);
        System.out.println("Is Student Passed: "+isPassed);

        System.out.println("Student Attendance After Attending: "+attendance);
        System.out.println("Is Student Qualified: "+isQualified);


    }
}