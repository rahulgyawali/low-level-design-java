package headfirstdesignpatterns.strategy;

public class FlyCannot implements FlyingBehavior{
    public void fly(){
        System.out.println("I cannot fly!!");
    }
}
