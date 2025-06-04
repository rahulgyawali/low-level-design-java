package headfirstdesignpatterns.factory.abstracted;

public class ChicagoPizzaStore extends PizzaStore{
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("Peproni")){
            pizza = new ChicagoStylePeproni();
        }else if(type.equals("Bacon")){
            pizza = new ChicagoStyleBacon();
        }
        return pizza;
    }
}
