package practice.decorator;

public class ExtraCheese extends Decorator{

    Pizza pizza;

    public ExtraCheese(Pizza basePizza){
        this.pizza = basePizza;
    }

    @Override
    public int cost(){
        System.out.println("In cost "+this.getClass().getSimpleName());
        return pizza.cost() + 5;
    }
}
