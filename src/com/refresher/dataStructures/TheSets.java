package com.refresher.dataStructures;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TheSets {
    // Sets don't allow duplicates.
    // They don't have any particular order.
    public static void main(String[] args) {
        Set<Profession> set_a = new HashSet<>();

        set_a.add(new Profession("Doctor"));
        set_a.add(new Profession("Nurse"));
        set_a.add(new Profession("Doctor ")); // It would be ignored on compilation.

        set_a.forEach(System.out::println);
    }
    record Profession (String proffesion) {}
}
