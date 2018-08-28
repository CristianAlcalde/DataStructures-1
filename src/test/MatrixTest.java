package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import cap1.arrays.Matrix;

class MatrixTest {

	@Test
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(3, 3);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[3][3];
		expectedValue[0][0] = 200;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.insertElement(200, 0, 0);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

	@Test
	void testSearchElementbyPosition() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(3, 3);
		// Step 2. Create the expected value variable
		int expectedValue = 500;
		testedMatrix.insertElement(expectedValue, 0, 0);
		// Step 3. Obtain the actual value
		int actualValue = testedMatrix.searchElementbyPosition(0, 0);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testSearchElementbyValue() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(3, 3);
		// Step 2. Create the expected value variable
		int[] expectedValue = { 1, 2 };
		testedMatrix.insertElement(250, 1, 2);
		// Step 3. Obtain the actual value
		int [] actualValue = testedMatrix.searchElementbyValue(250);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

	@Test
	void testListElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(3, 3);
		// Step 2. Create the expected value variable
		String expectedValue = "0 0 0\n" + "0 0 0\n" + "0 0 300\n";
		// Step 3. Obtain the actual value
		int[][] oldValue = testedMatrix.insertElement(300, 2, 2);
		String actualValue = testedMatrix.listElement(oldValue);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testUpdatetElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(3, 3);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[3][3];
		expectedValue[2][2] = 555;
		// Step 3. Obtain the actual value
		testedMatrix.insertElement(300, 2, 2);
		int[][] actualValue = testedMatrix.updateElement(555, 2, 2);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

	@Test
	void testDeletetElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(3, 3);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[3][3];
		expectedValue[1][1] = 0;
		// Step 3. Obtain the actual value
		testedMatrix.insertElement(125, 1, 1);
		int[][] actualValue = testedMatrix.deleteElement(125);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

}
