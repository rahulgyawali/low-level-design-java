package designexamples.pizza.withsides;

import java.util.ArrayList;
import java.util.List;

// Abstract class for Ingredient
abstract class Ingredient {
    public abstract double getCost();
}

// Base class
class BasePizza extends Ingredient {
    private String name;
    private double cost;

    public BasePizza(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }
}

// Topping class
class ToppingPizza extends Ingredient {
    private String name;
    private double cost;

    public ToppingPizza(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }
}

// Sauce class
class SaucePizza extends Ingredient {
    private String name;
    private double cost;

    public SaucePizza(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }
}

// Side class
class Side extends Ingredient {
    private String name;
    private double cost;

    public Side(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }
}

// Pizza class
class PizzaWithSides {
    private BasePizza base;
    private List<ToppingPizza> toppings;
    private List<SaucePizza> sauces;

    public PizzaWithSides(BasePizza base) {
        this.base = base;
        this.toppings = new ArrayList<>();
        this.sauces = new ArrayList<>();
    }

    public void addTopping(ToppingPizza topping) {
        toppings.add(topping);
    }

    public void addSauce(SaucePizza sauce) {
        sauces.add(sauce);
    }

    public double getCost() {
        double total = base.getCost();
        for (ToppingPizza topping : toppings) {
            total += topping.getCost();
        }
        for (SaucePizza sauce : sauces) {
            total += sauce.getCost();
        }
        return total;
    }
}

// Order class
class OrderPizza {
    private PizzaWithSides pizza;
    private List<Side> sides;

    public OrderPizza(PizzaWithSides pizza) {
        this.pizza = pizza;
        this.sides = new ArrayList<>();
    }

    public void addSide(Side side) {
        sides.add(side);
    }

    public double getTotalCost() {
        double total = pizza.getCost();
        for (Side side : sides) {
            total += side.getCost();
        }
        return total;
    }
}

public class PizzaWithSidesDemo {
    public static void main(String[] args) {
        // Define bases
        BasePizza thinCrust = new BasePizza("Thin Crust", 5.0);
        BasePizza thickCrust = new BasePizza("Thick Crust", 6.5);

        // Define toppings
        ToppingPizza cheese = new ToppingPizza("Cheese", 1.5);
        ToppingPizza pepperoni = new ToppingPizza("Pepperoni", 2.0);
        ToppingPizza mushrooms = new ToppingPizza("Mushrooms", 1.2);

        // Define sauces
        SaucePizza marinara = new SaucePizza("Marinara", 0.8);
        SaucePizza garlicSauce = new SaucePizza("Garlic Sauce", 1.0);

        // Define sides
        Side fries = new Side("Fries", 2.5);
        Side pepsi = new Side("Pepsi", 1.8);

        // Build a pizza
        PizzaWithSides myPizza = new PizzaWithSides(thinCrust);
        myPizza.addTopping(cheese);
        myPizza.addTopping(pepperoni);
        myPizza.addSauce(marinara);

        // Create an order
        OrderPizza myOrder = new OrderPizza(myPizza);
        myOrder.addSide(fries);
        myOrder.addSide(pepsi);

        System.out.printf("Total cost: $%.2f%n", myOrder.getTotalCost());
    }
}
