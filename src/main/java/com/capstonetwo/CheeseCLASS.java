package com.capstonetwo;

public class CheeseCLASS {

    public static void main(String[] args) {
        //this wil show the enum values of cheeses
        System.out.println("Cheese selection: ");
        for (CheeseCLASS cheese : CheeseCLASS.values()) {
            System.out.println("" + cheese.toString());
        }
        //ask what selection user would like
        System.out.println("Select any cheese option: ");
    }
}
