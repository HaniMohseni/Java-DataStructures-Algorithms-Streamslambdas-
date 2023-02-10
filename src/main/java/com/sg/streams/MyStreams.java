package com.sg.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStreams {
    public static void main(String[] args) {

        Integer[] myIntegerArray = new Integer[]{78, 40, 98, 1, 20, 100};
        Stream<Integer> scoresStream = Arrays.stream(myIntegerArray);

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("pineapple");
        shoppingList.add("bread");
        shoppingList.add("pasta");
        shoppingList.add("milk");

       // Stream<String>shoppingListStream = shoppingList.stream();

        Stream<String>lettersStream = Stream.of("a","b","c");

        shoppingList.stream().sorted()
                .map(item->item.toUpperCase())
                .filter(item->item.startsWith("P"))
                .forEach(item-> System.out.println(item));

        List<String>sortedShoppingList = shoppingList.stream()
                .sorted()
                .map(item->item.toUpperCase())
                .filter(item->item.startsWith("P"))
                .collect(Collectors.toList());
        System.out.println("Sorted Sopping List: "+sortedShoppingList);
        System.out.println("shoppingList"+ shoppingList);

    }


}
