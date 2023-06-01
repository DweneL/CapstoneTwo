package com.capstonetwo;
import java.util.ArrayList;

public class Drinks {
    private String size;
    private double cost;

    //constructor
    public Drinks(String size, double cost) {
        this.size = size;
        this.cost = cost;
    }
    public static class DrinkMenu {
        // Moved the drinks menu to create the list of drinks

        private ArrayList<String> drinks;

        public DrinkMenu() {
            drinks = new ArrayList<>();
        }

        public void addDrink(String drink) {
            drinks.add(drink);
        }

        public void displayMenu() {
            System.out.println("Drink Menu:");
            for (String drink : drinks) {
                System.out.println(drink);
            }
        }

    }
        public void setCalculateDrinkPrice() {
            Drinks smallCup = new Drinks("Small", 2.00);
            Drinks mediumCup = new Drinks("Medium", 2.50);
            Drinks largeCup = new Drinks("Large", 3.00);

            System.out.println("Size: " + smallCup.getSize() + ", Price: $" + smallCup.getCost());
            System.out.println("Size: " + mediumCup.getSize() + ", Price: $" + mediumCup.getCost());
            System.out.println("Size: " + largeCup.getSize() + ", Price: $" + largeCup.getCost());
        }

        public void displayDrinkOrder() {
            System.out.println("What size of cup? " + size);
            System.out.println("This is the price of the cup: $" + cost);
        }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}



