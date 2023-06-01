package com.capstonetwo;

public class Sandwich {
    private BreadENUM breadENUM;
    private MeatENUM meat;
    private CheeseENUM cheese;
    private ToppingsENUM topping;
    private SaucesENUM sauce;
    private String side;
    private int sandwichSize;
    private static double price;
    private boolean isCheeseAdded = false;
    private boolean isMeatAdded = false;
    private boolean isToppingsAdded = false;
    private boolean isExtraMeatAdded = false;
    private boolean isExtraCheeseAdded = false;
    private boolean isToasted = false;

    public Sandwich(BreadENUM breadENUM, MeatENUM meat, CheeseENUM cheese, ToppingsENUM topping, SaucesENUM sauce, String side, int sandwichSize, double price, boolean isCheeseAdded, boolean isMeatAdded, boolean isToppingsAdded, boolean isExtraMeatAdded, boolean isExtraCheeseAdded, boolean isToasted) {
        this.breadENUM = breadENUM;
        this.meat = meat;
        this.cheese = cheese;
        this.topping = topping;
        this.sauce = sauce;
        this.side = side;
        this.sandwichSize = sandwichSize;
        this.price = price;
        this.isCheeseAdded = isCheeseAdded;
        this.isMeatAdded = isMeatAdded;
        this.isToppingsAdded = isToppingsAdded;
        this.isExtraMeatAdded = isExtraMeatAdded;
        this.isExtraCheeseAdded = isExtraCheeseAdded;
        this.isToasted = isToasted;
    }

    public static void breadSize(int sandwichSize){
        if (sandwichSize == 4){
            price = 5.50;
        }
        if (sandwichSize == 8){
            price = 7.00;
        }
        if (sandwichSize == 12){
            price = 8.50;
        } else {
            System.out.println("The size you have chosen is not available");
        }
    }

    public void addMeat(MeatENUM meat){
        if (isMeatAdded == true && sandwichSize == 4){
            this.price += 1.00;
        } if (isMeatAdded == true && sandwichSize == 8){
            this.price += 2.00;
        } if (isMeatAdded == true && sandwichSize == 12){
            this.price += 3.00;
        }
    }

    public void addExtraMeat(MeatENUM meat){
        if (isExtraMeatAdded == true && sandwichSize == 4){
            this.price += .50;
        } if (isExtraMeatAdded == true && sandwichSize == 8){
           this.price +=  1.00;
        } if (isExtraMeatAdded == true && sandwichSize == 12){
            this.price += 1.50;
        }

    }

    public void addCheese(CheeseENUM cheese){
        if (isMeatAdded == true && sandwichSize == 4){
            this.price += .75;
        } if (isMeatAdded == true && sandwichSize == 8){
            this.price += 1.50;
        } if (isMeatAdded == true && sandwichSize == 12){
            this.price += 2.25;
        }
    }

    public void addExtraCheese(CheeseENUM cheese){
        if(isExtraCheeseAdded == true && sandwichSize == 4){
            this.price += .30;
        } if (isExtraCheeseAdded == true && sandwichSize == 8){
            this.price += .60;
        } if (isExtraCheeseAdded == true && sandwichSize == 12){
            this.price += .90;
        }

    }

    public void addToppings (ToppingsENUM topping){
    }

    public BreadENUM getBread() {
        return breadENUM;
    }

    public void setBread(BreadENUM breadENUM) {
        this.breadENUM = breadENUM;
    }

    public MeatENUM getMeat() {
        return meat;
    }

    public void setMeat(MeatENUM meat) {
        this.meat = meat;
    }

    public CheeseENUM getCheese() {
        return cheese;
    }

    public void setCheese(CheeseENUM cheese) {
        this.cheese = cheese;
    }

    public ToppingsENUM getTopping() {
        return topping;
    }

    public void setTopping(ToppingsENUM topping) {
        this.topping = topping;
    }

    public SaucesENUM getSauce() {
        return sauce;
    }

    public void setSauce(SaucesENUM sauce) {
        this.sauce = sauce;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public int getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(int sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
