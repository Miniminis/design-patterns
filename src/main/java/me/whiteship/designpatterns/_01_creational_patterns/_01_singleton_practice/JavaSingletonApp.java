package me.whiteship.designpatterns._01_creational_patterns._01_singleton_practice;

public class JavaSingletonApp {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());
    }
}
