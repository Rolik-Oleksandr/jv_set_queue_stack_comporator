package org.example;

import java.util.EmptyStackException;

public class Stack<T> {
    Node<T> top;
    private int size;

    public void push(T value) {
        Node<T> newNode = new Node<>(value);

        newNode.next = top;

        top = newNode;
        size++;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.value;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T oldValue = top.value;
        top = top.next;
        size--;

        return oldValue;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private static class Node<T> {
        private Node<T> next;
        private final T value;

        private Node(T value) {
            this.value = value;
        }
    }
}
