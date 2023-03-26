package com.sg.algorithms.stringValidation;

public class main {
    public static void main(String[] args) {
        StringValidation stringValidation = new StringValidationImpl();
        StringSpecificValidation stringSpecificValidation = new StringSpecificValidationImpl();

        System.out.println(stringValidation.isNumber("Hello1"));
        System.out.println(stringValidation.isLowerCase("hello"));
        System.out.println(stringValidation.isLetter("Hello"));

        System.out.println(stringSpecificValidation.isPasswordComplex("Hello"));
        System.out.println(stringSpecificValidation.isPasswordComplex("Hello1"));


    }
}
