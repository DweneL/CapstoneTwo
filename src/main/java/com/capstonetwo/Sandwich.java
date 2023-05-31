package com.capstonetwo;

public class Sandwich {
    private Bread bread;
    private Meat meat;
    private Cheese cheese;
    private Toppings topping;
    private String sauce;
    private String side;
    private int sandwichSize;
    private float price;

    public Sandwich(Bread bread, Meat meat, Cheese cheese, Toppings topping, String sauce, String side, int sandwichSize, float price) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.topping = topping;
        this.sauce = sauce;
        this.side = side;
        this.sandwichSize = sandwichSize;
        this.price = price;
    }

    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public Meat getMeat() {
        return meat;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Toppings getTopping() {
        return topping;
    }

    public void setTopping(Toppings topping) {
        this.topping = topping;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public int getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(int sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
