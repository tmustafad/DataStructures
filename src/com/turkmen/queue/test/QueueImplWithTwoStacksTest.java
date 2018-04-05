package com.turkmen.queue.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.turkmen.queue.QueueWithTwoStacks;

/**
 * 
 * @author TTTDEMIRCI
 *
 */

@DisplayName("QueueWithTwoStackTest")
public class QueueImplWithTwoStacksTest {

	private static QueueWithTwoStacks<String> queueWithTwoStacks;

	@BeforeAll
	static void beforeAll() {

		queueWithTwoStacks = new QueueWithTwoStacks<String>();
	}

	@BeforeEach
	void beforeEach() {
		queueWithTwoStacks.getStackOne().removeAllElements();
		queueWithTwoStacks.getStackTwo().removeAllElements();
	}

	@Test
	@DisplayName("Enqueu test with only one element")
	void enqueueTestWithOne() {
		queueWithTwoStacks.enqueue(queueWithTwoStacks, "Türkmen");
		assertEquals(1, queueWithTwoStacks.numberOfItems());
	}

	@Test
	@DisplayName("Enqueu test with multiple elements")
	void enqueueTestWithMultiple() {
		queueWithTwoStacks.enqueue(queueWithTwoStacks, "Türkmen");
		queueWithTwoStacks.enqueue(queueWithTwoStacks, "Mustafa");
		queueWithTwoStacks.enqueue(queueWithTwoStacks, "Demirci");
		assertEquals(3, queueWithTwoStacks.numberOfItems());
	}

	@Test
	@DisplayName("DequeuTest")
	void dequeueTest() {
		queueWithTwoStacks.enqueue(queueWithTwoStacks, "Türkmen");
		queueWithTwoStacks.enqueue(queueWithTwoStacks, "Mustafa");
		queueWithTwoStacks.enqueue(queueWithTwoStacks, "Demirci");
		assertEquals("Türkmen", queueWithTwoStacks.dequeue(queueWithTwoStacks));
	}
}
