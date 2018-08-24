package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.Matrix;

class MatrixTest {

	@Test
	void testinsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(3, 2);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[3][2];
		expectedValue[1][1] = 60;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.insertElement(60, 1, 1);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	

}
