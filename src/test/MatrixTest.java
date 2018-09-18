package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import cap1.arrays.Matrix;

class MatrixTest {

	@Test
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(3, 4);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[3][4];
		expectedValue[0][0] = 999;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.insertElement(0, 0, 999);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

	@Test
	void testSerchtElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(3, 4);
		// Step 2. Create the expected value variable
		String expectedValue = "1, 3";
		testedMatrix.insertElement(1, 3, 999);
		// Step 3. Obtain the actual value
		String actualValue = testedMatrix.searchElement(999);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testUpdateElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(3, 4);
		testedMatrix.insertElement(0, 0, 999);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[3][4];
		expectedValue[0][0] = 900;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.updateElement(0, 0, 900);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

	@Test
	void testDeleteElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(3, 4);
		testedMatrix.insertElement(0, 0, 999);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[3][4];
		expectedValue[0][0] = 0;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.deleteElement(0, 0);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

}
