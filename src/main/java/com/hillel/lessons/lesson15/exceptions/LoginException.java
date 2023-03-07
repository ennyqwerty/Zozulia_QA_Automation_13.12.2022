package com.hillel.lessons.lesson15.exceptions;

import java.io.IOException;

public class LoginException extends IOException {
    private String reason;

    public LoginException(String reason) {
        this.reason = reason;
    }

    public LoginException(String message, String reason) {
        super(message);
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }
}
