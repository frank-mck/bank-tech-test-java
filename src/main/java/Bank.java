import java.util.ArrayList;
import java.time.LocalDate;

public class Bank {
    private float balance;
    private final LocalDate date = LocalDate.now();
    ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    public Bank() {
        this.balance = 0;
    }

    public Bank(float startingBalance) {
        this.balance += startingBalance;
    }

    public void deposit(float amount) {
        if (amount < this.balance) {
            throw new ArithmeticException("Cannot deposit negative amount");
        }
        this.balance += amount;
        transactions.add(new Transaction(LocalDate.now(), amount, "credit", this.balance));
   }

    public void deposit(float amount, LocalDate date) {
        if (amount < this.balance) {
            throw new ArithmeticException("Cannot deposit negative amount");
        }
        this.balance += amount;
        transactions.add(new Transaction(date, amount, "credit", this.balance));
    }

   public void withdraw(float amount) {
        if (amount > this.balance) {
            throw new ArithmeticException("Amount exceeds account balance of " + this.balance);
        }
       this.balance -= amount;
       this.transactions.add(new Transaction(LocalDate.now(), amount, "debit", this.balance));
   }

    public void withdraw(float amount, LocalDate date) {
        if (amount > this.balance) {
            throw new ArithmeticException("Amount exceeds account balance of " + this.balance);
        }
        this.balance -= amount;
        this.transactions.add(new Transaction(date, amount, "debit", this.balance));
    }

   public float showBalance() {
       return this.balance;
   }
}