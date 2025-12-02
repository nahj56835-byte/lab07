public class StudentManager {
    private StudentValidator validator;
    private StudentRepository repo; 
    private EmailService emailService;  
    public StudentManager(StudentValidator validator, StudentRepository repo, EmailService emailService){
        this.validator = validator;
        this.repo = repo;
        this.emailService = emailService;
    } 
    public void addStudent(String name, String email) {
    // 1. validate data
    if(!validator.isValid(name, email)) {
        System.out.println("Invalid student data.");
    }
    
    // 2. save to "database"
    repo.save(name, email);
    // 3. send welcome email
    emailService.sendWelcomeEmail(email);
}
}
