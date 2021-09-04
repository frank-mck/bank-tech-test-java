
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.deposit(1000);
        bank.deposit(2000);
        bank.withdraw(500);

        System.out.println(bank.generateStatement());

        bank.deposit(1000);
        bank.deposit(2000);
        bank.withdraw(500);

        System.out.println(bank.generateStatement());
        bank.deposit(1000);
        bank.deposit(2000);
        bank.withdraw(500);

        System.out.println(bank.generateStatement());

    }
}
