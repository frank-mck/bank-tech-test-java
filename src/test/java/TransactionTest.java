import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;

public class TransactionTest {
    @Test
    public void viewDebitTransactionLog() {
        Transaction transaction = new Transaction(LocalDate.now(), 500, "debit", 1000);
        transaction.addTransaction();

        assertEquals(LocalDate.now() + " || - || 500.0 || 500.0", transaction.log);
    }
}
