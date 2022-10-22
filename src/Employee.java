import java.time.LocalDate;
import java.util.Objects;

public abstract class Employee{

    private String firstName;
    private String surname;
    private LocalDate birthday;
    private LocalDate startWorkDay;

    public Employee(String firstName, String surname, String birthday, String startWorkDay) {
        this.firstName = firstName;
        this.surname = surname;
        this.birthday = LocalDate.parse(birthday);
        this.startWorkDay = LocalDate.parse(startWorkDay);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public LocalDate getStartWorkDay() {
        return startWorkDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return firstName.equals(employee.firstName) && surname.equals(employee.surname) && birthday.equals(employee.birthday) && startWorkDay.equals(employee.startWorkDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surname, birthday, startWorkDay);
    }

    @Override
    public String toString() {
        return  "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", startWorkDay='" + startWorkDay + '\'' +
                '}';
    }
}
