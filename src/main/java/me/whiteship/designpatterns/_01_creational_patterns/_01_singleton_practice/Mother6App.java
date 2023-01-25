package me.whiteship.designpatterns._01_creational_patterns._01_singleton_practice;

public class Mother6App {
    public static void main(String[] args) {
        Mother6 mother = Mother6.SELF;
        Mother6 mother2 = Mother6.SELF;

        System.out.println(mother == mother2);
    }
}
