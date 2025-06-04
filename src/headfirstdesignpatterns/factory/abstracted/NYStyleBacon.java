package headfirstdesignpatterns.factory.abstracted;

public class NYStyleBacon extends Pizza{
    public  void prepare(){
        System.out.println("Preparing "+this.getClass().getSimpleName());
    }
    public  void bake(){
        System.out.println("Baking for 15 mins"+this.getClass().getSimpleName());
    }
    public  void cut(){
        System.out.println("Cutting "+this.getClass().getSimpleName());
    }
    public  void box(){
        System.out.println("Boxing "+this.getClass().getSimpleName());
    }
}
