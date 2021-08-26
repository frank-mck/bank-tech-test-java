package test.java;

import main.java.Bank;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test
    public void cannotDepositNegativeAmount() {
      Bank bank = new Bank();

      Assertions.assertThrows(ArithmeticException.class, () ->
          bank.deposit(-100));
    }

    @Test
    public void cannotWithdrawGreaterThanBalance() {
        Bank bank = new Bank(100);

        Assertions.assertThrows(ArithmeticException.class, () ->
                bank.withdraw(101));
    }

    @Test
    public void canDepositMoney() {
        Bank bank = new Bank();
        bank.deposit(100);

        assertEquals(100, bank.showBalance());
    }

    @Test
    public void canWithdrawMoney() {
        Bank bank = new Bank(100);
        bank.withdraw(50);

        assertEquals(50, bank.showBalance());
    }
}