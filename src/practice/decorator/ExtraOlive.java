package practice.decorator;

public class ExtraOlive extends Pizza{

    Pizza pizza;

    public ExtraOlive(Pizza basePizza){
        this.pizza = basePizza;
    }

    @Override
    public int cost() {
        System.out.println("In cost "+this.getClass().getSimpleName());
        return pizza.cost()+2;
    }
}
