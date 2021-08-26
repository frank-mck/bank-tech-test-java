import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;

public class TransactionTest {
    @Test
    public void viewDebitTransactionLog() {
        Transaction transaction = new Transaction(LocalDate.of(2021, 3, 21), 500, "debit", 1000);
        transaction.addTransaction();

        assertEquals(LocalDate.of(2021, 3, 21) + " || - || 500.0 || 500.0", transaction.log);
    }

    @Test
    public void viewCreditTransactionLog() {
        Transaction transaction = new Transaction(LocalDate.now(), 500, "credit", 1000);
        transaction.addTransaction();

        assertEquals(LocalDate.now() + " || 500.0 || - || 1500.0", transaction.log);
    }

    @Test
    public void throwErrorWhenWrongTransactionType() {
        Transaction transaction = new Transaction(LocalDate.now(), 4000, "cwedit",  2000);

        Assertions.assertThrows(ArithmeticException.class, () ->
                transaction.addTransaction());
    }
}
