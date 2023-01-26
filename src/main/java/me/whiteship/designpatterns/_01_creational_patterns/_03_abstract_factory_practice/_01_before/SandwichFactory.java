package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory_practice._01_before;

public interface SandwichFactory {

    default Sandwich order() {
        prepareFor();
        Sandwich sandwich = createSandwich();
        delivery();
        return sandwich;
    }

    private void delivery() {
        System.out.println("샌드위치가 완성되었습니다.");
    }

    Sandwich createSandwich();

    private void prepareFor() {
        System.out.println("샌드위치 제조를 시작합니다.");
    }
}
