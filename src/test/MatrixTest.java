package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatrixTest {

	@Test
	void test() {
		
		void testInsertElement() {
			// Step 1. instantiate the tested class using the constructor method
			Matrix testedMatrix = new Matrix[10][10];
			// Step 2. Create the expected value variable
			int[][] expectedValue = new int[10][10];
			expectedValue[0][0] = 999;
			// Step 3. Obtain the actual value
			int[][] actualValue = testedMatrix.insertElement(999, [0][0]);
			// Step 4. Compare the expected versus actual values
			assertArrayEquals(expectedValue, actualValue);
		}
		
		@Test
		void testSearchElement() {
			// Step 1. instantiate the tested class using the constructor method
			Matrix testedMatrix = new Matrix[10][10];
			// Step 2. Create the expected value variable
			int expectedValue = 999;
			testedMatrix.insertElement(expectedValue, 9);
			// Step 3. Obtain the actual value
			int actualValue = testedVector.buscarElemento(9);
			// Step 4. Compare the expected versus actual values
			assertEquals(expectedValue, actualValue);
		
		
		
		
		
		
		
	}

}
