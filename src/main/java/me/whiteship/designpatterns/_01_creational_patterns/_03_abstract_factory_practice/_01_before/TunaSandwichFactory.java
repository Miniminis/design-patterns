package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory_practice._01_before;

import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory_practice._02_after.TunaSandwichSidePartsFactory;

public class TunaSandwichFactory implements SandwichFactory {

    private TunaSandwichSidePartsFactory tunaSandwichSidePartsFactory;

    public TunaSandwichFactory(TunaSandwichSidePartsFactory tunaSandwichSidePartsFactory) {
        this.tunaSandwichSidePartsFactory = tunaSandwichSidePartsFactory;
    }

    @Override
    public Sandwich createSandwich() {
        TunaSandwich tunaSandwich = new TunaSandwich();
        tunaSandwich.setBeverage(tunaSandwichSidePartsFactory.createBeverage());
        tunaSandwich.setSideMenu(tunaSandwichSidePartsFactory.createSideMenu());
        return tunaSandwich;
    }
}
