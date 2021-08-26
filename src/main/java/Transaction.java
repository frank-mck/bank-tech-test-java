import java.time.LocalDate;

public class Transaction {
    public String log;
    public LocalDate date;
    public String type;
    public float amount;
    public float balance;

    public Transaction(LocalDate date, float amount, String type, float balance) {
        this.amount = amount;
        this.type = type;
        this.balance = balance;
        this.date = date;
    }

    public void addTransaction() {
        if (this.type == "credit") {
            this.log = this.date + " || " + this.amount + " || - || " + (this.balance + this.amount);
        } else if (this.type == "debit") {
            this.log = this.date + " || - || " + this.amount + " || " + (this.balance - this.amount);
        }
    }
}
