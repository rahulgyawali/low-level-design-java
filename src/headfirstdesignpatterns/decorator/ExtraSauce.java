package headfirstdesignpatterns.decorator;

public class ExtraSauce extends BasePizza {
    BasePizza basePizza;
    public ExtraSauce(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+2;
    }
}
