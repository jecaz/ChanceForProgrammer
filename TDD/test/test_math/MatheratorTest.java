package test_math;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import someMath.Matherator;

/* Test driven development steps:
 *
 * 	1. Think through how to test the simple code, write test cases(first failing tests);
 * 	2. Write code until test cases pass;
 * 	3. Move onto the refactor step (take that existing code, don't change its
 * 		   behavior, but clean it up a bit).
 */

public class MatheratorTest {
	
	private Matherator classUnderTest;

	@Before
	public void setUp() {
		classUnderTest = new Matherator();
	}

	@Test
	public void testSubtract() {
		long result = 100 - 34 - (-17) - 4;
		
		assertEquals(result, classUnderTest.subtract(100 - 34 - (-17) - 4));
		
		result = 0;
		assertEquals(result, classUnderTest.subtract(0));
	}

	@Test
	public void testAdd() {
		// let Java add it up
		long result = 10 + 23 + (-1) + 16;
		
		// Compare that to what Matherator gives us
		assertEquals(result, classUnderTest.add(10+23+(-1)+16));
		
		result = 100 + 102;
		assertEquals(result, classUnderTest.add(100+102));
		
		result = 0;
		assertEquals(result, classUnderTest.add(0));
		
	}

}
