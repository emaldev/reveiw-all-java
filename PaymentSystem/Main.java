package PaymentSystem;

public class Main {
    public static void main(String[] args){
        Payment Credit = new CreditCard(500.2, "USD");
        Payment myPay = new PayPal(180.0, "EUR");
        Payment cash = new Cash(1900.90, "IRR");

        Credit.pay();
        myPay.pay();
        cash.pay();

    }
    
}
