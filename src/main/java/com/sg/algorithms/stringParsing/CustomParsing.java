package com.sg.algorithms.stringParsing;

public class CustomParsing {
    public  static boolean isAtEvenIndex (String s, char item){
        if(s==null || s.isEmpty()){
            return  false;
        }
        for (int i=0; i<s.length() / 2 +1; i++){
            if(s.charAt(i)==item){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "HEElo";
        System.out.println(isAtEvenIndex(s,'L'));
        System.out.println(isAtEvenIndex(s,'T'));
        System.out.println(isAtEvenIndex(s,'e'));
        System.out.println(isAtEvenIndex(s,'E'));
        System.out.println(isAtEvenIndex("",'H'));
        System.out.println(isAtEvenIndex(null,'H'));

    }
}
