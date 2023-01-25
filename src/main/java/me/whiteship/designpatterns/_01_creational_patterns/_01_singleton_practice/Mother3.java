package me.whiteship.designpatterns._01_creational_patterns._01_singleton_practice;

public class Mother3 {
    private static final Mother3 SELF = new Mother3();

    private Mother3() {}

    public static Mother3 getInstance() {
        return SELF;
    }
}
