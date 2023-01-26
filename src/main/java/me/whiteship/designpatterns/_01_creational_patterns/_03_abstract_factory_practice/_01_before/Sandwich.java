package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory_practice._01_before;

import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory_practice._02_after.Beverage;
import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory_practice._02_after.SideMenu;

public class Sandwich {

    private String bread;

    private String meat;

    private String vegetable;

    private Beverage beverage;

    private SideMenu sideMenu;

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getVegetable() {
        return vegetable;
    }

    public void setVegetable(String vegetable) {
        this.vegetable = vegetable;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    public SideMenu getSideMenu() {
        return sideMenu;
    }

    public void setSideMenu(SideMenu sideMenu) {
        this.sideMenu = sideMenu;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", meat='" + meat + '\'' +
                ", vegetable='" + vegetable + '\'' +
                ", beverage=" + beverage +
                ", sideMenu=" + sideMenu +
                '}';
    }
}
