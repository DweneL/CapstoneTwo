package com.capstonetwo;
import java.util.Scanner;
public class HomeScreen {
    public static void homeScreen() {
        boolean appRunning = true;
        while (appRunning) {
            Scanner myScanner = new Scanner(System.in);

            System.out.println("Enter 1 to Order");
            System.out.println("Enter 0 to exit");

            switch (myScanner.nextLine()){
                case "1":
                    order();
                    break;
                case "0":
                    System.out.println("Thank you, have a nice day!");
                    appRunning = false;
                    break;

                default:
                    System.out.println("UNRECOGNIZED ENTRY");
            }
        }
    }

    public static void order() {
        boolean appRunning = true;
        while (appRunning) {
            Scanner myScanner = new Scanner(System.in);

            System.out.println("Enter 1 to create your sandwich!");
            System.out.println("Enter 2 to add a fountain drink.");
            System.out.println("Enter 3 to add a side of chips.");
            System.out.println("Enter 4 to checkout.");
            System.out.println("Enter 0 to cancel.");

        switch (myScanner.nextLine()){
            case "1":

                break;
            case "2":

                break;
            case "3":
                boolean addChips = true;
                //adds the price of chips
                break;
            case "4":

                break;
            case "0":

                break;
            }
        }
    }
}
