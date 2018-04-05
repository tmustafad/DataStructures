package com.turkmen.stack.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.turkmen.stack.StackImplWithArray;

/**
 * 
 * @author TTTDEMIRCI
 *
 */

@DisplayName("StackImplWithArrayTest")
public class StackImplWithArrayTest {

	private static StackImplWithArray stackImplWithArray;

	@BeforeAll
	static void beforeAll() {
		stackImplWithArray = new StackImplWithArray();

	}

	@BeforeEach
	void beforeEach() {
		stackImplWithArray = new StackImplWithArray();
	}

	static void fill() {
		stackImplWithArray.push("Turkmen");
		stackImplWithArray.push("Osman");
		stackImplWithArray.push("Tar�k");
		stackImplWithArray.push("Cenabettin");
		stackImplWithArray.push("Tarcan");
		stackImplWithArray.push("Ahmet");
		stackImplWithArray.push("Fatih");
		stackImplWithArray.push("Ersin");
		stackImplWithArray.push("Mustafa");
		stackImplWithArray.push("Erol");
		stackImplWithArray.push("Alex");
		stackImplWithArray.push("Rahmi");
		stackImplWithArray.push("�brahim");

	}

	@Test
	void pushTest() {
		fill();
		assertEquals("�brahim", stackImplWithArray.pop());
	}

	@Test
	void popTest() {
		fill();
		assertEquals("�brahim", stackImplWithArray.pop());
	}

	@Test
	void topTest() {
		fill();
		assertEquals("�brahim", stackImplWithArray.top());
	}

}
