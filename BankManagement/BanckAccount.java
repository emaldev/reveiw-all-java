package BankManagement;

public abstract class  BanckAccount {
    public String accountNumber;
    public String ownerName;
    public double balance;
    public BanckAccount(String accoutNumber, String ownerName, double balance){
        this.accountNumber = accoutNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public abstract void  displyAccountType();
    
}
