package me.whiteship.designpatterns._01_creational_patterns._04_builder._04_practice;

import java.util.List;

public class DefaultUserBuilder implements UserBuilder {

    private String email;

    private String password;

    private String name;

    private int age;

    private String phoneNumber;

    private List<String> hobby;

    private String introduction;

    @Override
    public UserBuilder emailAndPassword(String email, String password) {
        this.email = email;
        this.password = password;
        return this;
    }

    @Override
    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }

    @Override
    public UserBuilder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public UserBuilder hobby(List<String> hobbies) {
        this.hobby = hobbies;
        return this;
    }

    @Override
    public UserBuilder introduction(String introduction) {
        this.introduction = introduction;
        return this;
    }

    @Override
    public User getUser() {
        return new User(email, password, name, age, phoneNumber, hobby, introduction);
    }
}
