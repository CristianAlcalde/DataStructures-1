package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import cap1.arrays.Matrix;

class MatrixTest {

	@Test	
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatriz = new Matrix(2,3);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[2][3];
		expectedValue[0][0] = 27;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatriz.insertaValor(27,0,0);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void testSearchElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatriz = new Matrix(2,3);
		// Step 2. Create the expected value variable
		int expectedValue = 28;
		testedMatriz.insertaValor(expectedValue, 1,2);
		// Step 3. Obtain the actual value
		int actualValue = testedMatriz.buscaValorPorPosicion(1,2);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void testUpdateElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(2,3);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[2][3];
		expectedValue[1][1] = 34;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.actualizaValor(34,1,1);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
	
	void testDeleteElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(2,3);
		// Step 2. Create the expected value variable
		int expectedValue = 27;
		testedMatrix.insertaValor(expectedValue,1,1);		
		// Step 3. Obtain the actual value
		testedMatrix.borrarValor(expectedValue);
		// Step 4. Compare the expected versus actual values
		String pos = testedMatrix.buscaPosicionPorValor(expectedValue);

		assertEquals("-1,-1", pos);
	}
	
	
	

}
