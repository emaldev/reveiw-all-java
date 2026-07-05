package BankManagement;

public class Main {
    public static void main(String[] args){

        BanckAccount b1 = new SavingsAccount("9876543", "Ahmad", 230.90);
        BanckAccount b2 = new CurrentAccount("98765", "Ali", 678.890);
        b1.displyAccountType();
        b2.displyAccountType();
        ((Transaction) b1).processTransaction();
        ((Transaction) b2).processTransaction();
    }
    
}
