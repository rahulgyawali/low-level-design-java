package designpatterns.structural.decorator.example;

public class Client {
    public static void main(String[] args) {

        /**
         * Decorate along the way
         */
        BasePizza pizza = new Mushroom(new ExtraCheese(new Margarita()));
        System.out.println("Total cost "+pizza.cost());
    }
}
