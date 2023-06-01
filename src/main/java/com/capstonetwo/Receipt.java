package com.capstonetwo;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private List<Sandwich> sandwiches;
    private double totalCost;
    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
        totalCost += sandwich.getPrice();
    }
    public Receipt() {
        sandwiches = new ArrayList<>();
        totalCost = 0.0;
    }

    public void printReceipt() {


        try {
            FileWriter fileWriter = new FileWriter("receipts.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);


            printWriter.println("Order Details:");
            for (int i = 0; i < sandwiches.size(); i++) {
                Sandwich sandwich;
                // ... existing code ...

                // Write the sandwich details to the file
                /*
                printWriter.println("Sandwich " + (i + 1) + ":");
                printWriter.println("Bread: " + Sandwich.getBread());
                printWriter.println("Meat: " + Sandwich.getMeat());
                printWriter.println("Cheese: " + Sandwich.getCheese());
                printWriter.println("Toppings: " + Sandwich.getTopping());
                printWriter.println("Sauce: " + Sandwich.getSauce());
                printWriter.println("Side: " + Sandwich.getSide());
                printWriter.println("Sandwich Size: " + Sandwich.getSandwichSize());
                printWriter.println("Price: $" + Sandwich.getPrice());
                printWriter.println("---------------------------");*/
            }
            printWriter.println("Total Cost: $" + totalCost);
            printWriter.println("===========================");
            printWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}


