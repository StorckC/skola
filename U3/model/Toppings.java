package model;

public enum Toppings {
    tomatosauce(0.0),
    cheese(0.0),
    pepperoni(12.0),
    ham(10.0),
    onion(7.0),
    kebab(20.0),
    fries(15.0);

    private double price;

    Toppings(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

