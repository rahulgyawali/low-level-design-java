package headfirstdesignpatterns.decorator;

public class ExtraCheese extends ToppingDecorator{

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        System.out.println(">> Adding Cost for "+this.getClass().getSimpleName());
        return basePizza.cost() + 5;
    }
}
