package me.whiteship.designpatterns._01_creational_patterns._01_singleton_practice;

import java.io.Serializable;

public class Mother2 implements Serializable {

    private static Mother2 self;

    private Mother2() {}

    public static synchronized Mother2 getInstance() {
        if (self == null) {
            self = new Mother2();
        }
        return self;
    }
}
