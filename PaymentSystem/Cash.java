package PaymentSystem;

public class Cash extends Payment {
    public Cash(double amount, String currency){
        super(amount, currency);
    }
    @Override
    public void pay(){
        System.out.println("Paid" + amount + " " + currency + " in Cash");
    }
    
}
