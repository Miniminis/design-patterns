package me.whiteship.designpatterns._01_creational_patterns._01_singleton_practice;

public class Mother4 {
    private static volatile Mother4 self;

    private Mother4 () {}

    public static Mother4 getInstance() {
        if (self == null) {
            synchronized (Mother4.class) {
                if (self == null) {
                    self = new Mother4();
                }
            }
        }
        return self;
    }
}
