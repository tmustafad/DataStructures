package com.turkmen.stack;

import java.util.Arrays;

/**
 * 
 * @author TTTDEMIRCI
 *
 * @param <Item>
 */

public class StackImplWithArray {

	private int top;
	private int arraySize = 10;

	String[] items;

	public StackImplWithArray() {
		this.items = new String[this.arraySize];
		this.top = -1;
	}

	public void push(String item) {
		if (top + 1 < items.length)
			this.items[++top] = item;
		else {
			this.items = Arrays.copyOf(this.items, this.arraySize * 2);
			this.arraySize = this.arraySize * 2;
			this.items[++top] = item;
		}

	}

	public String pop() {
		return this.items[top--];

	}

	public String top() {

		return this.items[top];
	}

	public String[] getItems() {
		return items;
	}

	public void setItems(String[] items) {
		this.items = items;
	}

}
