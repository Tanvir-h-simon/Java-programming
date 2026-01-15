public class Main {
    public static void main(String[] args) {

        Account account = new Account("George", 1122, 1000);
        account.setAnnualInterestRate(1.5); // 1.5% annual interest

        // Deposits
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        // Withdrawals
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println("Account Holder: " + account.getName());
        System.out.println("Account ID: " + account.getId());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Annual Interest Rate: " + account.getAnnualInterestRate() + "%");
        System.out.println("\nTransactions:");
        for (Transaction t : account.getTransactions()) {
            System.out.println(t);
        }
    }
}