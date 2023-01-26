package me.whiteship.designpatterns._01_creational_patterns._02_factory_method_practice._02_after;

public class BlueShipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new BlueShip();
    }
}
