package com.refresher.dataStructures;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class TheQueue {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alex", 25)); // Adds element to linked list.
        linkedList.add(new Person("Tobi", 25));

        ListIterator<Person> listIterator = linkedList.listIterator(); // Creates an instance of an iterator for the list.
        // The list-iterator object provides methods to iterate Linked lists

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        } // Prints out linked list items in ascending order.
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        } //Prints out list items in reverse order
    }

    private static void queues() {
        Queue<Person> supermarket = new LinkedList<>();

        supermarket.add(new Person("Tomiwa", 21)); // How you add items to a queue;
        supermarket.add(new Person("Samuel", 29)); // How you add items to a queue;
        System.out.println(supermarket.peek());// Returns item at the top of the queue
        supermarket.poll(); // Removes item at the top of the queue
    }

    record Person(String name, int age){}
}
