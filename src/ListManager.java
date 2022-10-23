import java.util.Collections;
import java.util.Comparator;

public class ListManager {

    ListOfEmployees list;

    public ListManager(ListOfEmployees list){
        this.list = list;
    }

    public Employee take(){
        int random = (int) (Math.random() * list.getListOfEmployees().size());
        return list.getListOfEmployees().remove(random);
    }

    public static void sortBySurname(ListOfEmployees list){
        Collections.sort(list.getListOfEmployees(), Comparator.comparing(Employee::getSurname));
    }

    public static void sortByStartWorkDay(ListOfEmployees list){
        Collections.sort(list.getListOfEmployees(), Comparator.comparing(Employee::getStartWorkDay));
    }
}
