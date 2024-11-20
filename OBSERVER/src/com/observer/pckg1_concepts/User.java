package com.observer.pckg1_concepts;

public class User implements ServiceSignIn {

    private int id;
    private static int cntID = 100;
    private String username;

    public User (String username) {
        this.username = username;
        this.id = cntID++;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }

    @Override
    public void provideSignInInfo(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }

    public void performSomeAction(){
        System.out.println(this + "performing some action...");
    }
}
