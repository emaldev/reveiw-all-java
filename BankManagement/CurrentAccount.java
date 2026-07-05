package BankManagement;

public class CurrentAccount extends BanckAccount implements Transaction {
    public CurrentAccount(String accoutNumber, String ownerName, double balance){
        super(accoutNumber, ownerName, balance);
    }

    @Override
    
     public void displyAccountType(){
        System.out.println("Current Account.");
     }
     @Override 
     public void processTransaction(){
        System.out.println("Withdrawal completed.");
     }
    
}
