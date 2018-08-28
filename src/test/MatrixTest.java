package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.Matrix;
import cap1.arrays.Vector;


class MatrixTest {

	@Test
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(5,5);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[5][5];
		expectedValue[0][0] = 5;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.insertElement(2, 2, 3);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void testSearchElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(5,5);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[5][5];
		expectedValue[0][0] = 5;
		testedMatrix.insertElement(expectedValue, expectedValue, 9);
		// Step 3. Obtain the actual value
		int actualValue = testedMatrix.searchElement(1);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
		
	}

}
