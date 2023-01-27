package me.whiteship.designpatterns._01_creational_patterns._00_di;

public class DependentApp {
    public static void main(String[] args) {
        new Hi().greet();
    }
}

class Hello {
    public void greet() {
        System.out.println("greetings from b");
    }
}

class Hi {
    public void greet() {
        new Hello().greet();
    }
}
