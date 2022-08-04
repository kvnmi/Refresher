package com.refresher.dataStructures;

import java.util.Stack;

public class TheStack {
    public static void main(String[] args) {
        Stack stack_unTyped = new Stack<>(); // Untyped declaration of stacks
        Stack<String> stack = new Stack<>(); // Types declaration of stacks
        stack.push("1"); // Pushing elements fom stacks
        stack.push("hello"); // Adding elements to stacks
        stack.pop(); // Removes topmost element of the stack
        System.out.println(stack.peek()); // Printing first elements from stack.
        System.out.println(stack.empty()); // Returns whether the stack is empty
    }
}
