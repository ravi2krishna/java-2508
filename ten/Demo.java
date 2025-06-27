package ten;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // Username shoould have atleast 4 letters
        System.out.println("Enter Username: ");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();

        // length method    
        if (username.length()>=4) {
            String formatedUsername = username.toLowerCase();
            System.out.println("Welcome: "+formatedUsername);
        } else {
            System.out.println("Please Input Username With Atleast 4 Characters: "+username+ " is invalid");
        }

        System.out.println("Enter Gender: ");
        String gender = sc.nextLine();

        // chartAt method
        if (gender.charAt(0) == 'M' || gender.charAt(0) == 'm' || gender.charAt(0) == 'F' || gender.charAt(0) == 'f'  ) {
            System.out.println("Valid Option");
        } else {
            System.out.println("InValid Option");
        }

        // gmail functionality --> given username should be converted to lowercase
        // toLowerCase method
        System.out.println("Original Username Given: "+username);
        System.out.println("Formated Username: "+username.toLowerCase());

        // reset password functionality
        System.out.println("Enter Password: ");
        String password = sc.nextLine();

        System.out.println("Re Enter Same Password: ");
        String passwordMatched = sc.nextLine();

        // validate if both passwords are same
        // equals method
        if (password.equals(passwordMatched)) {
            System.out.println("Password Changed Successfully");
        } else {
            System.out.println("Passwords Should Match, Retry");
        }

        // PAN CARD functionality
        System.out.println("Enter PAN: ");
        String pan = sc.nextLine();

        // toUpperCase method
        System.out.println("Formated PAN: "+pan.toUpperCase());

        // check if email is valid functionality
        // every email should have "@" 
        System.out.println("Enter Email: ");
        String email = sc.nextLine();

        // contains method
        if (email.contains("@")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("InValid Email");
        }

        System.out.println("Enter Mobile Number: ");
        String phoneNumber = sc.nextLine();
        // startsWith
        if (phoneNumber.startsWith("+1")) {
            System.out.println("Call Connected To USA");
        } else if (phoneNumber.startsWith("+86")) {
            System.out.println("Call Connected To CHINA");
        } else if (phoneNumber.startsWith("+91")) {
            System.out.println("Call Connected To India");
        }
        else {
            System.out.println("Can Only call USA, CHINA & INDIA");
        }
        
        // check if email can be synchronised
        // every email should have "@gmail" as suffix  
        System.out.println("Enter Email: ");
        
        // endsWith method
        if (email.endsWith("@gmail.com")) {
            System.out.println("Synchronization Started");
        } else {
            System.out.println("InValid Email Given Only gmails will work");
        }

    }
}
