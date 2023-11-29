package model;

import java.util.Arrays;

public class Pizza {
    private String name;
    private double price = 0.0;

    private double basePrice = 100.0;

    private Toppings[] toppings;

    public Pizza(String name,  double price, Toppings[] toppings) {
        this.name = name;
        this.price = price;
        this.toppings = toppings;
    }

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Toppings[] getToppings() {
        return toppings;
    }

    public void setToppings(Toppings[] toppings) {
        this.toppings = toppings;
    }


    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public String toString() {
        return
                 name + '\'' +
                ", price: " + price +
                ", toppings: " + Arrays.toString(toppings)
                ;
    }
}
