package fifteen_polymorphism;

import java.util.Random;

// common shared functionalities
public abstract class AbstractPayment implements Payment {
    
    private String transactionId;

    // abstract method for specific type of payment
    public abstract void processPayment(double amount);

    // get method
    public String getTransactionId(){
        Random randomID = new Random();
        transactionId = "TX-ID-"+randomID.nextInt(1000000000);
        return transactionId;
    }

    // generate Receipt with some transaction Id
    public void generateReceipt(String transactionId){
        System.out.println("Receipt Generated for Transaction ID: "+transactionId);
    }

}
