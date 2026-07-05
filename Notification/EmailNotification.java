package Notification;

public class EmailNotification implements Notification {
    @Override
    public void sendMassage(){
        System.out.println("Email send successfully.");
    }
    
}
