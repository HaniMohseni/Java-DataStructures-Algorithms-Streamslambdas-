package com.sg.algorithms.strings;


public class StringManipulation {
    public static void main(String[] args) {
        String input = "2ab222";

        // Rule 1: Remove all digits
        String manipulatedStringRule1 = input.replaceAll("\\d", "");
        System.out.println("Rule 1: Remove all digits: " + manipulatedStringRule1);

        // Rule 2: Replace digits with '*'
        String manipulatedStringRule2 = input.replaceAll("\\d", "*");
        System.out.println("Rule 2: Replace digits with '*': " + manipulatedStringRule2);

        // Rule 3: Remove all letters
        String manipulatedStringRule3 = input.replaceAll("[a-zA-Z]", "");
        System.out.println("Rule 3: Remove all letters: " + manipulatedStringRule3);

        // Rule 4: Manipulate based on specific characters or patterns (e.g., 'ab' to 'XY')
        String manipulatedStringRule4 = input.replaceAll("ab", "XY");
        System.out.println("Rule 4: Replace 'ab' with 'XY': " + manipulatedStringRule4);

        // Rule 5: Any custom manipulation based on your requirements
        // For example, replacing specific characters or patterns

        // Rule 6: Convert digits to their corresponding integer values
        StringBuilder digitsAsNumbers = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                int digitValue = Character.getNumericValue(c);
                digitsAsNumbers.append(digitValue);
            } else {
                digitsAsNumbers.append(c);
            }
        }
        String manipulatedStringRule6 = digitsAsNumbers.toString();
        System.out.println("Rule 6: Convert digits to their corresponding integer values: " + manipulatedStringRule6);
    }
}
