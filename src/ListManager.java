import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class ListManager implements ICrud<Employee> {

    ListOfEmployees list;
    Loader loader;

    public ListManager(ListOfEmployees list) {
        this.list = list;
        loader = new Loader();
    }

    public Employee take() {
        int random = (int) (Math.random() * list.getListOfEmployees().size());
        return list.getListOfEmployees().remove(random);
    }

    public static void sortBySurname(ListOfEmployees list) {
        list.getListOfEmployees().sort(Comparator.comparing(Employee::getSurname));
    }

    public static void sortByStartWorkDay(ListOfEmployees list) {
        list.getListOfEmployees().sort(Comparator.comparing(Employee::getStartWorkDay));
    }

    @Override
    public void add(Employee employee) {
        if (employee == null) {
            System.out.println("Incorrect employee");
            return;
        }
        if (list.getListOfEmployees().contains(employee)) {
            System.out.println("This employee already exists");
            return;
        }
        list.getListOfEmployees().add(employee);
        System.out.println("Employee has been added");
    }

    @Override
    public void delete(Employee employee) {
        if (employee == null) {
            System.out.println("Incorrect data");
            return;
        }
        if (!list.getListOfEmployees().contains(employee)) {
            System.out.println("Employee not found");
            return;
        }
        list.getListOfEmployees().remove(employee);
        System.out.println("Employee has been deleted from the list");
    }

    @Override
    public void read() {
        for (Employee employee : list.getListOfEmployees()) {
            System.out.println(employee);
        }
    }

    public void fillList(String path) throws IOException {
        List<Employee> newList = loader.load(path);
        for(Employee employee : newList){
            add(employee);
        }
    }
}
