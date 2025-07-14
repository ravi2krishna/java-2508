package fifteen_polymorphism;

public class PaymentProcessor {

    // Net banking payment
    public void makePayment(double amount, String bankName) {
        System.out.println("====== Net Banking Payment");
        NetBankingPayment nb = new NetBankingPayment();
        System.out.println("Amount To Pay: "+amount);
        nb.processPayment(amount);
        nb.generateReceipt(nb.getTransactionId());
    }

    // credit card payment
    public void makePayment(double amount, int cardNumber) {
        System.out.println("====== Credit Card Payment");
        CreditCardPayment cc = new CreditCardPayment();
        System.out.println("Amount To Pay: "+amount);
        cc.processPayment(amount);
        cc.generateReceipt(cc.getTransactionId());
    }

    // upi payment
    public void makePayment(double amount, String upiId, String upiPaymentType) {
         System.out.println("====== UPI Payment");
         UPIPayment upi = new UPIPayment();
         System.out.println("Amount To Pay: "+amount);
         upi.processPayment(amount);
         upi.generateReceipt(upi.getTransactionId());

    }


}
