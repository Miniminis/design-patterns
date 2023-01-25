package me.whiteship.designpatterns._01_creational_patterns._01_singleton_practice;

public class Mother1App {

    public static void main(String[] args) {
        Mother2 firstMother = Mother2.getInstance();
        Mother2 secondMother = Mother2.getInstance();

        System.out.println(firstMother == secondMother);
    }
}
