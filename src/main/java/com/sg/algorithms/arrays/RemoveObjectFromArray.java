package com.sg.algorithms.arrays;

import java.util.Objects;

public class RemoveObjectFromArray {

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        // Getters and setters (omitted for brevity)

        // Override equals() and hashCode() methods to compare objects properly
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Person person = (Person) obj;
            return age == person.age && name.equals(person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

    public static void main(String[] args) {
        // Creating an array of Person objects
        Person[] personArray = {
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 28),
                new Person("David", 35)
        };

        // Object to be removed (let's say "Bob")
        Person personToRemove = new Person("Bob", 30);

        int index = -1; // Initialize index to -1 (default value if object is not found)

        // Find the index of the object to remove
        for (int i = 0; i < personArray.length; i++) {
            if (personArray[i].equals(personToRemove)) { // Using equals() to compare objects
                index = i;
                break;
            }
        }

        if (index != -1) { // If the object is found in the array
            Person[] newArray = new Person[personArray.length - 1]; // Create a new array with size - 1

            // Copy objects from the original array to the new array, excluding the object to remove
            for (int i = 0, j = 0; i < personArray.length; i++) {
                if (i != index) {
                    newArray[j++] = personArray[i];
                }
            }

            // Print the new array (without the removed object)
            System.out.println("New Array after removing object: ");
            for (Person person : newArray) {
                System.out.println(person.getName() + " - " + person.getAge());
            }
        } else {
            System.out.println("Object not found in the array.");
        }
    }
}
