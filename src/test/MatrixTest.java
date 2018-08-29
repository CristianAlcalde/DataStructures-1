package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import cap1.arrays.Matrix;

class MatrixTest {

	@Test
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(5, 5);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[5][5];
		expectedValue[0][0] = 300;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.insertElement(300, 0, 0);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void testSearchtElementbyPosition() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(5, 5);
		// Step 2. Create the expected value variable
		int expectedValue = 600;
		testedMatrix.insertElement(expectedValue, 0, 0);
		// Step 3. Obtain the actual value
		int actualValue = testedMatrix.searchElementbyPosition( 0, 0);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}
    
	@Test
	void testSearchtElementbyValue() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(5, 5);
		// Step 2. Create the expected value variable
		int[] expectedValue = {1, 2};
		testedMatrix.insertElement(450, 1, 2);
		// Step 3. Obtain the actual value
		int[] actualValue = testedMatrix.searchElementbyValue(450);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}	
	
	//@Test
	/*void testListElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(5, 5);
		// Step 2. Create the expected value variable
		String expectedValue = " 0 0 0\n" + " 0 0 0\n" + " 0 0 900\n";
		// Step 3. Obtain the actual value
		int[][] oldValue = testedMatrix.insertElement(900, 2, 2);
		String actualValue = testedMatrix.listElement(oldValue);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);*/
	//}
	
}
