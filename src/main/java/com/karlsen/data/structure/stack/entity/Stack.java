package com.karlsen.data.structure.stack.entity;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private List<T> list;

    public Stack() {
        list = new ArrayList<>();
    }

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        int lastIndex = list.size() - 1;
        T item = list.get(lastIndex);
        list.remove(lastIndex);
        return item;
    }

    public T top() {
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }
}
