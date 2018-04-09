package com.turkmen.deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 
 * @author TTTDEMIRCI
 *
 * @param <Item>
 */
public class Deque<Item> implements Iterable<Item> {

    private Node first;
    private int size;

    public Deque() {
        this.first = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;

    }

    public void addFirst(Item item) {

        if (item == null)
            throw new IllegalArgumentException();

        if (this.isEmpty()) {
            Node node = new Node();
            node.item = item;
            this.first = node;
            this.size++;
        } else {

            Node node = new Node();
            node.item = item;

            Node oldFirst = this.first;
            oldFirst.parent = node;
            this.first = node;
            this.first.child = oldFirst;
            this.size++;

        }

    }

    public void addLast(Item item) {
        if (item == null)
            throw new IllegalArgumentException();

        if (!this.isEmpty()) {
            Node node = this.first;

            while (node.child != null) {
                node = node.child;
            }
            Node newNode = new Node();
            newNode.item = item;
            newNode.parent = node;

            node.child = newNode;
            this.size++;
        } else {
            Node node = new Node();
            node.item = item;
            this.first = node;
            this.size++;
        }

    }

    public Item removeFirst() {

        if (this.isEmpty())
            throw new NoSuchElementException();

        if (this.size == 1) {
            Node retVal = this.first;
            this.first = null;
            this.size--;
            return retVal.item;
        } else if (!this.isEmpty()) {
            Node retVal = this.first;
            Node node = this.first.child;
            node.parent = null;
            this.first = node;
            this.size--;
            return retVal.item;
        } else
            return null;

    }

    public Item removeLast() {

        if (this.isEmpty())
            throw new NoSuchElementException();

        if (this.size == 1) {
            Node retVal=this.first;
            this.first=null;
            this.size--;
            return retVal.item;
        } else if (!this.isEmpty()) {
            Node node = this.first;
            while (node.child != null) {
                node = node.child;
            }

            Node newLast = node.parent;
            newLast.child = null;
            this.size--;
            return node.item;
        } else
            return null;
    }

    private class Node {
        Item item;
        Node parent;
        Node child;
    }

    @Override
    public Iterator<Item> iterator() {

        return new DequeIterator();
    }

    private class DequeIterator implements Iterator<Item> {

        private Node node;

        public DequeIterator() {
            this.node = Deque.this.first;
        }

        @Override
        public boolean hasNext() {

            return node != null;
        }

        @Override
        public Item next() {
            if (this.node == null)
                throw new NoSuchElementException();

            Node retNode = this.node;
            this.node = this.node.child;
            return retNode.item;
        }

    }

}
