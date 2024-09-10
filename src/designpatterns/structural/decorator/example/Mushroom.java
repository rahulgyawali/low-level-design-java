package designpatterns.structural.decorator.example;

public class Mushroom extends ToppingDecorator{

    BasePizza basePizza;

    Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return basePizza.cost()+15;
    }
}
