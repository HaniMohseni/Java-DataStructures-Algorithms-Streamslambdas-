package com.sg.algorithms.magicNumber;

// 168 = 1+6+8 =15    15=1+ 5 =6 , 6 is not 1 so is not magic
// 28 = 2+8 = 10   10=1+0 =1  is magic

public class MagicNumber {

    // Function to find the sum of digits of a number
    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Function to check if a number is a magic number
    public static int isMagicNumber(int num) {
        while (num > 9) {
            num = digitSum(num);
        }
        return num;
    }

    public static void main(String[] args) {
        int number = 168; // Replace this number with the number you want to check

        if (isMagicNumber(number)==1) {
            System.out.println(number + " is a magic number.");
        } else {
            System.out.println(number + " is not a magic number.");
        }
    }
}
