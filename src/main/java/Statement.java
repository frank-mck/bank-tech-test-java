import java.util.ArrayList;
import java.util.Collections;

public class Statement {
    public String output = "";

    public String printStatement(ArrayList<String> transactions) {
        this.output = "";
        this.output += "date || credit || debit || balance" + "\n";
        Collections.reverse(transactions);
        transactions.forEach(transaction -> {
            this.output += transaction + "\n";
        });
        return this.output;
    }
}
