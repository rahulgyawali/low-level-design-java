package headfirstdesignpatterns.decorator;

public class MargaritaPizza extends BasePizza {
    @Override
    public int cost() {
        System.out.println(">> Adding Base Pizza Cost "+this.getClass().getSimpleName());
        return 70;
    }
}
