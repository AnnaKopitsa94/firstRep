package com.kopitsa.app;

public class MyLinkedList<T> {

    private Node<T> firstNode;

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
    }

    @Override
    public String toString() {
        String string = "MyLinkedList{";
        if (firstNode==null){
            string+="}";
            return string;
        }
        string += firstNode.getValue();
        Node<T> currentNode = firstNode;
        while (currentNode.getNext()!=null){
            string += " -> " + currentNode.getNext().getValue();
            currentNode = currentNode.getNext();
        }

        return string +"}";
    }
}
