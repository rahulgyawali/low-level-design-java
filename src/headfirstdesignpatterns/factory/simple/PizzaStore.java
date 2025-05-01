package headfirstdesignpatterns.factory.simple;

public class PizzaStore {
    PizzaFactory factory;
    public PizzaStore(PizzaFactory factory){
        this.factory = factory;
    }

    public void orderPizza(String pizzaType){
        Pizza pizza;
        pizza = factory.createPizza(pizzaType);
        pizza.prepare();
        pizza.box();

    }
}
