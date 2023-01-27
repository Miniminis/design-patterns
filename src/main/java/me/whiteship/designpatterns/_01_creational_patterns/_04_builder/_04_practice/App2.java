package me.whiteship.designpatterns._01_creational_patterns._04_builder._04_practice;

public class App2 {
    public static void main(String[] args) {
        User user = new DefaultUserBuilder()
                .emailAndPassword("flash@mail.com", "pw1234")
                .name("flash")
                .getUser();
        System.out.println("user = " + user);
    }
}
