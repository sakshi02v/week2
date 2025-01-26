package hierarchichal_inheritance.bank_acounts;

class BankAccount{
    int accountNumber;
    double balance;
    BankAccount(int accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void displayAccountType(){
        System.out.println("Display accounts:");
    }
}
