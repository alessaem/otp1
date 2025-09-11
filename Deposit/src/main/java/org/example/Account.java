package org.example;

public class Account {
    private double balance;

    public Account(){
        balance = 0.0;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
        }
    }

    public double withdraw(double amount){
       if(amount <= balance && amount > 0){
           balance = balance - amount;
           return amount;
       }
       return 0.0;
    }

    public double getBalance(){
        return balance;
    }
}
