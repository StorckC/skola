package model;

import java.util.Arrays;

public class Pizza {
    private String name;
    private int price = 0;

    private String [] toppings;

    public Pizza(String name, int price, String[] toppings) {
        this.name = name;
        this.price = price;
        this.toppings = toppings;
    }

    public Pizza(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
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
