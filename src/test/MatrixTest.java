package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.Matrix;

class MatrixTest {

	@Test
	void testInsertElement() {
		Matrix testedMatrix = new Matrix (5,5);
		int [][] expectedValue =new int [5][5];
		expectedValue[0][0]=99;
		int[][] actualValue = testedMatrix.insertElement(99, 0, 0);
		assertArrayEquals(expectedValue, actualValue);
		
	}

}
