package tweleve_inheritance;

public class LMSGradePaymentTracker {
    public static void main(String[] args) {
        // Student s1 = new Student();
        // basic details 
        // Student s1 = new Student(101, "Ravi");
        // s1.studentID=101;
        // s1.studentName="Ravi";

        // complete details --> Constructor Overloading
        Student s2 = new Student(101, "Ravi",90909090,25,"hi i have a RefErence with me",30000);
        s2.displayInfo(); // super class method Person

        System.out.println(s2.achievementStatus());
        s2.calculateCourseFee();

        Trainer t1 = new Trainer(101,"Krishna",30,99999);

        t1.displayInfo(); // super class method Person

        System.out.println(t1.totalPaymentForTrainer());

    }


}
