package designpatterns.structural.proxy;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client, EmployeeDo employeeDo){
        System.out.println("Table Created");
    }
    @Override
    public void delete(String client, int employeeId){
        System.out.println("Table deleted");
    }
    @Override
    public EmployeeDo get(String client, int employeeId){
        System.out.println("Data fetched");
        return new EmployeeDo();
    }

}
