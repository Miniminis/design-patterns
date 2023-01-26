package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory_practice._02_after;

import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory_practice._01_before.ColaBeverage;
import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory_practice._01_before.CookieSideMenu;

public class TunaSandwichSidePartsFactory implements SandwichSidePartsFactory {

    @Override
    public Beverage createBeverage() {
        return new ColaBeverage();
    }

    @Override
    public SideMenu createSideMenu() {
        return new CookieSideMenu();
    }
}
