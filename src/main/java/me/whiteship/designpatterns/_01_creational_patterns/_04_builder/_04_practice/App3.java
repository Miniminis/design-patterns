package me.whiteship.designpatterns._01_creational_patterns._04_builder._04_practice;

public class App3 {

    public static void main(String[] args) {
        UserDirector userDirector = new UserDirector(new DefaultUserBuilder());
        System.out.println(userDirector.fastRegister());
        System.out.println(userDirector.regularRegister());
    }
}
