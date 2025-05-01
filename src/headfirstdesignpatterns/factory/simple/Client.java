package headfirstdesignpatterns.factory.simple;

public class Client {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);
        pizzaStore.orderPizza(BaconPizza.class.getSimpleName());
    }
}
