package com.prog2.assignments;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * DO NOT MODIFY ANYTHING IN THIS FILE.
 */
class AssignmentOneTests {

	@Test
	void createShapeDescendingTest1()  {
		String actual = AssignmentOne.createShapeDescending(5, '@').trim();
		String expected = "@ @ @ @ @\n@ @ @ @\n@ @ @\n@ @\n@";
		
		assertEquals(expected, actual);
	}
	
	@Test
	void createShapeDescendingTest2()  {
		String actual = AssignmentOne.createShapeDescending(3, '@').trim();
		String expected = "@ @ @\n@ @\n@";
		
		assertEquals(expected, actual);
	}
	
	@Test
	void allStarTest1()  {
		String actual = AssignmentOne.allStar("hello");
		String expected = "h*e*l*l*o";
		
		assertEquals(expected, actual);
	}
	
	@Test
	void allStarTest2()  {
		String actual = AssignmentOne.allStar("abc");
		String expected = "a*b*c";
		
		assertEquals(expected, actual);
	}
	
	@Test
	void allStarTest3()  {
		String actual = AssignmentOne.allStar("ab");
		String expected = "a*b";
		
		assertEquals(expected, actual);
	}
	
	@Test
	void countPairsTest1()  {
		int actual = AssignmentOne.countPairs("axa");
		
		assertEquals(1, actual);
	}
	
	@Test
	void countPairsTest2()  {
		int actual = AssignmentOne.countPairs("axax");
		
		assertEquals(2, actual);
	}
	
	@Test
	void countPairsTest3()  {
		int actual = AssignmentOne.countPairs("axbx");
		
		assertEquals(1, actual);
	}
	
	@Test
	void nestParenTest1()  {
		boolean actual = AssignmentOne.nestParen("(())");
		
		assertTrue(actual);
	}
	
	@Test
	void nestParenTest2()  {
		boolean actual = AssignmentOne.nestParen("((()))");
		
		assertTrue(actual);
	}
	
	@Test
	void nestParenTest3()  {
		boolean actual = AssignmentOne.nestParen("(((x))");
		
		assertFalse(actual);
	}
}