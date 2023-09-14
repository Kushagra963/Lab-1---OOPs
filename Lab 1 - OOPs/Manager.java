//(Inherits from Employee)
public class Manager extends Employee {
    private String title;

    public Manager(String firstName, String lastName, String title) {
        super(firstName, lastName);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
