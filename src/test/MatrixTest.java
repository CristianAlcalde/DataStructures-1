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
		Matrix testedMatrix = new Matrix(10 , 10);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[10] [10];
		expectedValue[5][3] =588;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.insertElements(5,3,588);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

}
