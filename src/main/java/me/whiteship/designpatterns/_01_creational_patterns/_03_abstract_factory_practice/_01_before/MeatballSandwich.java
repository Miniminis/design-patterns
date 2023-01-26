package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory_practice._01_before;

public class MeatballSandwich extends Sandwich {

    public MeatballSandwich() {
        setBread("american");
        setMeat("meatball");
        setVegetable("everything except cucumber");
    }
}
