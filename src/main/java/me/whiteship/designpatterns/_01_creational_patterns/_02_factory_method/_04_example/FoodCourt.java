package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._04_example;

public class FoodCourt {
    public static void main(String[] args) {
        Dosirak defaultDosirak = DosirakFactory.order("Default", "spam");
        Dosirak spamDosirak = DosirakFactory.order("SpamDosirak", "spam");
        Dosirak tunaDosirak = DosirakFactory.order("TunaDosirak", "tuna");

        System.out.println("defaultDosirak = " + defaultDosirak);
        System.out.println("spamDosirak = " + spamDosirak);
        System.out.println("tunaDosirak = " + tunaDosirak);
    }
}


abstract class Dosirak {
    public abstract String mainIngredient();

    @Override
    public String toString() {
        return "Here is " + this.mainIngredient();
    }
}

class DosirakFactory {
    public static Dosirak order(String type, String mainIngredient){
        if ("SpamDosirak".equalsIgnoreCase(type)) {
            return new SpamDosirak(mainIngredient);
        }

        if ("TunaDosirak".equalsIgnoreCase(type)) {
            return new TunaDosirak(mainIngredient);
        }

        return new DefaultDosirak();
    }
}

class SpamDosirak extends Dosirak {

    private final String main;

    public SpamDosirak(String main) {
        this.main = main;
    }

    @Override
    public String mainIngredient() {
        return this.main;
    }
}

class TunaDosirak extends Dosirak {

    private final String main;

    public TunaDosirak(String main) {
        this.main = main;
    }

    @Override
    public String mainIngredient() {
        return this.main;
    }
}


class DefaultDosirak extends Dosirak {

    private final String main;

    public DefaultDosirak() {
        this.main = "김치";
    }

    @Override
    public String mainIngredient() {
        return this.main;
    }
}

/**
 * defaultDosirak = Here is 김치
 * spamDosirak = Here is spam
 * tunaDosirak = Here is tuna
 * */
