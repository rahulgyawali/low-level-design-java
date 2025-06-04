package headfirstdesignpatterns.factory.abstracted;

public class Client {
    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("Bacon");
    }
}
