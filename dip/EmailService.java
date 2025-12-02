package dip;

public class EmailService implements MessageSender {
    @Override
    public void send(String to, String message) {
        System.out.println("Sending EMAIL to " + to + ": " + message);
    }
}