package com.kopitsa.app;

public class MyLinkedList<T> {

    private Node<T> firstNode;

    private int size;

    public int getSize() {
        return size;
    }

    public void add(T element) {
        if (firstNode == null) {
            firstNode = new Node<T>(element);
        } else {
            Node<T> currentNode = firstNode;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(new Node<T>(element));
        }
        size++;
    }

    public T get(int index) {
        if (firstNode == null || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> currentNode = firstNode;
        for (int i = 0; i < index; ++i) {
            currentNode = currentNode.getNext();

        }
        return currentNode.getValue();
    }

    @Override
    public String toString() {
        String string = "MyLinkedList{";
        if (firstNode == null) {
            string += "}";
            return string;
        }
        string += firstNode.getValue();
        Node<T> currentNode = firstNode;
        while (currentNode.getNext() != null) {
            string += " -> " + currentNode.getNext().getValue();
            currentNode = currentNode.getNext();
        }

        return string + "}";
    }

}
