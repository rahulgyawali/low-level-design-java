package designexamples.pizza.withoutsides;

import java.util.ArrayList;
import java.util.List;

// Abstract class for Ingredient
abstract class Ingredient {
    public abstract double getCost();
}

// Pizza's Base class
class Base extends Ingredient {
    private String name;
    private double cost;

    public Base(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }
}

// Pizza's Topping class
class Topping extends Ingredient {
    private String name;
    private double cost;

    public Topping(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }
}

// Pizza's Sauce class
class Sauce extends Ingredient {
    private String name;
    private double cost;

    public Sauce(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }
}

// Pizza class
class Pizza {
    private Base base;
    private List<Topping> toppings;
    private List<Sauce> sauces;

    public Pizza(Base base) {
        this.base = base;
        this.toppings = new ArrayList<>();
        this.sauces = new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public void addSauce(Sauce sauce) {
        sauces.add(sauce);
    }

    public double getTotalCost() {
        double total = base.getCost();
        for (Topping t : toppings) {
            total += t.getCost();
        }
        for (Sauce s : sauces) {
            total += s.getCost();
        }
        return total;
    }
}

public class PizzaWithoutSidesDemo {
    public static void main(String[] args) {
        // Define bases
        Base thinCrust = new Base("Thin Crust", 5.0);
        Base thickCrust = new Base("Thick Crust", 6.5);

        // Define toppings
        Topping cheese = new Topping("Cheese", 1.5);
        Topping pepperoni = new Topping("Pepperoni", 2.0);
        Topping mushrooms = new Topping("Mushrooms", 1.2);

        // Define sauces
        Sauce marinara = new Sauce("Marinara", 0.8);
        Sauce garlicSauce = new Sauce("Garlic Sauce", 1.0);

        // Build a pizza
        Pizza myPizza = new Pizza(thinCrust);
        myPizza.addTopping(cheese);
        myPizza.addTopping(pepperoni);
        myPizza.addSauce(marinara);

        // Output the total cost
        System.out.printf("Total cost: $%.2f%n", myPizza.getTotalCost());
    }
}
