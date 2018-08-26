package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.Matrix;
import cap1.arrays.Vector;

class MatrixTest {

	@Test
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(4 , 4);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[4] [4];
		expectedValue[2][3] =5;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.insertElements(2,3,5);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	void testsearchElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(4 , 4);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[4] [4];
		expectedValue[2][3] =5;
		// Step 3. Obtain the actual value
		int actualValue = testedMatrix.searchElements(5);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

}
