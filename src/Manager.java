import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee implements ICrud<Employee>{

    private List<Employee> subjectsList;

    public Manager(String firstName, String surname, String birthday, String startWorkDay) {
        super(firstName, surname, birthday, startWorkDay);
        subjectsList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Manager: " + super.toString();
    }

    @Override
    public void add(Employee employee) {
        if (employee == null) {
            System.out.println("Incorrect employee");
            return;
        }
        if (subjectsList.contains(employee)) {
            System.out.println("This employee already exists");
            return;
        }
        subjectsList.add(employee);
        System.out.println("Employee has been added in the list");
    }

    @Override
    public void delete(Employee employee) {
        if(employee == null){
            System.out.println("Incorrect data");
            return;
        }
        if(!subjectsList.contains(employee)){
            System.out.println("Employee not found");
            return;
        }
        subjectsList.remove(employee);
        System.out.println("Employee has been deleted from the list");
    }

    @Override
    public void read() {
        for(Employee employee : subjectsList){
            System.out.println(employee);
        }
    }
}
