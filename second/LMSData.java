package second;

public class LMSData {
    public static void main(String[] args) {
        // Data for LMS Student Entity
        int studentID=101;
        String studentName = "Ravi";
        byte studentAge = 25;
        char studentGender = 'M'; 
        float studentRating = 4.5f;
        boolean isInstructor = false;
        String courseName = "Java";
        Short courseID = 105;

        // Concatenation
        System.out.println("Student ID is " +studentID);
        System.out.println("Name is "+studentName);
        System.out.println("Age is " +studentAge);
        System.out.println("Gender is " +studentGender);
        System.out.println("ratinmg is " +studentRating);
        System.out.println("Is Trainer " +isInstructor);
        System.out.println("Course is " +courseName);
        System.out.println("Course ID " +courseID);

        // Arithmetic Operations
        System.out.println("Sum of courseID & studentID" +(courseID+studentID));


    }
}
