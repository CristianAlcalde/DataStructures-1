package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.Matrix;

class MatrixTest {

	@Test
	void testInsertarElementos() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(5,5);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[5][5];
		expectedValue[2][2] = 10;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.insertarElementos(10, 2, 2);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
    @Test
	void testBuscarElemento() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(5,5);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[5][5];
		expectedValue[2][2] = 10;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.insertarElementos(10, 2, 2);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
		
		
		
   
	@Test
	void testEliminarElemento() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(5,5);
		// Step 2. Create the expected value variable
		int expectedValue = 10;
		testedMatrix.insertarElementos(expectedValue, 2, 2);
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.eliminarElemento(expectedValue);
		// Step 4. Compare the expected versus actual values
		int elemento = testedMatrix.buscarElemento(expectedValue);
		assertEquals(10, elemento);
	}


	@Test
	void testActualizarElemento() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(5, 5);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[5][5];
		expectedValue[2][2] = 50;
		// Step 3. Obtain the actual value
		testedMatrix.insertarElementos(50, 2, 2);
		int[][] actualValue = testedMatrix.actualizarElemento(50, 2, 2);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

}	
		
	

