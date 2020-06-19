package edu.csc422.week6;

//import static org.junit.Assert.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class StackTest {
	
	@Test
	public void testSize() {
        System.out.println("testSize");
        int expResult = 2;
        
		Stack instance = new Stack();
		instance.push(1);
		instance.push(1);
		int itssize=instance.size();
        assertEquals(1, itssize);


        //assertEquals(1, instance.size());
	}

	/*
	@Test
	public void testStack() {
		fail("Not yet implemented");
	}

	@Test
	public void testStackInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testPop() {
		fail("Not yet implemented");
	}

	@Test
	public void testPush() {
		fail("Not yet implemented");
	}

	@Test
	public void testPeek() {
		fail("Not yet implemented");
	}

	@Test
	public void testEmpty() {
		fail("Not yet implemented");
	}
	*/

/* test was here */

	/*
	@Test
	public void testToString() {
		fail("Not yet implemented");
	}
	*/

}
