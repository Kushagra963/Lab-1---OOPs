import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the department from the following");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");

        int choice = scanner.nextInt();
        String department;

        switch (choice) {
            case 1:
                department = "tech";
                break;
            case 2:
                department = "admin";
                break;
            case 3:
                department = "hr";
                break;
            case 4:
                department = "legal";
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.print("Enter your first name: ");
        String firstName = scanner.next();

        System.out.print("Enter your last name: ");
        String lastName = scanner.next();

        Employee employee = new Employee(firstName, lastName);
        employee.setDepartment(department);

        CredentialService credentialService = new CredentialService();
        credentialService.showCredentials(employee);

        // Example of Manager class (Inheritance)
        Manager manager = new Manager("John", "Doe", "Senior Manager");
        manager.setDepartment("tech");
        credentialService.showCredentials(manager);
    }
}
