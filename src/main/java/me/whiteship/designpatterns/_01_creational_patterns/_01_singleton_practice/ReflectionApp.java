package me.whiteship.designpatterns._01_creational_patterns._01_singleton_practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionApp {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Mother2 mother1 = Mother2.getInstance();

        Constructor<Mother2> declaredConstructor = Mother2.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Mother2 mother2 = declaredConstructor.newInstance();

        System.out.println(mother1 == mother2);
    }
}
