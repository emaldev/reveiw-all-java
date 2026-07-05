package PaymentSystem;

public class PayPal extends Payment{
    public PayPal(double amount , String currency){
        super(amount, currency);
    }

    @Override
    public void pay(){
        System.out.println("Paid :" + amount + " " +  currency+ " with payPal");
    }
    
}
