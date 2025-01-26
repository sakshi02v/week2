package hierarchichal_inheritance.bank_acounts;

class CheckingAccount extends BankAccount{
    double withdrawlLimit;
    CheckingAccount(int accountNumber,double balance,double withdrawlLimit){
        super(accountNumber,balance);
        this.withdrawlLimit=withdrawlLimit;
    }
    public void displayAccountType(){
        System.out.println("Checking Account");
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Balance:"+balance);
        System.out.println("Withdrawl limit:"+withdrawlLimit);
    }
}
