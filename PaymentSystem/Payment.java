package PaymentSystem;

public abstract class Payment {
    public double amount;
    public String currency;

    public Payment(double amount , String currency){
        this.amount = amount;
        this.currency = currency;

    }
    public abstract void pay();
    
}
