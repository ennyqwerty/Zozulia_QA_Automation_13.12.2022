package com.hillel.lessons.lesson15.exceptions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            logIn(null,"password");
        } catch (LoginException exception) {
            System.out.println(exception.getReason());
        }catch (IOException exception) {
            System.out.println(exception.getCause());
        }

    }

    public static String logIn(String login, String pass) throws IOException {
        if (login != null) {
            return "Login is success";
        } else throw new LoginException("Login is wrong");
    }
}
