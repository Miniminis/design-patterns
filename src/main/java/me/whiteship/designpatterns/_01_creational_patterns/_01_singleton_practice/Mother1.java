package me.whiteship.designpatterns._01_creational_patterns._01_singleton_practice;

public class Mother1 {

    private static Mother1 self;

    private Mother1() {}

    public static Mother1 getInstance() {
        if (self == null) {
            self = new Mother1();
        }
        return self;
    }
}
