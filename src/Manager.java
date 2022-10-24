public class Manager extends Employee{

    private ListOfEmployees employeesListForManager;
    private ListManager listManager;

    public Manager(String firstName, String surname, String birthday, String startWorkDay) {
        super(firstName, surname, birthday, startWorkDay);
        employeesListForManager = new ListOfEmployees();
        listManager = new ListManager(employeesListForManager);
    }

    @Override
    public String toString() {
        return "Manager: " + super.toString();
    }

    }
