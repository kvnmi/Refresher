package com.refresher.dataStructures;

import java.util.HashMap;
import java.util.Map;

public class TheMaps {
    public static void main(String[] args) {
        // Contains object in key/value pairs

        Map<Integer, Person> map = new HashMap<>(); // Map object declarations
        map.put(1, new Person("Tomiwa", 21)); // Adds a new element to map
        map.put(2, new Person("Sage", 25));
        map.put(3, new Person("Tomi", 29));
        map.put(4, new Person("Tom", 50));

        System.out.println(map.get(3)); // Returns element at index 3
        System.out.println(map.size()); // Returns size of map
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet()); // Returns list of keys
        map.entrySet().forEach(System.out::println); // Prints out a list of values in the map
        System.out.println(map.values()); // Prints out a list of values in the map
        map.remove(3);// Removes element at index 3
        map.clear(); // Clears map
    }

    record Person(String name, int age) {
    }
}
