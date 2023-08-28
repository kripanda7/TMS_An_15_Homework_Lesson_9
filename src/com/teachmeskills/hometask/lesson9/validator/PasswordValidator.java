package com.teachmeskills.hometask.lesson9.validator;

import com.teachmeskills.hometask.lesson9.exception.WrongLoginException;
import com.teachmeskills.hometask.lesson9.exception.WrongPasswordException;

import static com.teachmeskills.hometask.lesson9.utils.Utils.isContainsWhiteSpace;
import static com.teachmeskills.hometask.lesson9.utils.Utils.isContainsWhiteSpaceUsingCharArray;

public class PasswordValidator {

    public static boolean checkPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || isContainsWhiteSpaceUsingCharArray(login)) {
            throw new WrongLoginException("Wrong login. Login should be less then 20 symbols and without whitespaces.");
        } else if (password.length() > 20 || isContainsWhiteSpace(password) || !password.matches("^.*[a-zA-Z0-9]+.*$")) {
            throw new WrongPasswordException("Wrong password. Password should be less then 20 symbols, without whitespaces and have at least one number.");
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Your password and confirmPassword are not the same.");
        }
        return true;
    }
}
