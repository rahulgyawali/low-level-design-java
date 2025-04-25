package headfirstdesignpatterns.strategy;

public class MallardDuck extends Duck{
    public MallardDuck(){
        flyingBehavior = new FlyWithWings();
        quackingBehavior = new QuackSqueak();
    }

    public void display(){
        System.out.println("I am "+MallardDuck.class.getSimpleName());
    }

}
