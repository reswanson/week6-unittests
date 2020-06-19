package edu.csc422.week6;

import org.junit.Test;
import static org.junit.Assert.*;


public class StackTest {

	
	/*
	@Test
	public void testStack() {
		fail("Not yet implemented");
	}

	@Test
	public void testStackInt() {
		fail("Not yet implemented");
	}
	*/
	
	
	@Test
	public void testSize() {
		System.out.println("testSize");

		Stack instance = new Stack();
		try {
			// To test failure, comment out one of these push lines.
			instance.push(1);
			instance.push(1);
			instance.push(1);
		} catch (FullStackException e) {
			System.out.println(e.getMessage());
		}
		assertEquals(3, instance.size());
	}
		
	@Test
	public void testEmpty() {
		System.out.println("testEmpty");
		Stack instance = new Stack();
		assertEquals(true, instance.empty());
	}
	
	@Test
	public void testNotEmpty() {
		System.out.println("testNotEmpty");
		Stack instance = new Stack();
		try { 
			instance.push(1);
		} catch (FullStackException e) {
			System.out.println(e.getMessage());
		}
		assertEquals(false, instance.empty());
	}

	@Test
	public void testPop() {
		System.out.println("testPop");

		Stack instance = new Stack();
		try {
			// To test failure, comment out one of these push lines.
			instance.push(1);
			instance.push(1);
			instance.push(1);
			instance.pop();
		} catch (FullStackException|EmptyStackException e) {
			System.out.println(e.getMessage());
		}
		assertEquals(2, instance.size());
	}
	
	@Test
	public void testPush() {
		System.out.println("testPush");
		Stack instance = new Stack();
		try {
			instance.push(999);
			int pushedValue = instance.peek();
			assertEquals(999, pushedValue);
		} catch (EmptyStackException|FullStackException e) {
			System.out.println(e.getMessage());
		}
	}

	
	@Test
	public void testPeek() {
		System.out.println("testPeek");
		int valueIAmPushing=42;
		Stack instance = new Stack();
		try {
			instance.push(valueIAmPushing);
			int returnedByPeek = instance.peek();
			assertEquals(42, returnedByPeek);
		} catch (EmptyStackException|FullStackException e) {
			System.out.println(e.getMessage());
		}
	}
}
