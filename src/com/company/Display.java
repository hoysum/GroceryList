package com.company;

public class Display {
    private String grocery;
    private int price;
    private int quantity;
    private int cost;

    public String getGrocery() {
        return grocery;
    }

    public void setGrocery(String grocery) {
        this.grocery = grocery;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    public static int calculateCosts (int quantity, int price){
    int costs =  quantity * price;
    return costs;
    }

}
