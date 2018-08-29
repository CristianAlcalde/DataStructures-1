package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.Matrix;
import cap1.arrays.Vector;

class MatrixTest {

	@Test
	void testInsertar() {
		//Step 1. instantiate the tested class using the constructor method
		Matrix PruebaTamaño =new Matrix  (3,3);
		// Step 2. Create the expected value variable
		int [][] EsperaTamaño =new int[3][3];
		EsperaTamaño[0][0]=4;
		// Step 3. Obtain the actual value
		int[][] ObtenerDato=PruebaTamaño.insertarMatriz(4, 0, 0);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(EsperaTamaño, ObtenerDato);
			
	}
	@Test
	void testSearchElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix PruebaTamaño =new Matrix  (3,3);
		// Step 2. Create the expected value variable
		int EsperaTamaño = 4;
		PruebaTamaño.insertarMatriz(EsperaTamaño, 1, 1);
		// Step 3. Obtain the actual value
		int ObtenerDato = PruebaTamaño.searchElementByPosition(1,1);
		// Step 4. Compare the expected versus actual values
		assertEquals(EsperaTamaño, ObtenerDato);
	}
	@Test
	void testUpdateElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix PruebaTamaño = new Matrix  (3,3);
		// Step 2. Create the expected value variable
		int [][] EsperaTamaño =new int[3][3];
		EsperaTamaño[0][0]=6;
		// Step 3. Obtain the actual value
		int[][] ObtenerDato = PruebaTamaño.updateElement(6, 0, 0);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(EsperaTamaño, ObtenerDato);
	}
	@Test
	void testDeleteElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix PruebaTamaño = new Matrix  (3,3);
		// Step 2. Create the expected value variable
		int EsperaTamaño = 4;
		PruebaTamaño.insertarMatriz(EsperaTamaño,1, 1);
		// Step 3. Obtain the actual value
		int[][] ObtenerDato = PruebaTamaño.deleteElement(EsperaTamaño);
		// Step 4. Compare the expected versus actual values
		int pos = PruebaTamaño.searchElementByValue(EsperaTamaño);

		assertEquals(-1, pos);
	}

	@Test
	void testListar() {
		//Step 1. instantiate the tested class using the constructor method
		Matrix PruebaTamaño =new Matrix  (3,3);
		// Step 2. Create the expected value variable
		int [][] EsperaTamaño =new int[3][3];
		EsperaTamaño[0][0]=90;
		// Step 3. Obtain the actual value
		int[][] ObtenerDato=PruebaTamaño.insertarMatriz(90, 0, 0);
		PruebaTamaño.imprimirMatriz();
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(EsperaTamaño, ObtenerDato);
		PruebaTamaño.imprimirMatriz();
		
			

	}
}
