package fifteen_polymorphism;

import java.util.Scanner;

public class UPIPayment extends AbstractPayment {

    private String upiId;
    private String upiPaymentType;

    public String getUpiId(){
        return upiId;
    }

    public void setUpiId(String upiId) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UPI ID");
        sc.nextLine(); // buffer
        upiId = sc.nextLine();
        this.upiId = upiId;
    }

    public String getUpiPaymentType(){
        return upiPaymentType;
    }

    public void setUpiPaymentType(String upiPaymentType) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UPI Type Gpay / PhonePe / PayTM");
        sc.nextLine(); // buffer
        upiId = sc.nextLine();
        this.upiPaymentType = upiPaymentType;
    }


    @Override
    public void processPayment(double amount) {
        System.out.println("Processing via UPI for Payment: "+amount);
    }



}
