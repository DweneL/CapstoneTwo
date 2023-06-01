package com.capstonetwo;

public enum Meat {
    STEAK,
    HAM,
    SALAMI,
    CHICKEN,
    BACON,
    ROAST_BEEF;

    public class Meats {
        public static void main(String[] args) {
            //this wil show the enum values of meats
            System.out.println("Meat selection: ");
            for (Meat meat : Meat.values()) {
                System.out.println("" + meat.toString());
            }
            //ask what selection user would like
            System.out.println("Select any meat option: ");
        }
    }
}

