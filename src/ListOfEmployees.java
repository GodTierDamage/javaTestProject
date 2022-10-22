import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListOfEmployees implements ICrud{

    List<Employee> listOfEmployees;
    Loader loader;

    public ListOfEmployees(){
        listOfEmployees = new ArrayList<>();
        loader = new Loader();
    }

    @Override
    public void add(Employee employee) {
        if(employee == null){
            System.out.println("Incorrect employee");
            return;
        }
        if(listOfEmployees.contains(employee)){
            System.out.println("This employee already exists");
            return;
        }
        listOfEmployees.add(employee);
        System.out.println("Employee has been added");
    }

    @Override
    public void delete(Employee employee) {
        if(employee == null){
            System.out.println("Incorrect data");
            return;
        }
        if(!listOfEmployees.contains(employee)){
            System.out.println("Employee not found");
            return;
        }
        listOfEmployees.remove(employee);
        System.out.println("Employee has been deleted from the list");
    }

    @Override
    public void read() {
        for(Employee employee : listOfEmployees){
            System.out.println(employee);
        }
    }

    public void loadList(String path) throws IOException {
        List<Employee> newList = loader.load(path);
        for(Employee employee : newList){
            add(employee);
        }
    }
}
