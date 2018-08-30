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
		Matrix testedMatrix = new Matrix(3,3);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[3][3];
		expectedValue[1][2] = 5;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.insertElement(1, 2, 5);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void testSearchElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(3,3);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[3][3];
		expectedValue[1][2] = 5;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.insertElement(1, 2, 5);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void testUpdateElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(3,3);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[3][3];
		expectedValue[1][2] = 5;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.updateElement(5, 1, 2);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void testDeleteElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(3,3);
		// Step 2. Create the expected value variable
		int expectedValue = 5;
		testedMatrix.insertElement(1, 2, expectedValue);
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.deleteElement(expectedValue);
		// Step 4. Compare the expected versus actual values
		int element = testedMatrix.searchElement(expectedValue);
		assertEquals(5, element);
	}

}
