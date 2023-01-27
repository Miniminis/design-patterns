package me.whiteship.designpatterns._01_creational_patterns._04_builder._04_practice;

import java.util.List;

public interface UserBuilder {

    UserBuilder emailAndPassword(String email, String password);

    UserBuilder name(String name);

    UserBuilder age(int age);

    UserBuilder phoneNumber(String phoneNumber);

    UserBuilder hobby(List<String> hobbies);

    UserBuilder introduction(String introduction);

    User getUser();

}
