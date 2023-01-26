package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory_practice._01_before;

public class Customer {

    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        sandwich.setBeverage(new ColaBeverage());
        sandwich.setSideMenu(new CookieSideMenu());
        System.out.println(sandwich);
    }

}
