package com.capstonetwo;

import java.util.Arrays;
import java.util.List;

public class ToppingsCLASS {

    //constructor i guesss? this is where we state were making list
    public static List<ToppingsCLASS> getToppings(){
        return Arrays.asList(ToppingsCLASS.values());
    }

    //this is the list
    public static void main(String[] args) {
        List<ToppingsCLASS> toppings = getToppings();
        //displays the topings, of the enumerated list
        System.out.println("Available toppings:");
        //shows the topping name
        for (ToppingsCLASS topping : toppings) {
            System.out.println(topping.name());
        }
        //this is in comments cuase idk if necessary
        //if we dont use any of this please feel free to delete all of these
        //we can add an available toppings list,
        //that way when things are out of order they cant be selected?
        //like a selection option,
        //for this itll be like scanner myScanner
        //ofc idk if its necessary so ill just add in comments
        ///make selected topings an array list
        //List<Toppings> selectedToppings = new ArrayList<>();
        //a for statement like:
        //for(int i = 0; i < toppings.size(); i++){
        //so this will give you the first topping, then go to next and so on
        // then make a print statement yk the usual
        //System.out.println((i+1) + roppings.get(i).name());
        //this prints top
        //make a scnner the scanner statement
        //with system in
        //boolean statement weather the sauces? toppings? i think? is true or false selected
        //while statement for the selection?
        //if else if when selecting

    }
}
