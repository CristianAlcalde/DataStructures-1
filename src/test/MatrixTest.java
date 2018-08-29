package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

import cap1.arrays.Matrix;
import cap1.arrays.Vector;

class MatrixTest {

	@Test

	public void testinsertElements() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(10, 10);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[10][10];
		expectedValue[5][5] = 4;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.insertElement(4, 5, 5);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
         
		
	@Test
	void testSearchElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(10, 10);
		// Step 2. Create the expected value variable
		int expectedValue = 0;
		testedMatrix.insertElement(4, 5, 5);
		// Step 3. Obtain the actual value
		int actualValue = testedMatrix.searchElementByPosition(2, 2);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);

	}

	@Test
	void testUpdateElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(10, 10);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[10][10];
		expectedValue[5][5] = 4;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.updateElement(4, 5, 5);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);

	}
	
	@Test
	void testDeleteElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(10,10);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int [10][10];
		expectedValue[5][5] = 4;
		// Step 3. Obtain the actual value
		testedMatrix.insertElement(4, 5, 5);
		 int [][] actualValue = testedMatrix.deleteElement(2,1);
		// Step 4. Compare the expected versus actual values
		 assertArrayEquals(expectedValue, actualValue);

}
}

