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
		Matrix testedMatrix = new Matrix(5,5);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[5][5];
		expectedValue[0][0] = 999;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.insertElement(999, 0, 0);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void testUpdateElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(5,5);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[5][5];
		expectedValue[0][0] = 888;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.updateElement(888, 0, 0);		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}


}
