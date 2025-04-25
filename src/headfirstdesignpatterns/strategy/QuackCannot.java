package headfirstdesignpatterns.strategy;

public class QuackCannot implements QuackingBehavior{
    public void quack(){
        System.out.println("I cannot quack!");
    }
}
