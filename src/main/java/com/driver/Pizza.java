package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){ //constructor
        this.isVeg = isVeg;
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(int x){
        // your code goes here
        price = x;
    }

    public void addExtraToppings(int y){
        // your code goes here
        price = 120;
    }

    public void addTakeaway(int z){
        // your code goes here
        price = 20;
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
