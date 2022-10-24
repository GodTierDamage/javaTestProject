import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Loader implements ImportEmployees<Employee>{

    @Override
    public List<Employee> load(String path) throws IOException {
        List<Employee> list = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new FileReader(path));
        while(true){
            String line = bf.readLine();
            if(line == null)
                break;
            String[] data = line.split(";");
            if(data[0] == null){
                break;
            }
            if(data[0].equals("manager")){
                list.add(new Manager(data[1], data[2], data[3], data[4]));
            }
            else if(data[0].equals("other"))
                list.add(new Other(data[1], data[2], data[3], data[4], data[5]));
            else
                System.out.println("Incorrect speciality");
        }
        bf.close();
        return list;
    }
}
