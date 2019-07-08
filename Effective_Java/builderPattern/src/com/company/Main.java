package com.company;

public class Main {

    public static void main(String[] args) {


        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL).addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.ONION).build();
        System.out.println("pizza ===== "+pizza.getClass());
        Calzone calzone = new Calzone.Builder().addTopping(Pizza.Topping.HAM).sauceInside().build();
        System.out.println("calzone ===== "+calzone);


    }

}
