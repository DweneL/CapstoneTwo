package com.capstonetwo;
import java.util.ArrayList;
import java.util.Scanner;
public enum Chips {
    POPCORN,
    JALAPENO,
    PLANTAIN,
    CHEETOS
}
    public static void main(String[] args) {
        displayChips();
        selectChips();
    }

    public static void displayChips() {
        System.out.println("Chips available:");
        System.out.println("1. Popcorn");
        System.out.println("2. Jalapeno");
        System.out.println("3. Plantains");
        System.out.println("4. Cheetos");
    }

    public static void selectChips() {
        Scanner myScanner = new Scanner(System.in);
        ArrayList<String> selectedChips = new ArrayList<>();
        double totalPrice = 0.0;

        boolean ordering = true;
        while (ordering) {
            System.out.print("Enter Chip number: ");
            int chipChoice = myScanner.nextInt();

            switch (chipChoice) {
                case 0:
                    ordering = false;
                    break;
                case 1:
                    selectedChips.add("Popcorn");
                    totalPrice += 1.50;
                    break;
                case 2:
                    selectedChips.add("Jalapeno");
                    totalPrice += 1.50;
                    break;
                case 3:
                    selectedChips.add("Plantains");
                    totalPrice += 1.50;
                    break;
                case 4:
                    selectedChips.add("Cheetos");
                    totalPrice += 1.50;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid chip.");
            }
        }

        if (selectedChips.isEmpty()) {
            System.out.println("You did not select any chips.");
        } else {
            System.out.println("Selected chips:");
            for (String chip : selectedChips) {
                System.out.println(chip);
            }
            System.out.println("Total price: $" + totalPrice);
        }
        myScanner.close();
    }
}