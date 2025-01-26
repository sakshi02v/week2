import java.util.ArrayList;
import java.util.List;
// Customer Class
class Customer {
    private String name;
    private int accountNumber;
    private double balance;

    public Customer(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into Account " + accountNumber + ". New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Account " + accountNumber + ". New Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    @Override
    public String toString() {
        return "Customer [Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance + "]";
    }
}

// Bank Class
class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(String customerName, int accountNumber, double initialDeposit) {
        Customer customer = new Customer(customerName, accountNumber, initialDeposit);
        customers.add(customer);
        System.out.println("Customer " + customerName + " with Account Number " + accountNumber + " added to " + name);
    }

    public void displayCustomers() {
        System.out.println("Customers of " + name + ":");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public Customer findCustomerByAccount(int accountNumber) {
        for (Customer customer : customers) {
            if (customer.getAccountNumber() == accountNumber) {
                return customer;
            }
        }
        return null;
    }
}

// Main Class
public class BankCustomerAssociation {
    public static void main(String[] args) {
        // Create a Bank
        Bank bank = new Bank("Simple Bank");

        // Add Customers
        bank.addCustomer("Alice", 101, 500.0);
        bank.addCustomer("Bob", 102, 1000.0);

        // Display All Customers
        bank.displayCustomers();

        // Perform Transactions
        Customer alice = bank.findCustomerByAccount(101);
        if (alice != null) {
            alice.deposit(200.0);
            alice.withdraw(100.0);
        }

        Customer bob = bank.findCustomerByAccount(102);
        if (bob != null) {
            bob.withdraw(1200.0); // Insufficient balance test
        }
    }
}
