package com.capstonetwo;
import java.util.Scanner;
public class HomeScreen {
    public static void homeScreen() {
        boolean appRunning = true;
        while (appRunning) {
            Scanner myScanner = new Scanner(System.in);

            System.out.println("Enter 1 to Order");
            System.out.println("Enter 0 to exit");

            switch (myScanner.nextLine()) {
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

            switch (myScanner.nextLine()) {
                case "1":
                    sandwich();
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

                default:
                    System.out.println("UNRECOGNIZED ENTRY");
            }
        }
    }



    public static void sandwich() {
        boolean appRunning = true;
        while (appRunning) {
            Scanner myScanner = new Scanner(System.in);

            System.out.println("Your sandwich can be 4, 8, or 12 inches.");
            System.out.println("What size would you like?");

            switch (myScanner.nextInt()) {
                case 4:
                    for (BreadENUM bread : BreadENUM.values()) {
                        System.out.println(bread);
                        //Sandwich.breadSize(4);
                        //  break;
                        //case 8:
                        // for (BreadENUM bread2 : BreadENUM.values()) {
                        //   System.out.println(bread2);
                        //Sandwich.breadSize(8);
                        //   break;
                        // case 12:
                        // for (BreadENUM bread3 : BreadENUM.values()) {
                        //    System.out.println(bread3);
                        //Sandwich.breadSize(12);
                        //  break;

                        // default:
                        //  System.out.println("UNRECOGNIZED ENTRY");
                    }

                    System.out.println("______________________________________");

                    System.out.println("What type of meat would you like?");


                    //display meat enum as a list
                    //record the meat selection
                    //finds sandwich size and records related price
                    // this.addMeat();
                    //add an option for no meat added to method in sandwich

                    System.out.println("Would you like extra meat for");
                    //finds sandwich size and prints related price for extra meat

                    //same for cheese


            }

        }


    }
}
