package headfirstdesignpatterns.factory.simple;

public class PizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals(CheesePizza.class.getSimpleName())){
            pizza = new CheesePizza();
        }else if(type.equals(MushroomPizza.class.getSimpleName())){
            pizza = new MushroomPizza();
        }else if(type.equals(BaconPizza.class.getSimpleName())){
            pizza = new BaconPizza();
        }
        return pizza;
    }
}
