package com.sg.algorithms.stringValidation;

public class StringValidationImpl implements StringValidation {

    //All characters of string in uppercase
    @Override
    public boolean isUpperCase(String s) {
        return s.chars().allMatch(Character::isUpperCase);
    }

    //All characters of a string in lowercase
    @Override
    public boolean isLowerCase(String s) {
        return s.chars().allMatch(Character::isLowerCase);
    }

    //All letter
    @Override
    public boolean isLetter(String s) {
        return s.chars().allMatch(Character::isLetter);
    }

    @Override
    public boolean isNumber(String s) {
        return s.chars().allMatch(Character::isDigit);
    }
}
