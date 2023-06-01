package com.capstonetwo;

import java.util.Arrays;
import java.util.List;

public class SaucesCLASS {

    //con
    public static List<SaucesENUM> getSauces() {
        return Arrays.asList(SaucesENUM.values());
    }

    //lisst stauces from enum
    public static void listSauces() {
        List<SaucesENUM> sauces = getSauces();


//dosplaus the sauces adn name
        System.out.println("Available sauces:");
        for (SaucesENUM sauce : sauces) {
            System.out.println(sauce.name());
        }
    }
}

// for the sauces i think there shoudl be a select feature too
//like in toppings
//something that can connect au jus to meats too or make it different
//if not is okay
//like ik in toppings will most likely be within the sandwich class

