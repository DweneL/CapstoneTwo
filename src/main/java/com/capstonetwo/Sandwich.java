package com.capstonetwo;

import java.util.Scanner;

public class Sandwich {
    private Bread bread;
    private Meat meat;
    private Cheese cheese;
    private Toppings topping;
    private Sauces sauce;
    private String side;
    private int sandwichSize;
    private double price;
    private boolean isCheeseAdded = false;
    private boolean isMeatAdded = false;
    private boolean isToppingsAdded = false;
    private boolean isExtraMeatAdded = false;
    private boolean isExtraCheeseAdded = false;
    private boolean isToasted = false;

    public Sandwich(Bread bread, Meat meat, Cheese cheese, Toppings topping, Sauces sauce, String side, int sandwichSize, double price, boolean isCheeseAdded, boolean isMeatAdded, boolean isToppingsAdded, boolean isExtraMeatAdded, boolean isExtraCheeseAdded, boolean isToasted) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.topping = topping;
        this.sauce = sauce;
        this.side = side;
        this.sandwichSize = sandwichSize;
        this.price = price;
        this.isCheeseAdded = isCheeseAdded;
        this.isMeatAdded = isMeatAdded;
        this.isToppingsAdded = isToppingsAdded;
        this.isExtraMeatAdded = isExtraMeatAdded;
        this.isExtraCheeseAdded = isExtraCheeseAdded;
        this.isToasted = isToasted;
    }

    public void addBread(Bread bread){
        if (sandwichSize == 4){
            price = 5.50;
        }
        if (sandwichSize == 8){
            price = 7.00;
        }
        if (sandwichSize == 12){
            price = 8.50;
        } else {
            System.out.println("The size you have chosen is not available");
        }
    }

    public void addMeat(Meat meat){
        if (isMeatAdded == true && sandwichSize == 4){
            this.price += 1.00;
        } if (isMeatAdded == true && sandwichSize == 8){
            this.price += 2.00;
        } if (isMeatAdded == true && sandwichSize == 12){
            this.price += 3.00;
        }
    }

    public void addExtraMeat(Meat meat){
        if (isExtraMeatAdded == true && sandwichSize == 4){
            this.price += .50;
        } if (isExtraMeatAdded == true && sandwichSize == 8){
           this.price +=  1.00;
        } if (isExtraMeatAdded == true && sandwichSize == 12){
            this.price += 1.50;
        }

    }

    public void addCheese(Cheese cheese){
        if (isMeatAdded == true && sandwichSize == 4){
            this.price += .75;
        } if (isMeatAdded == true && sandwichSize == 8){
            this.price += 1.50;
        } if (isMeatAdded == true && sandwichSize == 12){
            this.price += 2.25;
        }
    }

    public void addExtraCheese(Cheese cheese){
        if(isExtraCheeseAdded == true && sandwichSize == 4){
            this.price += .30;
        } if (isExtraCheeseAdded == true && sandwichSize == 8){
            this.price += .60;
        } if (isExtraCheeseAdded == true && sandwichSize == 12){
            this.price += .90;
        }

    }

    public void addToppings (Toppings topping){
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

    public Sauces getSauce() {
        return sauce;
    }

    public void setSauce(Sauces sauce) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
