package main.java;

public class Bank {
   private float balance;

   public void deposit(int amount) {
       balance += amount;
   }

    public void withdraw(int amount) {
       balance -= amount;
   }

   public float showBalance() {
       return balance;
   }
}