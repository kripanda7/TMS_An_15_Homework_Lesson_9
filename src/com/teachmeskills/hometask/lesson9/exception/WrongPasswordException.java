package com.teachmeskills.hometask.lesson9.exception;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongPasswordException{" +
                "message=" + getMessage() +
                '}';
    }
}
