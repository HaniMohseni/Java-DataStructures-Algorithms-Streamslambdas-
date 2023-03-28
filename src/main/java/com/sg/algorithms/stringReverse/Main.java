package com.sg.algorithms.stringReverse;

public class Main {
    public static void main(String[] args) {

        StringReverse stringReverse = new StringReverseImpl();
        System.out.println(stringReverse.Reverse1("Hello"));
        System.out.println(stringReverse.Reverse1(""));
        System.out.println(stringReverse.Reverse1(null));
        //second algorithm testing
        System.out.println(stringReverse.Reverse2("World"));
        //third Algorithm testing
        System.out.println(stringReverse.ReverseEachWord("Hello World"));
   }
}
