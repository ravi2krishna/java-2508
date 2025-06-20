package six;

import java.util.*;
public class Emi_Calculator {
  double car_Price;
  double down_Payment;
  double rate_of_interest;
  byte tenure;
  double total_loan_amount;
  double payable_amount;
  double emi;
  public void calcuation(){
      Scanner in = new Scanner(System.in);
      System.out.println("Enter OnRoad Price : ");
      car_Price = in.nextDouble();
      System.out.println("Enter Down Payment : ");
      down_Payment = in.nextDouble();
      System.out.println("Enter Rate Of Interest : ");
      rate_of_interest = in.nextDouble();
      System.out.println("Enter Tenure : ");
      tenure = in.nextByte();
      total_loan_amount = car_Price - down_Payment;
      double r = (rate_of_interest/(12*100));
      int n = tenure*12;
      emi = ((total_loan_amount)*(r)*(Math.pow((1+r),n)))/(Math.pow((1+r),n) - 1);
      payable_amount = n * emi;
      System.out.println("-----------CALCULATE EMI OF CAR-----------------");
      System.out.println("OnRoad Price of a car : " + car_Price);
      System.out.println("Down Payment : " + down_Payment);
      System.out.println("Rate Of Interest : " + rate_of_interest);
      System.out.println("Toatal Loan Amount : " + total_loan_amount);
      System.out.println("Toata Payable Amount After Tenure : " + payable_amount);
      System.out.println("Mnthly EMI : " + emi);
  }
}
