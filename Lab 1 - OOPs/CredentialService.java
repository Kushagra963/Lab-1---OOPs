import java.util.Random;

public class CredentialService {
    private static final String COMPANY = "abc.com";

    public String generateEmailAddress(Employee employee) {
        String firstName = employee.getFirstName().toLowerCase();
        String lastName = employee.getLastName().toLowerCase();
        String department = employee.getDepartment().toLowerCase();

        return firstName + lastName + "@" + department + "." + COMPANY;
    }

    public String generatePassword() {
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()-_+=<>?";

        String allChars = capitalLetters + smallLetters + numbers + specialChars;

        StringBuilder password = new StringBuilder();
        Random rand = new Random();

        password.append(capitalLetters.charAt(rand.nextInt(capitalLetters.length())));
        password.append(smallLetters.charAt(rand.nextInt(smallLetters.length())));
        password.append(numbers.charAt(rand.nextInt(numbers.length())));
        password.append(specialChars.charAt(rand.nextInt(specialChars.length())));

        for (int i = 4; i < 8; i++) {
            password.append(allChars.charAt(rand.nextInt(allChars.length())));
        }

        return password.toString();
    }

    public void showCredentials(Employee employee) {
        String email = generateEmailAddress(employee);
        String password = generatePassword();

        employee.setEmail(email);
        employee.setPassword(password);

        System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows:");
        System.out.println("Email ---> " + email);
        System.out.println("Password ---> " + password);
    }
}
