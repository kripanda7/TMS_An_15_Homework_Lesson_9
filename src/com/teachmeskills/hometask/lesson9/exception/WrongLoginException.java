package com.teachmeskills.hometask.lesson9.exception;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongLoginException{" +
                "message=" + getMessage() +
                '}';
    }
}
