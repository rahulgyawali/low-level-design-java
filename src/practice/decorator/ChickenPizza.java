package practice.decorator;

public class ChickenPizza extends Pizza{
    @Override
    public int cost(){
        System.out.println("In cost "+this.getClass().getSimpleName());
        return 90;
    }
}
