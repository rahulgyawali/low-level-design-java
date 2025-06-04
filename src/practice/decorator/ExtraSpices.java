package practice.decorator;

public class ExtraSpices extends Decorator{

    Pizza pizza;

    public ExtraSpices(Pizza basePizza){
        this.pizza = basePizza;
    }

    @Override
    public int cost(){
        System.out.println("In cost "+this.getClass().getSimpleName());
        return pizza.cost()+1;
    }

}
