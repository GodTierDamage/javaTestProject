import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        ListOfEmployees list = new ListOfEmployees();
        ListManager listManager = new ListManager(list);

        try {
            listManager.fillList("Employees.txt");
        }
        catch (IOException e){
            System.out.println("Ошибка загрузки файла");
            e.printStackTrace();
        }

        if(!list.getListOfEmployees().isEmpty()){
           listManager.read();
        }
    }
}
