package com.turkmen.deque.test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.turkmen.deque.Deque;

@DisplayName("Deque Test")
public class DequeTest {

    private static Deque<Integer> deque;

    @BeforeAll
    static void beforeAll() {
        deque = new Deque<Integer>();
        deque.addLast(0);
        
        
        

    }

    // @Test
    // @DisplayName("addFirst")
    // void addFirst() {
    // deque.addFirst("Osman");
    // deque.addFirst("Tarkan");
    // assertEquals(2, deque.size());
    // }
    //
    // @Test
    // @DisplayName("addLast")
    // void addLast() {
    // deque.addLast("Hakan");
    // deque.addLast("Türkmen");
    // assertEquals(4, deque.size());
    // }
    //
    // @Test
    // @DisplayName("remove first")
    // void removeFirst() {
    // deque.removeFirst();
    // assertEquals(3, deque.size());
    // }
    //
    // @Test
    // @DisplayName("remove Last")
    // void removeLast() {
    //
    // assertEquals("Türkmen", deque.removeLast());
    // }

    // @Test
    // @DisplayName("Iterator Test")
    // void getIterator() {
    //
    // Iterator<String> it = deque.iterator();
    //
    // while (it.hasNext()) {
    // System.out.println(it.next());
    // }
    //
    // assertEquals(true, it.hasNext());
    // }

    @Test
    void sizeTest() {
        assertEquals(1, deque.size());
    }
}
