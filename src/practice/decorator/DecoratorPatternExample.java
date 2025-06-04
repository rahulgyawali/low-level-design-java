package practice.decorator;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        Pizza pizza = new ChickenPizza();
        System.out.println("### Normal Price: "+pizza.cost());
        pizza = new ExtraOlive(pizza);
        System.out.println("### With Extra Olive: "+pizza.cost());
        pizza = new ExtraCheese(pizza);
        System.out.println("### With Extra Cheese: "+pizza.cost());
        pizza = new ExtraSpices(pizza);
        System.out.println("### With Extra Spices: "+pizza.cost());

    }
}
