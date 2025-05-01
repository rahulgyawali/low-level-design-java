package headfirstdesignpatterns.decorator;

public class ExtraOlives extends ToppingDecorator{
    BasePizza basePizza;
    public ExtraOlives(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        System.out.println(">> Adding Cost for "+this.getClass().getSimpleName());
        return basePizza.cost()+10;
    }
}
