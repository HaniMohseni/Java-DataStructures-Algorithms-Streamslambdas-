package com.sg.algorithms.hashMap;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapAlgorithm {

    public static void main(String[] args) {

        //For the HashMap each key is unique
        //For the HashSet each value is unique
        Employee employee1 = new Employee(1,"employee1","Dep1");
        Employee employee2 = new Employee(2,"employee2","Dep2");
        Employee employee3 = new Employee(3,"employee3","Dep3");

        HashMap<Integer,Employee> employeesById = new HashMap<>();
        employeesById.put(1,employee1);
        employeesById.put(2,employee2);
        employeesById.put(3,employee3);
        System.out.println("employeesById HashMap contains key 2: " + employeesById.containsKey(2));

        Employee retrievedData = employeesById.get(2);
        if (retrievedData!=null) {
            System.out.println(retrievedData.name + ": " + retrievedData.department);
        }

        HashSet<String> personalsCode= new HashSet<>();
        personalsCode.add("A111");
        personalsCode.add("B111");
        personalsCode.add("C111");
        System.out.println("personalsCode HashSet contains value A111: " + personalsCode.contains("A111"));



    }
}
