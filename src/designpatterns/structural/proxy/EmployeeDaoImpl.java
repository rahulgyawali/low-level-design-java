package designpatterns.structural.proxy;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client, EmployeeDo employeeDo){

    }
    @Override
    public void delete(String client, int employeeId){

    }
    @Override
    public EmployeeDo get(String client, int employeeId){
            return new EmployeeDo();
    }

}
