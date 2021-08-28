import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatementTest {
  @DisplayName("Print a statement header")
    @Test
    void displayStatement() {
      Statement statement = new Statement();

      assertEquals("date || credit || debit || balance" + "\n", statement.printStatement());
  }
}
