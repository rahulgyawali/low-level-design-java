package headfirstdesignpatterns.strategy;

public class QuackSqueak implements QuackingBehavior{
    public void quack(){
        System.out.println("I am Squeak!");
    }
}
