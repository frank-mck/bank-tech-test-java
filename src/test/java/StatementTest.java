import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatementTest {
  @DisplayName("Print a statement with header")
    @Test
    void displayStatement() {
      Bank bank = new Bank();
      bank.deposit(200);
      Statement statement = new Statement(bank.transactions);

      assertEquals("date || credit || debit || balance" + "\n" +
                             LocalDate.now() + " || " + "200.0" + " || - || 200.0" + "\n", statement.printStatement());
  }
}
