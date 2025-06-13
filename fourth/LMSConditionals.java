package fourth;

public class LMSConditionals {
    public static void main(String[] args) {
        int studentGrade = 6;
        double tuitionFee = 10000;
        double discount = 0;
        boolean isAcademicTopper = false;

        // check the discount based on given conditions
        if (studentGrade >=9 && studentGrade <=12) {
            if (isAcademicTopper) { // inner if condition
                discount = 0.2;    
            } else {
                discount = 0.1;
            } 
        } else if (studentGrade >=6 && studentGrade <=8) {
            discount = 0.05;
        } else {
            discount = 0;
        }

        switch(studentGrade) {
            case 10:
                discount += 0.03; // additional
                break;
            case 12:
                discount += 0.05; // additional
                break;
            default:
                discount += 0;    
        }

        // final fee
        double discountedFee = tuitionFee - (tuitionFee * discount);

        System.out.println("Student Grade: "+studentGrade);
        System.out.println("Actual Tution Fee: "+tuitionFee);
        System.out.println("Total Discount Applied: "+(discount*100)+" %");
        System.out.println("Tution Fee To Pay After Discount: "+discountedFee);
    }
}
