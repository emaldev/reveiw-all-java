package Notification;

public class SMSNotification implements Notification{
    @Override
    public void sendMassage(){
        System.out.println("SMS send successfully.");
    }
    
}
