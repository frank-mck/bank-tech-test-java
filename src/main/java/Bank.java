package main.java;

public class Bank {
    private float balance;

    public Bank() {
        this.balance = 0;
    }

    public Bank(float startingBalance) {
        this.balance += startingBalance;
    }

    public void deposit(int amount) {
        if (amount < this.balance) {
            throw new ArithmeticException("Cannot withdraw negative amount");
        }
        this.balance += amount;
   }

   public void withdraw(int amount) {
       this.balance -= amount;
   }

   public float showBalance() {
       return this.balance;
   }
}