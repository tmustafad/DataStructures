package com.turkmen.queue;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * 
 * 
 * @author TTTDEMIRCI
 *
 * @param <Item>
 */
public class QueueWithTwoStacks<Item> {

	private Stack<Item> stackOne;
	private Stack<Item> stackTwo;

	public QueueWithTwoStacks() {

		this.stackOne = new Stack<Item>();
		this.stackTwo = new Stack<Item>();
	}

	private void push(Stack<Item> stack, Item item) {
		stack.push(item);
	}

	private Item pop(Stack<Item> stack) throws EmptyStackException {
		if (stack.isEmpty())
			throw new EmptyStackException();
		else
			return stack.pop();
	}

	public void enqueue(QueueWithTwoStacks<Item> queueWithTwoStacks, Item item) {
		queueWithTwoStacks.push(stackOne, item);

	}

	public Item dequeue(QueueWithTwoStacks<Item> queueWithTwoStacks) throws EmptyStackException {

		if (queueWithTwoStacks.stackOne.isEmpty() && queueWithTwoStacks.stackTwo.isEmpty())
			throw new EmptyStackException();

		while (!queueWithTwoStacks.stackOne.isEmpty()) {
			Item item = queueWithTwoStacks.stackOne.pop();
			queueWithTwoStacks.push(stackTwo, item);
		}

		return queueWithTwoStacks.pop(stackTwo);

	}

	public int numberOfItems() {

		return this.stackOne.size() + this.stackTwo.size();
	}

	public Stack<Item> getStackOne() {
		return stackOne;
	}

	public void setStackOne(Stack<Item> stackOne) {
		this.stackOne = stackOne;
	}

	public Stack<Item> getStackTwo() {
		return stackTwo;
	}

	public void setStackTwo(Stack<Item> stackTwo) {
		this.stackTwo = stackTwo;
	}

}
