public class TypeChanger {

    private TypeChanger(){}

    public static Employee changeType(Employee employee){
        if(employee instanceof Manager){
            employee = new Other(employee.getFirstName(), employee.getSurname(),
                    employee.getBirthday().toString(), employee.getStartWorkDay().toString(), "without description");
            System.out.println("Employees type has been changed from manager to other");
        }
        else if(employee instanceof Other){
            employee = new Manager(employee.getFirstName(), employee.getSurname(),
                    employee.getBirthday().toString(), employee.getStartWorkDay().toString());
            System.out.println("Employees type has been changed from other to manager");
        }
        return employee;
    }
}
