package com.teachmeskills.hometask.lesson9.utils;

public class Utils {

    public static boolean isContainsWhiteSpace(String str) {
        return str.contains(" ");
    }

    public static boolean isContainsWhiteSpaceUsingCharArray(String str) {
        for(char ch : str.toCharArray()) {
            if(Character.isSpaceChar(ch)) {
                return true;
            }
        }
        return false;
    }
}
