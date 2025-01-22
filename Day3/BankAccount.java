public class BankAccount {
    // Static variable
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    // Final variable
    private final int accountNumber;

    // Instance variables
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, int accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName; // Resolving ambiguity with 'this'
        this.accountNumber = accountNumber; // Final variable assigned only once
        this.balance = initialBalance;

        // Increment the static counter for total accounts
        totalAccounts++;
    }
    
    // Static method
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Getter for bankName
    public static String getBankName() {
        return bankName;
    }

    // Display account details
    public void displayAccountDetails() {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
    
    }

    public static void main(String[] args) {
        // Creating bank account objects
        BankAccount account1 = new BankAccount("Alice", 1001, 5000.0);
        if(account1 instanceof BankAccount){  // Checking instance with `instanceof`
            // Display details of the account 1
        account1.displayAccountDetails();
        }
        else{
            System.out.println("Invalid account object."); 
        }
System.out.println();
        BankAccount account2 = new BankAccount("Bob", 1002, 3000.0);
        if(account2 instanceof BankAccount){
            // Display details of the account 2
        account2.displayAccountDetails();
        }else{
            System.out.println("Invalid account object.");  
        }
        // Display the total number of accounts
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}
