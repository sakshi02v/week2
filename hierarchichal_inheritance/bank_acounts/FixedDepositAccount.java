package hierarchichal_inheritance.bank_acounts;

class FixedDepositAccount extends BankAccount{
    double fixedDeposit;
    FixedDepositAccount(int accountNumber,double balance,double fixedDeposit){
        super(accountNumber,balance);
        this.fixedDeposit=fixedDeposit;
    }
    public void displayAccountType(){
        System.out.println("Fixed Deposit Account");
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Balance:"+balance);
        System.out.println("Fixed Deposit amount:"+fixedDeposit);
    }
}
