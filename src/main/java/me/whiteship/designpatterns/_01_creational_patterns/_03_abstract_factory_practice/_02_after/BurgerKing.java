package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory_practice._02_after;

import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory_practice._01_before.Sandwich;
import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory_practice._01_before.TunaSandwichFactory;

public class BurgerKing {
    public static void main(String[] args) {
        Sandwich sandwich = new TunaSandwichFactory(new TunaSandwichSidePartsFactory()).createSandwich();
        System.out.println(sandwich.getBeverage().getClass());
        System.out.println(sandwich.getSideMenu().getClass());
    }
}
