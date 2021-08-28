import java.util.ArrayList;
import java.util.Collections;

public class Statement {
    public ArrayList<String> transactions = new ArrayList<>();
    public String output = "";

    public void addTransaction(String transaction) {
        transactions.add(transaction);
    }

    public String printStatement() {
        this.transactions.add("date || credit || debit || balance");
        Collections.reverse(this.transactions);
        this.transactions.forEach(transaction -> {
            this.output += transaction + "\n";
        });
        return this.output;
    }
}
