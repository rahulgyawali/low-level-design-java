package headfirstdesignpatterns.strategy;

public abstract class Duck {

    public FlyingBehavior flyingBehavior;
    public QuackingBehavior quackingBehavior;

    public void swim(){
        System.out.println("All can Swim!!!");
    }

    public abstract void display();

    public void performFly(){
        flyingBehavior.fly();
    }

    public void performQuack(){
        quackingBehavior.quack();
    }

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
        duck.swim();
        duck.display();
    }
}
