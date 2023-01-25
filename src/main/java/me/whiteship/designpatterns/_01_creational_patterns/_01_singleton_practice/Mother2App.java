package me.whiteship.designpatterns._01_creational_patterns._01_singleton_practice;

public class Mother2App {
    public static void main(String[] args) {
        Mother2 mother2 = Mother2.getInstance();
        System.out.println(mother2 == Mother2.getInstance());
    }
}
