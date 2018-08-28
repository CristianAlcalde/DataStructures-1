package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.Matrix;
import cap1.arrays.Vector;

class MatrixTest {

	@Test
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(10, 5);
		// Step 2. Create the expected value variable
		int[] expectedValue = new int[10];
		expectedValue[0]=500;
		// Step 3. Obtain the actual value
		int[] actualValue = testedMatrix.insertElement(500, 0);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void testSearchElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(10, 5);
		// Step 2. Create the expected value variable
		int expectedValue = 500;
		testedMatrix.insertElement(expectedValue, 9);
		// Step 3. Obtain the actual value
		int actualValue = testedMatrix.searchElement(9);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);		
	}

}

