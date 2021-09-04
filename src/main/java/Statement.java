import java.util.ArrayList;
import java.util.Collections;

public class Statement {
    public ArrayList<String> transactions;
    public String output = "";

    public Statement(ArrayList<String> transactions) {
        this.transactions = transactions;
    }

    public Statement() {
    }

    public String printStatement() {
        this.output = "";
        this.output += "date || credit || debit || balance" + "\n";
        Collections.reverse(this.transactions);
        this.transactions.forEach(transaction -> {
            this.output += transaction + "\n";
        });
        return this.output;
    }
}
