package headfirstdesignpatterns.decorator;

public class ExtraSauce extends BasePizza {
    BasePizza basePizza;
    public ExtraSauce(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        System.out.println(">> Adding Cost for "+this.getClass().getSimpleName());
        return basePizza.cost()+2;
    }
}
