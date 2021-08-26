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
            throw new ArithmeticException("Cannot deposit negative amount");
        }
        this.balance += amount;
   }

   public void withdraw(int amount) {
        if (amount > this.balance) {
            throw new ArithmeticException("Amount exceeds account balance of " + this.balance);
        }
       this.balance -= amount;
   }

   public float showBalance() {
       return this.balance;
   }
}