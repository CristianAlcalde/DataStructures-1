package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import cap1.arrays.Matrix;

class MatrixTest {

	@Test
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testMatrix = new Matrix(4, 4);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[4][4];
		expectedValue[3][3] = 345;
		// Step 3. Obtain the actual value
		int[][] actualValue = testMatrix.insertElement(345, 3, 3);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

	@Test
	void testSearchElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testMatrix = new Matrix(4, 4);
		// Step 2. Create the expected value variable
		int expectedValue = 345;
		testMatrix.insertElement(expectedValue, 3, 3);
		// Step 3. Obtain the actual value
		int actualValue = testMatrix.searchElementByPosition(3, 3);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testUpdateElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testMartix = new Matrix(4, 4);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[4][4];
		expectedValue[0][0] = 345;
		// Step 3. Obtain the actual value
		int[][] actualValue = testMartix.updateElement(345, 0, 0);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

	@Test
	void testDeleteElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testMatrix = new Matrix(4, 4);
		// Step 2. Create the expected value variable
		int expectedValue = 444;
		testMatrix.insertElement(expectedValue, 3, 3);
		// Step 4. Compare the expected versus actual values
		int actualValue = testMatrix.searchElementByPosition(3, 3);
		assertEquals(expectedValue, actualValue);
	}
}
