package headfirstdesignpatterns.decorator;

public class ExtraOlives extends ToppingDecorator{
    BasePizza basePizza;
    public ExtraOlives(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+10;
    }
}
