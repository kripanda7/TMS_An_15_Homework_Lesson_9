package com.teachmeskills.hometask.lesson9;

import com.teachmeskills.hometask.lesson9.exception.WrongLoginException;
import com.teachmeskills.hometask.lesson9.exception.WrongPasswordException;

import static com.teachmeskills.hometask.lesson9.validator.PasswordValidator.checkPassword;

public class Runner {
    public static void main(String[] args) {
        try {
            System.out.println(checkPassword("kripanda", "abc123", "abc123"));
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
