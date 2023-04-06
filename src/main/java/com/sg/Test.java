package com.sg;

import java.util.ArrayList;
import java.util.List;

public class Test {
    // one list= 1 9 3 4 10 5  one item x=15
    public static void main(String[] args) {
        int item = 15;
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(9);
        myList.add(3);
        myList.add(4);
        myList.add(10);
        myList.add(5);
        ArrayList<Integer> digits = new ArrayList<>();
        digits =digitSum(myList, item);
        System.out.print(digits.get(1));
        System.out.print(digits.get(0));


    }

    public static ArrayList<Integer> digitSum(ArrayList<Integer> myList, int item) {

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < myList.size(); i++) {
            int temp = myList.get(i);

            for (int j = i + 1; j < myList.size(); j++) {


                if (myList.get(j) + temp == item) {
                    result.add(item, myList.get(j));

                }
            }
        }
        return result;

    }
}
