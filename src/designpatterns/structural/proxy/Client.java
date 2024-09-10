package designpatterns.structural.proxy;

public class Client {
    /**
     *
     * Can take care of only one class
     */
    public static void main(String[] args) {
        try{
            EmployeeDaoProxy proxy = new EmployeeDaoProxy();
            proxy.create("ABC",new EmployeeDo());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
