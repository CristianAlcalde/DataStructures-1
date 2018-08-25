package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.Matrix;

class MatrixTest {

	@Test
	void testinsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(6, 3);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[6][3];
		expectedValue[1][1] = 60;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.insertElement(60, 1, 1);
		// Step 4. Compare the expected versus actual values
		// System.out.println("Esta es la dirección de memoria del valor esperado: " +
		// expectedValue);
		// System.out.println("Esta es la direccion de memoria del valor actual: " +
		// actualValue);
		assertArrayEquals(expectedValue, actualValue);
	}

	@Test
	void testSearchElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(5, 5);
		// Step 2. Create the expected value variable
		int expectedValue = 56;
		testedMatrix.insertElement(expectedValue, 0, 0);
		// Step 3. Obtain the actual value
		int actualValue = testedMatrix.searchElementByPosition(0, 0);
		// Step 4. Compare the expected versus actual values
		System.out.println("Expected Value: " + expectedValue);
		System.out.println("Actual Value: " + actualValue);
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testUpdateElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(15, 15);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[15][15];
		expectedValue[0][0] = 100;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.updateElement(100, 0, 0);
		// Step 4. Compare the expected versus actual values
		// System.out.println("Esta es la dirección de memoria del valor esperado: " +
		// expectedValue);
		// System.out.println("Esta es la direccion de memoria del valor actual: " +
		// actualValue);
		assertArrayEquals(expectedValue, actualValue);

	}

	@Test
	void testDeleteElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(8, 8);
		// Step 2. Create the expected value variable
		int expectedValue = 77;
		testedMatrix.insertElement(expectedValue, 3, 3);
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.deleteElement(expectedValue);
		//System.out.println("Esta es la dirreción de memoria del valor actual: " + actualValue);
		// Step 4. Compare the expected versus actual values
		int pos = testedMatrix.searchElementByValue(expectedValue);
		//System.out.println("Esta es la direccion de memoria donde será reemplazado el elemento por 0: " + actualValue);
		
		assertEquals(5,pos);

	}
}
