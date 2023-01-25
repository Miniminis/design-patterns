package me.whiteship.designpatterns._01_creational_patterns._01_singleton_practice;

public class Mother5 {

    private Mother5() {}

    public static class Mother5Holder {
        private static final Mother5 SELF = new Mother5();

    }

    public static Mother5 getInstance() {
        return Mother5Holder.SELF;
    }
}
