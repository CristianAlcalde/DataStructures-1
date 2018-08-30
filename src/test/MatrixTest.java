package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import cap1.arrays.Matrix;
import cap1.arrays.Vector;

class MatrixTest {

	@Test
	void testInsertMatrix() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(10,10);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[10][10];
		expectedValue[0][0] = 28;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.insertMatrix(28, 0, 0);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
		
	}
	
	@Test
	void testSearchMatrix() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(10,10);
		// Step 2. Create the expected value variable
		int expectedValue = 28;
		testedMatrix.insertMatrix(expectedValue, 0, 0);
		// Step 3. Obtain the actual value
		int actualValue = testedMatrix.searchMatrix(0, 0);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
		
	}
	
	@Test
	void testUpdateMatrix() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(10,10);
		// Step 2. Create the expected value variable
		int[][]expectedValue = new int[10][10];
		expectedValue[0][0] = 88;
		// Step 3. Obtain the actual value
		int[][]actualValue = testedMatrix.updateMatrix(88, 0, 0);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void testDeleteMatrix() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(10,10);
		// Step 2. Create the expected value variable
		int expectedValue = 88;
		testedMatrix.insertMatrix(expectedValue, 9, 9);
		// Step 3. Obtain the actual value
		int[][]actualValue = testedMatrix.deleteMatrix(88);
		// Step 4. Compare the expected versus actual values
		int pos = testedMatrix.searchMatrixValue(expectedValue);
		assertEquals(-1, pos);
	}
	
	@Test
	void testListarMatrix() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(3,3);
		// Step 2. Create the expected value variable
		int [][] expectedValue = new int[3][3];
		expectedValue[0][0] = 1;expectedValue[0][1] = 2;expectedValue[0][2] = 3;
		expectedValue[1][0] = 4;expectedValue[1][1] = 5;expectedValue[1][2] = 6;
		expectedValue[2][0] = 7;expectedValue[2][1] = 8;expectedValue[2][2] = 9;
		// Step 3. Obtain the actual value
		int [][]actualValue = testedMatrix.insertMatrix(1, 0, 0);
		int [][]actualValue2 = testedMatrix.insertMatrix(2, 0, 1);
		int [][]actualValue3 = testedMatrix.insertMatrix(3, 0, 2);
		int [][]actualValue4 = testedMatrix.insertMatrix(4, 1, 0);
		int [][]actualValue5 = testedMatrix.insertMatrix(5, 1, 1);
		int [][]actualValue6 = testedMatrix.insertMatrix(6, 1, 2);
		int [][]actualValue7 = testedMatrix.insertMatrix(7, 2, 0);
		int [][]actualValue8 = testedMatrix.insertMatrix(8, 2, 1);
		int [][]actualValue9 = testedMatrix.insertMatrix(9, 2, 2);
		assertArrayEquals(expectedValue, actualValue);
		assertArrayEquals(expectedValue, actualValue2);
		assertArrayEquals(expectedValue, actualValue3);
		assertArrayEquals(expectedValue, actualValue4);
		assertArrayEquals(expectedValue, actualValue5);
		assertArrayEquals(expectedValue, actualValue6);
		assertArrayEquals(expectedValue, actualValue7);
		assertArrayEquals(expectedValue, actualValue8);
		assertArrayEquals(expectedValue, actualValue9);
		testedMatrix.listarMatrix();		
	}
	
	

}
