import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;

public class TransactionTest {
    @Test
    void viewDebitTransactionLogWithDate() {
        Transaction transaction = new Transaction(LocalDate.of(2021, 3, 21), 500, TransactionType.DEBIT, 1000);

        assertEquals(LocalDate.of(2021, 3, 21) + " || - || 500.0 || 1000.0", transaction.toString());
    }

    @Test
    void viewCreditTransactionLog() {
        Transaction transaction = new Transaction(LocalDate.now(), 500, TransactionType.CREDIT, 1000);

        assertEquals(LocalDate.now() + " || 500.0 || - || 1000.0", transaction.toString());
    }
}
