package edu.csc422.week6;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasProperty;
import org.junit.Rule;
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
			instance.push(1);
			instance.push(1);
			instance.push(1);
		} catch (FullStackException e) {
			System.out.println(e.getMessage());
		}
		assertEquals(3, instance.size());
	}


	@Test
	public void testsumThemAll() {
		System.out.println("sumThemAll");
		Stack instance = new Stack();
		try {
			instance.push(10);
			instance.push(20);
			instance.push(30);
		} catch (FullStackException e) {
			System.out.println(e.getMessage());
		}
		assertEquals(60, instance.sumThemAll());
	}

	@Test
	public void testEmpty() {
		System.out.println("testEmpty");
		Stack instance = new Stack();
		assertEquals(true, instance.empty());
	}

	
	
	// I tried a few times to get logic working to specifically test exceptions, but I couldn't get it working.
	
	
	/*
	@Rule
	public FullStackException thrown = FullStackException.none();

	@Test
	public void testFullStackException() throws FullStackException {
		System.out.println("testFullStackException");


		//test type
		thrown.expect(FullStackException.class);

		//test message
		thrown.expectMessage(is("The stack is full."));

		Stack instance = new Stack(3);

		instance.push(1);
		instance.push(1);
		instance.push(1);
		instance.push(1);
	}
	*/

	

	/*
	@Test(expected=EmptyStackException.class)
	public void testEmptyStackExceptionPop() {
		System.out.println("testEmptyStackExceptionPop()");
		Stack instance = new Stack();
		try {
			instance.pop();
		} catch (EmptyStackException e) {
			System.out.println(e.getMessage());
		}
	}
	 */


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
