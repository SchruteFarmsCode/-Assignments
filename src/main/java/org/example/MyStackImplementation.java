package org.example;

import java.util.*;

public class MyStackImplementation {

    private List<Integer> stackList;

    public MyStackImplementation() {
        this.stackList = new ArrayList<>();
    }
    public void push(int element) {
        stackList.add(element);
    }
    public int pop() {
        if (stackList.isEmpty()){
            throw new EmptyStackException();
        }
        return stackList.remove(stackList.size() -1);
    }
    public boolean isEmpty() {
        return stackList.isEmpty();
    }
    public int size() {
        return stackList.size();
    }
    public int peek() {
        if (stackList.isEmpty()) {
            throw new EmptyStackException();
        }
        return stackList.get(stackList.size() - 1);
    }
    public void display() {
        System.out.println("Stack: " + stackList);
    }
}


