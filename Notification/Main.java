package Notification;

public class Main {
    public static void main(String[] args){
        Notification N1 = new EmailNotification();
        Notification N2 = new SMSNotification();
        Notification N3 = new WhatsAppNotification();

        N1.sendMassage();
        N2.sendMassage();
        N3.sendMassage();
    }
    
}
