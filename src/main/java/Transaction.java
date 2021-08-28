import java.time.LocalDate;

class Transaction {
    public String log;
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

    Transaction(float amount, TransactionType type, float balance) {
        this.amount = amount;
        this.type = type;
        this.balance = balance;
    }


    Transaction saveTransaction() {
        if (this.type == TransactionType.CREDIT) {
            this.log = this.date + " || " + this.amount + " || - || " + this.balance;
        } else if (this.type == TransactionType.DEBIT) {
            this.log = this.date + " || - || " + this.amount + " || " + this.balance;
        } else {
            throw new ArithmeticException("Invalid transaction type");
        }
        return null;
    }
}
