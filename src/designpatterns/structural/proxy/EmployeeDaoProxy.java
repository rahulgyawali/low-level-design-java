package designpatterns.structural.proxy;

public class EmployeeDaoProxy implements EmployeeDao{
    EmployeeDao employeeDao;

    EmployeeDaoProxy(){
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, EmployeeDo employeeDo) throws Exception{
        if(client.equals("ADMIN")){
            employeeDao.create(client,employeeDo);
        }
        throw new Exception("Access Denied");
    }
    @Override
    public void delete(String client, int employeeId) throws Exception{
        if(client.equals("ADMIN")){
            employeeDao.delete(client,employeeId);
        }
        throw new Exception("Access Denied");

    }
    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception{
        if(client.equals("ADMIN")){
            employeeDao.get(client,employeeId);
        }
        throw new Exception("Access Denied");
    }
}
