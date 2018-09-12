package cap1.arraysTest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.Matrix;
import cap1.arrays.Vector;

class MatrixTest {

	@Test
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testMatrix = new Matrix(3,3);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[3][3];
		expectedValue[2][1] = 11;
		// Step 3. Obtain the actual value
		int[][] actualValue = testMatrix.insertElement(11, 2, 1);	
		// Step 4. Compare the expected versus actual values		
		assertArrayEquals(expectedValue, actualValue);
	}
	@Test
	void testSearchElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testMatrix = new Matrix(3,3);
		// Step 2. Create the expected value variable
		int expectedValue = 11;
		testMatrix.insertElement(expectedValue, 2, 2);		
		// Step 3. Obtain the actual value
		int actualValue = testMatrix.searchElementByPosition(2, 2);	
		// Step 4. Compare the expected versus actual values		
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void testUpdateElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testMartix = new Matrix (3,3);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[3][3];
		expectedValue[0][0] = 11;
		// Step 3. Obtain the actual value
		int[][] actualValue = testMartix.updateElement(11, 0, 0);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	@Test
	void testDeleteElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testMatrix = new Matrix (3,3);
		// Step 2. Create the expected value variable
		int expectedValue = 11;
		testMatrix.insertElement(expectedValue, 2, 2);		
		// Step 4. Compare the expected versus actual values
		int actualValue = testMatrix.searchElementByPosition(2,2);
		assertEquals(expectedValue, actualValue);
	}
}
