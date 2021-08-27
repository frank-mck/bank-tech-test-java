import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatementTest {
  @DisplayName("Print a statement")
    @Test
    void displayStatement() {
      Statement statement = new Statement();
      Bank bank = new Bank();
      bank.deposit(1000);
      bank.deposit(2000);
      bank.withdraw(500);

      assertEquals("date || credit || debit || balance\n" +
                            "14/01/2021 || - || 500.00 || 2500.00\n" +
                            "13/01/2021 || 2000.00 || - || 3000.00\n" +
                            "10/01/2021 || 1000.00 || - || 1000.00", statement.printStatement());
  }
}
