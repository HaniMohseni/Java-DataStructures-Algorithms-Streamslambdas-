package com.sg.algorithms.stringReverse;

public class StringReverseImpl implements StringReverse {
    @Override
    public String Reverse1(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    }


    @Override
    public String Reverse2(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        StringBuilder reversedS = new StringBuilder(s);
        return reversedS.reverse().toString();
    }


    @Override
    public String ReverseEachWord(String s) {

        StringBuilder result = new StringBuilder();
        if (s == null || s.isEmpty()) {
            return s;
        }

            String[] arr = s.split(" ");
            for (int i = 0; i < arr.length; i++) {
                result.append(new StringBuilder(arr[i]).reverse().toString());
                if(i!=arr.length-1) {
                    result.append(" ");
                }
            }
            return result.toString();

    }


}
