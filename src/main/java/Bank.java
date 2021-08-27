import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Bank {
    private float balance;
    private final LocalDate date = LocalDate.now();
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();

     Bank() {
        this.balance = 0;
    }

     Bank(float startingBalance) {
        this.balance += startingBalance;
    }

     void deposit(float amount) {
        if (amount < this.balance) {
            throw new ArithmeticException("Cannot deposit negative amount");
        }
        this.balance += amount;
        transactions.add(new Transaction(LocalDate.now(), amount, TransactionType.CREDIT, this.balance));
   }

     void deposit(float amount, LocalDate date) {
        if (amount < this.balance) {
            throw new ArithmeticException("Cannot deposit negative amount");
        }
        this.balance += amount;
        transactions.add(new Transaction(date, amount, TransactionType.CREDIT, this.balance));
    }

    void withdraw(float amount) {
        if (amount > this.balance) {
            throw new ArithmeticException("Amount exceeds account balance of " + this.balance);
        }
       this.balance -= amount;
       this.transactions.add(new Transaction(LocalDate.now(), amount, TransactionType.DEBIT, this.balance));
   }

     void withdraw(float amount, LocalDate date) {
        if (amount > this.balance) {
            throw new ArithmeticException("Amount exceeds account balance of " + this.balance);
        }
        this.balance -= amount;
        this.transactions.add(new Transaction(date, amount, TransactionType.DEBIT, this.balance));
    }

    float showBalance() {
       return this.balance;
   }
}