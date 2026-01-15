import java.util.ArrayList;

public class Account {

    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private ArrayList<Transaction> transactions;

    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getBalance() {
        return balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double rate) {
        this.annualInterestRate = rate;
    }
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, "Deposit"));
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
            return;
        }
        balance -= amount;
        transactions.add(new Transaction('W', amount, balance, "Withdrawal"));
    }

    // Monthly interest
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
}