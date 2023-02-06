package com.sg.dataStructures;

import java.util.TreeSet;

public class MyTreeSetImpl implements MyTreeSet {
    @Override
    public void printIntTreeSet(TreeSet<Integer> treeSet) {
        System.out.println(treeSet);

    }

    @Override
    public void printStringTreeSet(TreeSet<String> treeSet) {
        System.out.println(treeSet);


    }

    @Override
    public void removeStringItemFromTreeSet(TreeSet<String> treeSet, String item) {
        treeSet.remove(item);

    }

    @Override
    public void addStringItemToTreeSet(TreeSet<String> treeSet , String item) {
        treeSet.add(item);

    }

    @Override
    public void addIntItemToTreeSet(TreeSet<Integer> treeSet , Integer item) {
        treeSet.add(item);

    }
}
