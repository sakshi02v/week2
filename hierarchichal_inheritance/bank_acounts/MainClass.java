package hierarchichal_inheritance.bank_acounts;

public class MainClass{
    public static void main(String[] args) {
        BankAccount savings=new SavingsAccount(114548874,100000,10);
        savings.displayAccountType();
        System.out.println("");
        BankAccount checks=new CheckingAccount(114548874, 100000, 10000);
        checks.displayAccountType();
        System.out.println("");
        BankAccount fixed=new FixedDepositAccount(114548874, 100000, 20000);
        fixed.displayAccountType();
    }
}
