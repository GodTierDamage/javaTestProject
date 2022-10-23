import java.time.LocalDate;

public class Other extends Employee{

    String description;

    public Other(String firstName, String surname, String birthday, String startWorkDay, String description) {
        super(firstName, surname, birthday, startWorkDay);
        this.description = description;
    }

    @Override
    public String toString() {
        return "Other: " +
                super.toString() +
                "description='" + description + '\'' +
                '}';
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
