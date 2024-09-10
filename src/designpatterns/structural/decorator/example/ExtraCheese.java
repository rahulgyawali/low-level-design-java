package designpatterns.structural.decorator.example;

public class ExtraCheese extends ToppingDecorator{

    BasePizza basePizza;

    ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return basePizza.cost()+5;
    }
}
