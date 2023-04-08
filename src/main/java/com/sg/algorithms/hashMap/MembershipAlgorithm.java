package com.sg.algorithms.hashMap;

import java.util.*;

public class MembershipAlgorithm {
    public static void main(String[] args) {

        //find items present in first array but not in second array-->membership=hashset

        int[]first = {8,0,1,7,3};
        int[]second={5,7, 8, 0, 2};

        (findingMissingElements(first,second)).forEach(System.out::print);
        System.out.println();
        (findingMissingElements(new int[] {1,2,3,4,}, new int[]{1,3}))
                .forEach(System.out::print);

    }

    public static List<Integer> findingMissingElements(int[]first, int[]second){
        List<Integer>missingElements = new ArrayList<>();
        HashSet<Integer>hashSet = new HashSet<>();
        for (int x:second) {
            hashSet.add(x);
        }
        for (int x:first) {
          if(! hashSet.contains(x)){
              missingElements.add(x);
          }
        }

        return missingElements;
    }

}
