class BankAccount {
    public int accountNumber;           // Public member
    protected String accountHolder;     // Protected member
    private double balance;             // Private member

    // Constructor to initialize account details
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }

    // Public method to set the balance
    public void setBalance(double amount) {
        if (amount >= 0) {
            balance = amount;
        } else {
            System.out.println("Invalid balance amount. Balance cannot be negative.");
        }
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + String.format("%.2f", balance));
    }
}

// Subclass to demonstrate access to accountNumber and accountHolder
class SavingsAccount extends BankAccount {
    private double interestRate; // Interest rate specific to savings account

    // Constructor for SavingsAccount
    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance); // Call the parent class constructor
        this.interestRate = interestRate;
    }

    // Method to display savings account details
    @Override
    public void displayDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber); // Accessing public member
        System.out.println("Account Holder: " + accountHolder); // Accessing protected member
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    // Method to calculate interest
    public void calculateInterest() {
        double interest = getBalance() * (interestRate / 100);
        System.out.println("Interest on Current Balance: $" + String.format("%.2f", interest));
    }
}

// Main class to demonstrate functionality
public class BankAccountManagement {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account1 = new BankAccount(101, "Alice Johnson", 5000.0);

        System.out.println("Bank Account Details:");
        account1.displayDetails();

        // Modify the balance
        account1.setBalance(6000.0);
        System.out.println("\nAfter Updating Balance:");
        System.out.println("Balance: $" + account1.getBalance());

        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount(202, "Bob Smith", 8000.0, 3.5);

        System.out.println("\nSavings Account Details:");
        savingsAccount.displayDetails();

        // Calculate interest on savings account balance
        savingsAccount.calculateInterest();
    }
}
