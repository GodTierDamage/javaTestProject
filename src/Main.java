import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ListOfEmployees list = new ListOfEmployees();
        String path = "Employees.txt";
        try{
            list.loadList(path);
        }catch (IOException e){
            System.out.println("Download error");
            e.printStackTrace();
        }
        list.read();
        System.out.println("__________________________________________________________________");
        ListManager.sortByStartWorkDay(list);
        list.read();
    }
}
