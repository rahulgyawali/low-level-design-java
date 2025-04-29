package headfirstdesignpatterns.decorator;

public class PizzaMaker {
    public static void main(String[] args) {
        BasePizza basePizza = new MargaritaPizza();
        System.out.println("Total final cost "+ basePizza.cost());
        ExtraCheese extraCheese = new ExtraCheese(basePizza);
        System.out.println("Total final cost "+extraCheese.cost());
        ExtraOlives extraOlives = new ExtraOlives(extraCheese);
        System.out.println("Total final cost "+extraOlives.cost());
        ExtraSauce extraSauce = new ExtraSauce(extraOlives);
        System.out.println("Total final cost "+extraSauce.cost());
    }
}
