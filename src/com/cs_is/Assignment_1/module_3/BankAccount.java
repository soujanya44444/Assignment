package com.cs_is.module_3;

public class BankAccount {
   private double accountNumber;
   private double balance;
   BankAccount(double accountNumber,double balance){
       this.accountNumber=accountNumber;
       this.balance=balance;
   }
   public double getAccountNumber(){
       return accountNumber;
   }
   public double getBalance(){
       return balance;
   }
   public void deposit(double amount){
       if(amount>0){
           balance+=amount;
           System.out.println("Amount deposited: "+amount);
       }
       else{
           System.out.println("Invalid amount");
       }
   }
   public void withdraw(double amount){
       if(amount>0&&amount<=balance){
           balance-=amount;
           System.out.println("Amount withdrawn: "+amount);
       }
       else{
           System.out.println("insufficient balance");
       }
   }

    public static void main(String[] args) {
        BankAccount acc=new BankAccount(12345,600);
        acc.deposit(400);
        acc.withdraw(500);
        System.out.println("Account number: "+acc.getAccountNumber());
        System.out.println("Balance: "+acc.getBalance());
    }
}
