package headfirstdesignpatterns.decorator;

public class PizzaMaker {
    public static void main(String[] args) {
        BasePizza pizza = new MargaritaPizza();
        System.out.println("Total final cost "+ pizza.cost());
        pizza = new ExtraCheese(pizza);
        System.out.println("Total final cost "+pizza.cost());
        pizza = new ExtraOlives(pizza);
        System.out.println("Total final cost "+pizza.cost());
        pizza = new ExtraSauce(pizza);
        System.out.println("Total final cost "+pizza.cost());
    }
}
