package test.java;

import main.java.Bank;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test
    public void canDepositMoney() {
        Bank bank = new Bank();
        bank.deposit(100);

        assertEquals(100, bank.showBalance());
    }
}