package com.popovych.doctor.list.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message); //will pass the message
    }
}
