package com.turkmen.randomizedqueue;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.princeton.cs.algs4.StdRandom;

public class RandomizedQueue<Item> implements Iterable<Item> {

    private int queueSize;
    private Item[] queue;
    private int nextIndex;

    public RandomizedQueue() {
        this.queueSize = 10;
        this.queue = (Item[]) new Object[this.queueSize];
        this.nextIndex = 0;
    }

    public boolean isEmpty() {
        return this.nextIndex == 0 ? true : false;
    }

    public int size() {
        return this.nextIndex;
    }

    public void enqueue(Item item) {
        if (item == null)
            throw new IllegalArgumentException();

        if (this.nextIndex > this.queue.length - 1) {
            this.resizeQueue();
            this.queue[this.nextIndex++] = item;
        } else {
            this.queue[nextIndex++] = item;
        }

    }

    public Item dequeue() {
        if (this.nextIndex == 0)
            throw new NoSuchElementException();

        if (this.nextIndex == 1) {
            nextIndex--;
            return this.queue[1];

        } else {
            int removeIndex = StdRandom.uniform(this.nextIndex - 1);
            Item item = this.queue[removeIndex];
            this.queue[removeIndex] = this.queue[nextIndex - 1];
            this.queue[nextIndex - 1] = null;
            this.nextIndex--;
            return item;
        }

    }

    private void resizeQueue() {
        this.queue = Arrays.copyOf(this.queue, this.queueSize * 2);
        this.queueSize = this.queueSize * 2;

    }

    public Item sample() {
        if (this.nextIndex <= 1)
            return this.queue[nextIndex - 1];
        else {
            int randomIndex = StdRandom.uniform(this.nextIndex - 1);
            return this.queue[randomIndex];
        }

    }

    @Override
    public Iterator<Item> iterator() {
        return new RandomizedQueueIterator();
    }

    private class RandomizedQueueIterator implements Iterator<Item> {

        int index;

        public RandomizedQueueIterator() {

            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return this.index < RandomizedQueue.this.nextIndex;
        }

        @Override
        public Item next() {
            if (this.hasNext()) {
                return RandomizedQueue.this.queue[index++];
            } else
                throw new NoSuchElementException();
        }

    }
}
