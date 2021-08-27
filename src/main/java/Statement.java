public class Statement {
    public Bank bank;

    public Statement(Bank bank) {
      this.bank = new Bank();
    }

    public Statement() {

    }

    public Bank printStatement() {
        return this.bank;
    }
}
