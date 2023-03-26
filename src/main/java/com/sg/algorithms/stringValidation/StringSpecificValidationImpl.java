package com.sg.algorithms.stringValidation;

public class StringSpecificValidationImpl  implements StringSpecificValidation{
    @Override
    public boolean isPasswordComplex(String s) {
        return s.chars().anyMatch(Character::isLowerCase)&&
                s.chars().anyMatch(Character::isUpperCase)&&
                s.chars().anyMatch(Character::isDigit);

        //or in a single anyMatch, this is for one character we should
        // repeat for the rest by the previous algorithm
        //s.chars().anyMatch(c->Character.isLowerCase(c) ||
        //Character.isUpperCase(c) ||// Character.isDigit(c));
    }
}
