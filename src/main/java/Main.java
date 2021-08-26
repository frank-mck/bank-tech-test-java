
public class Main {
    public static void main(String[] args) {
        Bank bank1 = new Bank(5000);
        bank1.withdraw(1000);

        System.out.println("Bank1 has a balance of " + bank1.showBalance());
    }
}
