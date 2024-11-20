package com.observer.pckg1_concepts;

public class AppTest {
    public static void main(String[] args) {
        Service service = new Service("NewsletterService");
        service.signInToService(new User("username-01"));

    }
}
