package com.sg.dataStructures;

import java.util.TreeSet;

public interface MyTreeSet {
    void printIntTreeSet(TreeSet<Integer> treeSet);

    void printStringTreeSet(TreeSet<String> treeSet);

    void removeStringItemFromTreeSet(TreeSet<String> treeSet, String item);

    void addStringItemToTreeSet(TreeSet<String> treeSet, String item);

    void addIntItemToTreeSet(TreeSet<Integer> treeSet, Integer item);
}
