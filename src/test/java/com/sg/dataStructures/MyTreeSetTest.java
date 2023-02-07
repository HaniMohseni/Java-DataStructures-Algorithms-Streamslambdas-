package com.sg.dataStructures;

import org.junit.jupiter.api.Test;

import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class MyTreeSetTest {

    MyTreeSet myTreeSet = new MyTreeSetImpl();

    @Test
    void removeStringItemFromTreeSet() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add(" BB");
        treeSet.add("A");
        treeSet.add("AA");
        treeSet.add("CCC");
        myTreeSet.removeStringItemFromTreeSet(treeSet,"A");
        assertNotEquals(treeSet.contains("A"),true);

    }

    @Test
    void addStringItemToTreeSet() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("AA");
        myTreeSet.addStringItemToTreeSet(treeSet,"CCC");
        assertTrue(treeSet.contains("CCC"));
    }

    @Test
    void addIntItemToTreeSet() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(78);
        treeSet.add(10);
        myTreeSet.addIntItemToTreeSet(treeSet,5);

        assertTrue(treeSet.contains(5));
    }
}