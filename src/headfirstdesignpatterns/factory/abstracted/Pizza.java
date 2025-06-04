package headfirstdesignpatterns.factory.abstracted;

public abstract class Pizza {

    public  void prepare(){
        System.out.println("Preparing "+this.getClass().getSimpleName());
    }
    public  void bake(){
        System.out.println("Baking for 5 mins"+this.getClass().getSimpleName());
    }
    public  void cut(){
        System.out.println("Cutting "+this.getClass().getSimpleName());
    }
    public  void box(){
        System.out.println("Boxing "+this.getClass().getSimpleName());
    }
}
