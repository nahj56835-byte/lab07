package srp;


public class StudentManagerTest {
    public static void main(String[] args) {
StudentValidator validator = new StudentValidator();
StudentRepository repo = new StudentRepository();
EmailService emailService = new EmailService();
StudentManager manager = new StudentManager(validator, repo, emailService);
manager.addStudent("Tin", "tin@example.com");
}
}
