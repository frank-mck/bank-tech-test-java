import java.time.LocalDate;

public class Bank {
    private float balance;
    private final LocalDate date = LocalDate.now();
    private Statement statement = new Statement();

     Bank() {
        this.balance = 0;
    }

     Bank(float startingBalance) {
        this.balance += startingBalance;
    }

     void deposit(float amount) {
        if (amount < 0) {
            throw new ArithmeticException("Cannot deposit negative amount");
        }
        this.balance += amount;
        addTransactions(this.date, amount, TransactionType.CREDIT, this.balance);
   }

     void withdraw(float amount) {
        if (amount > this.balance) {
            throw new ArithmeticException("Amount exceeds account balance of " + this.balance);
        }
        this.balance -= amount;
        addTransactions(this.date, amount, TransactionType.DEBIT, this.balance);
   }

    void addTransactions(LocalDate date, float amount, TransactionType type, float balance) {
         Transaction transaction = new Transaction(date, amount, type, balance);
         transaction.saveTransaction();
         statement.addTransaction(transaction.log);
    }

    public String generateStatement() {
         return this.statement.printStatement();
    }

    float showBalance() {
       return this.balance;
   }
}