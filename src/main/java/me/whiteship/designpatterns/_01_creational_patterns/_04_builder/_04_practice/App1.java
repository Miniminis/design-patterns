package me.whiteship.designpatterns._01_creational_patterns._04_builder._04_practice;

import org.assertj.core.util.Lists;

public class App1 {

    public static void main(String[] args) {
        User user = new User();
        user.setEmail("flash@mail.com");
        user.setPassword("password1234");
        System.out.println("user = " + user);

        User user2 = new User(
                "flash@mail.com",
                "password1234",
                "flash",
                20,
                "01012345678",
                Lists.newArrayList("soccer", "picture", "coffee"),
                "hi everyone!"
        );
        System.out.println("user2 = " + user2);
    }
}
