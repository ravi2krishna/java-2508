package eight;

public class LMSGradePaymentTracker {
    public static void main(String[] args) {
        // Student s1 = new Student();
        // basic details 
        Student s1 = new Student(101, "Ravi");
        // s1.studentID=101;
        // s1.studentName="Ravi";

        // complete details --> Constructor Overloading
        Student s2 = new Student(101, "Ravi",90909090,25);

        s1.studentInfo();
        s2.studentCompleteInfo();

        // System.out.println(s1.sessionsAttendedCredits());

        // System.out.println(s1.performanceScoreCredits(90));

        System.out.println(s1.achievementStatus());


        Trainer t1 = new Trainer(101, "Krishna");
        // t1.trainerID = 101;
        // t1.trainerName = "John";

        t1.trainerInfo();
        // s1.trainerRatings();

        // System.out.println(t1.trainerPaymentCal());
        System.out.println(t1.totalPaymentForTrainer());

    }


}
