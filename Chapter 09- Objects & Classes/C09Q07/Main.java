public class Main {
    public static void main(String[] args) {
        Account ac = new Account(1122, 20000);
        ac.setAnnualInterestRate(4.5);
        ac.deposit(3000);
        ac.withdraw(2500);
        System.out.println("Account ID: $" + ac.getID());
        System.out.println("Balance: $" + + ac.getBalance());
        System.out.println("Monthly Interest: " + ac.getMonthlyInterest());
        System.out.println("Date Created: " + ac.getDateCreated());
    }
}