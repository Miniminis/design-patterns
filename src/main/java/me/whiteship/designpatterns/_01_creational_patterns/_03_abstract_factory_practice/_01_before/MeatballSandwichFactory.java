package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory_practice._01_before;

public class MeatballSandwichFactory implements SandwichFactory{

    @Override
    public Sandwich createSandwich() {
        return new MeatballSandwich();
    }
}
