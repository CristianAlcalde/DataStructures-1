package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;


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
		expectedValue[0][0] = 100;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.insertElemento(100, 0, 0);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void testSearchElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(10,10);
		// Step 2. Create the expected value variable
		int expectedValue = 555;
		testedMatrix.insertElemento(expectedValue, 9, 9);
		// Step 3. Obtain the actual value
		int actualValue = testedMatrix.searchElemento(9,9);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testUpdateElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(10,10);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[10][10];
		expectedValue[0][0] = 555;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.updateElement(555, 0, 0);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void testDeleteElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(3, 4);
		testedMatrix.deleteElement(0);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[3][4];
		expectedValue[0][0] = 0;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.deleteElement(0);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
}