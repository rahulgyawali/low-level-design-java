package headfirstdesignpatterns.factory.abstracted;

public class NYPizzaStore extends  PizzaStore{
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("Peproni")){
            pizza = new NYStylePeproni();
        }else if(type.equals("Bacon")){
            pizza = new NYStyleBacon();
        }
        return pizza;
    }
}
