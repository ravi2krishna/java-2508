package fifteen_polymorphism;

import java.util.Scanner;

public class NetBankingPayment extends AbstractPayment {

    private String bankName;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bank Name");
        bankName += sc.next();
        sc.nextLine(); // buffer
        this.bankName = bankName;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing via NetBanking for Payment: "+amount);
    }

}
