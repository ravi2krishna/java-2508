package fourth;

public class ConditionalsDemo {
    public static void main(String[] args) {
        // if condition will only execute if the condition is true
        int num = -12;
        // verify if given num is positive 
        if( num>0 ){
            System.out.println("The given Number is Positive");
        }

        // task check if the number is in given range 10 - 20

        if (num >=10 && num <= 20) {
            System.out.println("The given Number is in range");
        }

        // if-else
        // verify if given num is positive or negative
        if( num>0 ){
            System.out.println("The given Number is Positive");
        } else {
            System.out.println("The given Number is Negative");
        }

        // Voting App
        // int age = 22;
        // if( age>=18 ){
        //     System.out.println("You Can VOTE");
        // } else {
        //     System.out.println("You Cannot VOTE");
        // }

        // Ternary Operator --> concise form of if-else
        // variable = (condition) ? value_if_true:value_if_false;
        //String voteEligibility = (age>=18) ? "You Can VOTE":"You Cannot VOTE";
        // System.out.println(voteEligibility);

        // nested else if (else if ladder)
        int marks = 95;
        if(marks>=90) {
            System.out.println("Grade A");
        } else if (marks>=75) {
            System.out.println("Grade B");
        } else if (marks>=60) {
            System.out.println("Grade C");
        } else {
            System.out.println("FAILED");
        }

        // switch demo
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;            
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Satday");
                break;
            case 7:
                System.out.println("Sunday");
                break;        
            default:
                System.out.println("Invalid Day");
        }

        // fall through use-case
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:         
            case 5:
                System.out.println("WEEKDAYS");
                break;
            case 6:
            case 7:
                System.out.println("WEEKENDS");
                break;        
            default:
                System.out.println("Invalid Day");
        }

        // old switch demo --> problem
        // int age = 25;
        // String category;

        // switch (age) {
        //     case 0:
        //     case 1:
        //     case 2:
        //     case 3:
        //     case 4:
        //         category = "Toddler";
        //         break;

        //     case 5:
        //     case 6:
        //     case 7:
        //     case 8:
        //     case 9:
        //     case 10:
        //     case 11:
        //     case 12:
        //         category = "Child";
        //         break;

        //     case 13:
        //     case 14:
        //     case 15:
        //     case 16:
        //     case 17:
        //     case 18:
        //     case 19:
        //         category = "Teenager";
        //         break;

        //     case 20:
        //     case 21:
        //     case 22:
        //     case 23:
        //     case 24:
        //     case 25:
        //     case 26:
        //         category = "Young Adult";
        //         break;

        //     default:
        //         category = "Adult";
        //         break;
        // }

        // System.out.println(category); // Output: Young Adult

        // new switch demo --> problem fixed --> consice form
        int age = 2;
        String category = switch (age) {
            case 0,1,2,3,4 -> "Toddler";
            case 5, 6, 7, 8, 9, 10, 11, 12 -> "Child";
            case 13, 14, 15, 16, 17, 18, 19 -> "Teenager";
            case 20, 21, 22, 23, 24, 25, 26 -> "Young Adult";
            default -> "Adult";
        };
        System.out.println(category);

    }
}
