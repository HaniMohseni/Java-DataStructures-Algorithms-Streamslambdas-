package com.sg.algorithms.normalizedString;

public class NormalizedString {
    public static String normalizedString(String s){
        return s.toLowerCase().trim().replace(",","");
    }

    public static void main(String[] args) {
        System.out.println(normalizedString("Hello there, BUDDY"));

    }
}
