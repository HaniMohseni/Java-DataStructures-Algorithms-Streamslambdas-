package com.sg.algorithms.stringParsing;

public class StringParsing {

    public static void parsContent (String s){
        System.out.println("Option1");
        for (char c : s.toCharArray()){
            System.out.print(c);
        }

        System.out.println();
        System.out.println("Option2");
        for (int i=0; i<s.length();i++){
            char c = s.charAt(i);
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        String s = "HeLLo";
        parsContent(s);

    }
}
