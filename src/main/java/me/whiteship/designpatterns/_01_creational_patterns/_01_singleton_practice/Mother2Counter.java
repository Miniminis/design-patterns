package me.whiteship.designpatterns._01_creational_patterns._01_singleton_practice;

public class Mother2Counter {

    private static int count;

    //1. instance method sync
    public synchronized void add1(int num) {
        this.count += num;
    }

    //2. static method sync
    public static synchronized void add2(int num) {
        count += num;
    }

    //3. instance method code block sync
    public void add3(int num) {
        synchronized (this) {
            this.count += num;
        }
    }

    //4. static method code block sync
    public static void add4(int num) {
        synchronized (Mother2Counter.class) {
            count += num;
        }
    }
}
