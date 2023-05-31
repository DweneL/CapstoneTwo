package com.capstonetwo;

public class Drinks {
    private String size;
    private double cost;

    public Drinks(String size, double cost) {
        this.size = size;
        this.cost = cost;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
