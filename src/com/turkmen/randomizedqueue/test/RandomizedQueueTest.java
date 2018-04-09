package com.turkmen.randomizedqueue.test;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.turkmen.randomizedqueue.RandomizedQueue;

@DisplayName("RandomizedQueueTest")
public class RandomizedQueueTest {
	private static RandomizedQueue<Object> rq;

	@BeforeAll
	static void beforeAll() {
		rq = new RandomizedQueue<>();
		rq.enqueue(456);
        

	}

	// @Test
	// @DisplayName("resize queue test")
	// void resizeQueueTest() {
	// randomizedQueue.queue[0] = "Turkmen";
	// randomizedQueue.queue[0] = "Osman";
	// randomizedQueue.resizeQueue(randomizedQueue.queue);
	// assertEquals(20, randomizedQueue.queue.length);
	//
	// }
	//
	// @Test
	// @DisplayName("enqueue test")
	// void enqueueOneTest() {
	// randomizedQueue.enqueue("Ahmet");
	// assertEquals("Ahmet", randomizedQueue.queue[0]);
	//
	// }
	//
	// @Test
	// @DisplayName("enqueue two test")
	// void enqueueMultipleTest() {
	// randomizedQueue.enqueue("Ahmet");
	// randomizedQueue.enqueue("Osman");
	// randomizedQueue.enqueue("Hakan");
	// assertEquals("Hakan", randomizedQueue.queue[2]);
	// }

	// @Test
	// @DisplayName("dequeue test")
	// void dequeTest() {
	// randomizedQueue.enqueue("hamit");
	// randomizedQueue.enqueue("balamir");
	// randomizedQueue.enqueue("ozan");
	// randomizedQueue.enqueue("f");
	// randomizedQueue.enqueue("s");
	// randomizedQueue.enqueue("w");
	// randomizedQueue.enqueue("6");
	// randomizedQueue.enqueue("6");
	// randomizedQueue.enqueue("7");
	// randomizedQueue.enqueue("6");
	// randomizedQueue.enqueue("6");
	// randomizedQueue.enqueue("7");
	// randomizedQueue.dequeue();
	// assertEquals(2, randomizedQueue.numOfItems);
	// }

//	@Test
//	@DisplayName("Iterator  test")
//	void iteratorTest() {
//		randomizedQueue.enqueue("hamit");
//		randomizedQueue.enqueue("balamir");
//		randomizedQueue.enqueue("ozan");
//		Iterator<Object> it = randomizedQueue.iterator();
//
//		while (it.hasNext()) {
//			//System.out.println((String) it.next());
//		}
//	}
	
	@Test
	@DisplayName("Size test")
	void sizeTest() {

		assertEquals(456, rq.sample());
	}

}
