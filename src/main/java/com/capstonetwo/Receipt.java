package com.capstonetwo;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private List<Sandwich> sandwiches;
    private List<Drinks> drinks;

    private double totalCost;
    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
        totalCost += sandwich.getPrice();
    }
    public Receipt(List<Sandwich> sandwiches) {
        this.sandwiches = sandwiches;
    }

    public void printReceipt() {


        try {
            FileWriter fileWriter = new FileWriter("receipts.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);


            printWriter.println("Order Details:");
            for (int i = 0; i < sandwiches.size(); i++) {
                Sandwich sandwich = sandwiches.get(i);
                // ... existing code ...

                // Write the sandwich details to the file

                printWriter.println("Sandwich " + (i + 1) + ":");
                printWriter.println("Bread: " + sandwich.getBread());
                printWriter.println("Meat: " + sandwich.getMeat());
                printWriter.println("Cheese: " + sandwich.getCheese());
                //use a for loop to list all the toppings
               // printWriter.println("Toppings: " + sandwich.getTopping());
                //same thing as line 40
              //  printWriter.println("Sauce: " + sandwich.getSauce());
                printWriter.println("Side: " + sandwich.getSide());
                printWriter.println("Sandwich Size: " + sandwich.getSandwichSize());
                printWriter.println("Price: $" + sandwich.getPrice());
                printWriter.println("---------------------------");
            }


            printWriter.println("Total Cost: $" + calculateTotalCost());
            printWriter.println("===========================");
            printWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

    }
    private double calculateTotalCost(){

        var sandwichCost = this.sandwiches.stream().mapToDouble(Sandwich::getPrice).sum();
        var drinkCost = this.drinks.stream().mapToDouble(Drinks::getCost).sum();
        return calculateTotalCost();
    }

}


