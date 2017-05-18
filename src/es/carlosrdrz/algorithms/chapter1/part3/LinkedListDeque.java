package es.carlosrdrz.algorithms.chapter1.part3;

import java.util.Iterator;

public class LinkedListDeque<Item> implements Deque<Item> {
    private class Node {
        Item value;
        Node next;
        Node previous;
    }

    private class DequeIterator implements Iterator<Item> {
        private Node current = rootNode;

        @Override
        public boolean hasNext() {
            return (current != null);
        }

        @Override
        public Item next() {
            Item val = current.value;
            current = current.next;
            return val;
        }
    }

    private Node rootNode = null;
    private Node lastNode = null;
    private int numNodes = 0;

    public boolean isEmpty() {
        return (numNodes == 0);
    }

    public int size() {
        return numNodes;
    }

    public void pushLeft(Item item) {
        Node newRoot = new Node();
        newRoot.value = item;

        if (numNodes == 0) {
            rootNode = newRoot;
            lastNode = newRoot;
        } else {
            newRoot.next = rootNode;
            rootNode = newRoot;
            newRoot.next.previous = rootNode;
        }

        numNodes++;
    }

    public void pushRight(Item item) {
        Node newLast = new Node();
        newLast.value = item;

        if (numNodes == 0) {
            rootNode = newLast;
            lastNode = newLast;
        } else {
            newLast.previous = lastNode;
            lastNode = newLast;
            newLast.previous.next = lastNode;
        }

        numNodes++;
    }

    public Item popLeft() {
        if (numNodes == 0) {
            return null;
        } else if (numNodes == 1) {
            Item value = rootNode.value;
            rootNode = null;
            lastNode = null;
            numNodes = 0;
            return value;
        } else if (numNodes == 2) {
            Item value = rootNode.value;
            rootNode = lastNode;
            rootNode.next = null;
            rootNode.previous = null;
            lastNode.next = null;
            lastNode.previous = null;
            numNodes = 1;
            return value;
        } else {
            Item value = rootNode.value;
            rootNode = rootNode.next;
            rootNode.previous = null;
            numNodes--;
            return value;
        }
    }

    public Item popRight() {
        if (numNodes == 0) {
            return null;
        } else if (numNodes == 1) {
            Item value = lastNode.value;
            rootNode = null;
            lastNode = null;
            numNodes = 0;
            return value;
        } else if (numNodes == 2) {
            Item value = lastNode.value;
            lastNode = rootNode;
            rootNode.next = null;
            rootNode.previous = null;
            lastNode.next = null;
            lastNode.previous = null;
            numNodes = 1;
            return value;
        } else {
            Item value = lastNode.value;
            lastNode = lastNode.previous;
            lastNode.next = null;
            numNodes--;
            return value;
        }
    }

    @Override
    public Iterator<Item> iterator() {
        return new DequeIterator();
    }
}
