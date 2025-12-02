package dip;
public class NotificationService {
    private final MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void sendWelcome(String to) {
        sender.send(to, "Welcome to our course!");
    }
}