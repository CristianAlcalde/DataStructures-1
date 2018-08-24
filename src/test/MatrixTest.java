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

	@Test
	void testSearchElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(10, 10);
		// Step 2. Create the expected value variable
		int expectedValue = 56;
		//System.out.println("Expected Value: " + expectedValue);
		testedMatrix.insertElement(expectedValue, 5, 5);
		// Step 3. Obtain the actual value
		int actualValue = testedMatrix.searchElementByPosition(5, 5);
		//System.out.println("Actual Value: " + actualValue);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);

	}

}
