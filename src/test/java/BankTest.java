import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Bank Test")
public class BankTest {
    @Test
    @DisplayName("cannot deposit negative number")
    void cannotDepositNegativeAmount() {
      Bank bank = new Bank();

      Assertions.assertThrows(ArithmeticException.class, () ->
          bank.deposit(-100));
    }

    @DisplayName("cannot withdraw greater than balance")
    @Test
    void cannotWithdrawGreaterThanBalance() {
        Bank bank = new Bank(100);

        Assertions.assertThrows(ArithmeticException.class, () ->
                bank.withdraw(101));
    }

    @DisplayName("deposit money")
    @Test
    void canDepositMoney() {
        Bank bank = new Bank();
        bank.deposit(100);

        assertEquals(100, bank.getBalance());
    }

    @DisplayName("withdraw money")
    @Test
    void canWithdrawMoney() {
        Bank bank = new Bank(100);
        bank.withdraw(50);

        assertEquals(50, bank.getBalance());
    }

    @DisplayName("view balance")
    @Test
    void canViewBankBalance() {
        Bank bank = new Bank(100);

        assertEquals(100, bank.getBalance());
    }

    @DisplayName("Print a statement")
    @Test
    void canPrintStatement() {
        Bank bank = new Bank();
        bank.deposit(1000);
        bank.deposit(2000);
        bank.withdraw(500);

        assertEquals("date || credit || debit || balance\n" +
                LocalDate.now() + " || - || 500.0 || 2500.0\n" +
                LocalDate.now() + " || 2000.0 || - || 3000.0\n" +
                LocalDate.now() + " || 1000.0 || - || 1000.0\n", bank.generateStatement());
    }
}