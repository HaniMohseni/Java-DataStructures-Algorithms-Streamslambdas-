package com.sg.algorithms.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedStringConcatenation {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("text", "tet", "xtet", "tte", "ttex");

        Collections.sort(stringList); // Sort the strings in lexicographical order

        StringBuilder concatenatedString = new StringBuilder();
        for (String str : stringList) {
            concatenatedString.append(str);
        }

        String result = concatenatedString.toString();
        System.out.println("Concatenated String after sorting: " + result);
    }
}
