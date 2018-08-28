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
		int[][] resultadoEsperado = new int[10][10]; // tambien es matriz
		resultadoEsperado[3][5]=28; // insertar elemento en la matriz (posicionFila, posicionColumna, (28)
		// Step 3. Obtain the actual value
		int[][] resultadoObtenido = testMatriz.insertarElementos(28, 3, 5);
		// Step 4. Compara el valor esperado con el valor obtenido
		assertArrayEquals(resultadoEsperado, resultadoObtenido);
	}

}
