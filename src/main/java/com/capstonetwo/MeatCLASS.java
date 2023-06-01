package com.capstonetwo;

public class MeatCLASS {    public class Meats {
    public static void main(String[] args) {
        //this wil show the enum values of meats
        System.out.println("Meat selection: ");
        for (MeatCLASS meat : MeatCLASS.values()) {
            System.out.println("" + meat.toString());
        }
        //ask what selection user would like
        System.out.println("Select any meat option: ");
        //prints selection
    }
}
}
