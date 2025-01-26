package hierarchichal_inheritance.bank_acounts;

class SavingsAccount extends BankAccount{
    double interestRate;
    SavingsAccount(int accountNumber,double balance,double interestRate){
        super(accountNumber,balance);
        this.interestRate=interestRate;
    }
    public void displayAccountType(){
        System.out.println("Savings Account");
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Balance:"+balance);
        System.out.println("Rate of Interest:"+interestRate);
    }
}
