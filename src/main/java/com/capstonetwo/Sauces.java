package com.capstonetwo;
import java.util.Arrays;
import java.util.List;

public enum Sauces {
    MAYO,
    MUSTARD,
    KETCHUP,
    RANCH,
    THOUSAND_ISLAND,
    VINAIGRETTE,
    AU_JUS;

//con
    public static List<Sauces> getSauces() {
        return Arrays.asList(Sauces.values());
    }
    //lisst stauces from enum
    public static void main(String[] args) {
        List<Sauces> sauces = getSauces();

//dosplaus the sauces adn name
       // System.out.println("Available sauces:");
       // for (Sauce sauce : sauces) {
            System.out.println(getSauces());
        }
    }

// for the sauces i think there shoudl be a select feature too
//like in toppings
//something that can connect au jus to meats too or make it different
//if not is okay
//like ik in toppings will most likely be within the sandwich class