package me.whiteship.designpatterns._01_creational_patterns._04_builder._04_practice;

import org.assertj.core.util.Lists;

public class UserDirector {

    private final UserBuilder userBuilder;

    public UserDirector(UserBuilder userBuilder) {
        this.userBuilder = userBuilder;
    }

    public User fastRegister() {
        return userBuilder
                .emailAndPassword("flash@mail.com", "pw1234")
                .name("flash")
                .getUser();
    }

    public User regularRegister() {
        return userBuilder
                .emailAndPassword("flash@mail.com", "password1234")
                .name("flash")
                .age(20)
                .phoneNumber("01012345678")
                .hobby(Lists.newArrayList("soccer", "picture", "coffee"))
                .introduction("hello")
                .getUser();
    }
}
