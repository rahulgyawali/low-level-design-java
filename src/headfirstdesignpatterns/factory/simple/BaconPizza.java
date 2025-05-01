package headfirstdesignpatterns.factory.simple;

public class BaconPizza extends Pizza {

    @Override
    void prepare() {
        System.out.println("Preparing "+this.getClass().getSimpleName());
    }

    @Override
    void box() {
        System.out.println("Boxing "+this.getClass().getSimpleName());
    }
}

