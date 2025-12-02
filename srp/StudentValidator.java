package srp;

public class StudentValidator {
    public StudentValidator() {}
    public boolean isValid(String name, String email){
        if(name == null || name.isBlank()|| email == null || !email.contains("@")){
            return false;
        }
        return true;
    }

}
