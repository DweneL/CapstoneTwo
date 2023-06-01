package com.capstonetwo;
import java.util.ArrayList;

public class Drinks {
    private String drinkType;
    private String size;
    private double cost;
    //co?nstructor yea
    public Drinks(String drinkType, String size, double cost) {
        this.drinkType = drinkType;
        this.size = size;
        this.cost = cost;
    }
    //generate geter setter
    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
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

        public static void main(String[] args) {
            DrinkMenu menu = new DrinkMenu();
            menu.addDrink("Cola");
            menu.addDrink("Sprite");
            menu.addDrink("Iced Tea");
            menu.addDrink("Sparking Water");
            menu.displayMenu();
        }
    }

        p

        public String getDrinkType() {
            return drinkType;
        }

        public void setDrinkType(String drinkType) {
            this.drinkType = drinkType;
        }

        public String getSize() {
            return size;
        }

        public void setCalculateDrinkPrice() {
            size smallCup = new size("Small", 2.00);
            size mediumCup = new size("Medium", 2.50);
            size largeCup = new size("Large", 3.00);

            System.out.println("Size: " + smallCup.getSize() + ", Price: $" + smallCup.getPrice());
            System.out.println("Size: " + mediumCup.getSize() + ", Price: $" + mediumCup.getPrice());
            System.out.println("Size: " + largeCup.getSize() + ", Price: $" + largeCup.getPrice());
        }

        public void displayDrinkOrder() {
            System.out.println("What drink would you like? " + drinkType);
            System.out.println("What size of cup? " + size);
            System.out.println("This is the price of the cup: $" + cost);
            System.out.println("This is the drink total: $" + setCalculateDrinkPrice();
        }
    }



