package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    System.out.println(dp.getPrice());
    dp.addTakeaway(20);
    dp.addExtraCheese(60);
    dp.addTakeaway(20);
    System.out.println(dp.getBill());

    Pizza p = new Pizza(true);
    p.addExtraCheese(80);
    p.addExtraToppings(120);
    p.addTakeaway(20);
    System.out.println(p.getBill());
  }
}