package fifteen_polymorphism;

// Contract for payment
public interface Payment {
    
    // process payment
    public void processPayment(double amount);

    // generate receipt
    public void generateReceipt(String transactionId);

}
