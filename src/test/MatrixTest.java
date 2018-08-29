package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.Matrix;
import cap1.arrays.Vector;

class MatrixTest {

	@Test
	void testInsertarElemento() {

		// Step 1. Inicializar la clase test usando el metodo constructor
		Matrix testMatriz = new Matrix(10, 10); // dar tamaño a la matriz
		// Step 2. Crear la variable del valor esperado
		int[][] resultadoEsperado = new int[10][10]; 
		resultadoEsperado[3][5]=28; // insertar elemento en la matriz (posicionFila, posicionColumna, (28)
		// Step 3. Usar metodo Insertar
		int[][] resultadoObtenido = testMatriz.insertarElementos(28, 3, 5);
		// Step 4. Compara el valor esperado con el valor obtenido
		assertArrayEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testBuscarElemento() {

		// Step 1. Inicializar la clase test usando el metodo constructor
		Matrix testMatriz = new Matrix(10, 10); // dar tamaño a la matriz
		// Step 2. Crear la variable del resultado esperado
		boolean resultadoEsperado = true; 
		testMatriz.insertarElementos(28, 3, 5);
		// Step 3. Usar metodo Buscar
		boolean resultadoObtenido = testMatriz.buscarElemento(28);
		// Step 4. Compara el valor esperado con el valor obtenido
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testEliminarElemento() {

		// Step 1. Inicializar la clase test usando el metodo constructor
		Matrix testMatriz = new Matrix(10, 10); // dar tamaño a la matriz
		// Step 2. Crear la variable del resultado esperado
		boolean resultadoEsperado = true; // tambien es matriz
		testMatriz.insertarElementos(28, 3, 5);
		// Step 3. Usar metodo Eliminar
		boolean resultadoObtenido = testMatriz.eliminarElemento(28);
		// Step 4. Compara el valor esperado con el valor obtenido
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	

	@Test
	void testActualizarElemento() {

		// Step 1. Inicializar la clase test usando el metodo constructor
		Matrix testMatriz = new Matrix(10, 10); // dar tamaño a la matriz
		// Step 2. Crear la variable del resultado esperado
		int[][] resultadoEsperado = new int[10][10]; // tambien es matriz
		resultadoEsperado[3][5]=45;
		testMatriz.insertarElementos(28, 3, 5);
		// Step 3. Usar metodo Actualizar
		int[][] resultadoObtenido = testMatriz.actualizarElemento(45, 3, 5);
		// Step 4. Compara el valor esperado con el valor obtenido
		assertArrayEquals(resultadoEsperado, resultadoObtenido);
	}

	
	
}
