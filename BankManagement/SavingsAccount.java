package BankManagement;

public class SavingsAccount extends BanckAccount implements Transaction{

    public SavingsAccount(String accoutNumber, String ownerName, double balance ){
        super(accoutNumber, ownerName, balance);
    }

     @Override 
     public void displyAccountType(){
        System.out.println("Savings Account.");
     }
     @Override 
     public void processTransaction(){
        System.out.println("Deposit completed.");
     }

    
}
