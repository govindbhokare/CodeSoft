package atm;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0); // Initial balance
        ATM atm = new ATM(account);
        atm.start();
    }
}
