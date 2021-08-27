import java.time.LocalDate;

class Transaction {
    String log;
    LocalDate date;
    TransactionType type;
    float amount;
    float balance;

    Transaction(LocalDate date, float amount, TransactionType type, float balance) {
        this.amount = amount;
        this.type = type;
        this.balance = balance;
        this.date = date;
    }


    void addTransaction() {
        if (this.type == TransactionType.CREDIT) {
            this.log = this.date + " || " + this.amount + " || - || " + (this.balance + this.amount);
        } else if (this.type == TransactionType.DEBIT) {
            this.log = this.date + " || - || " + this.amount + " || " + (this.balance - this.amount);
        } else {
            throw new ArithmeticException("Invalid transaction type");
        }
    }
}
