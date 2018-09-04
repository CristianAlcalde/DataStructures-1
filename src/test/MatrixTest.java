package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import cap1.arrays.Matrix;

class MatrixTest {
	
	Matrix matrixTest = new Matrix(4, 4);

	@Test
	public void testInsertMatrix() {

		int expectedValue = 3;
		int expectedPosition = matrixTest.InsertMatrix(0, 0, expectedValue);
		assertEquals(expectedValue, expectedPosition);
	}
	
	@Test
	public void testListMatrix() {

		matrixTest.InsertMatrix(1, 2, 3);
		boolean expectedValue = matrixTest.ListMatrix();
		assertEquals(true, expectedValue);
	}
	
	@Test
	public void testSearchMatrix() {
		int expectedValue = matrixTest.DeleteMatrix(3, 3);
		System.out.println("Data :" + expectedValue);
	}
	
	@Test
	public void testDeleteMatrix() {
		int expectedValue = 0;
		matrixTest.InsertMatrix(1, 2, 3);
		int positionValue = matrixTest.DeleteMatrix(1, 2);
		assertEquals(expectedValue, positionValue);
	}



}
