package PaymentSystem;

public class CreditCard extends Payment{

    public CreditCard(double amount, String currency){
        super(amount, currency);
    }

    @Override 
    public  void pay(){
        System.out.println("Paid: " + amount + " " + currency + "  with Credet Card");
    }
    
}
