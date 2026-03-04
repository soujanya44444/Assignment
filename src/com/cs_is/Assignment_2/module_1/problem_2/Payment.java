package com.cs_is.Assignment_2.module_1.problem_2;

public interface Payment {
    void pay(double amount);
}
class CreditCardPayment implements Payment{
    private String cardNumber;
    public CreditCardPayment(String cardNumber){
        this.cardNumber=cardNumber;
    }
    @Override
    public void pay(double amount){
        System.out.println("Paid "+amount+" using Credit Card: "+cardNumber);
    }
}
class UPIPayment implements Payment{
    private String upiId;
    public UPIPayment(String UpiId){
        this.upiId=upiId;
    }
    @Override
    public void pay(double amount){
        System.out.println("Paid "+amount+" using UPI IP: "+upiId);
    }
}
class Driver{
    public static void main(String[] args) {
        Payment creditCard=new CreditCardPayment("1234-5678-9012-3456");
        Payment upi=new UPIPayment("user@upi");
        creditCard.pay(2500);
        upi.pay(1500);
    }
}
