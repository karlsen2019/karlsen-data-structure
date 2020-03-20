package com.karlsen.data.structure.stack;

import java.util.Stack;

/**
 * MinStack
 */
public class MinStack {
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    public MinStack() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(Integer item) {
        dataStack.push(item);
        if (minStack.isEmpty() || item < minStack.peek()) {
            minStack.push(item);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public Integer min() {
        return minStack.peek();
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();
    }

    public void clear(){
        dataStack.clear();
        minStack.clear();
    }
}