import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListOfEmployees{

    private List<Employee> listOfEmployees;

    public List<Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public ListOfEmployees(){
        listOfEmployees = new ArrayList<>();
    }
}
