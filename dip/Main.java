package dip;
public class Main {
    public static void main(String[] args) {
       
        NotificationService emailNotif = new NotificationService(new EmailService());
        emailNotif.sendWelcome("tin@example.com");

        NotificationService smsNotif = new NotificationService(new SmsService());
        smsNotif.sendWelcome("0123456789");
    }
}