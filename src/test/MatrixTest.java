package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.Matrix;

class MatrixTest {

	@Test
	void testInsertElement() {
		// Step 1. Instanciamos el dato a testear usando los metodos creados
		Matrix testedMatrix = new Matrix(77);
		// Step 2. Creamos el dato a esperar
		int[] expectedValue = new int[77];
		expectedValue[0] = 100;
		// Step 3. Obtiene el valor actual
		int[] actualValue = testedMatrix.insertElement(100, 0);
		// Step 4. Compara el valor actual con el esperado
		assertArrayEquals(expectedValue, actualValue);
	}

	@Test
	void testSearchElement() {
		// Step 1. Instanciamos el dato a testear usando los metodos creados
		Matrix testedMatrix = new Matrix(10);
		// Step 2. Creamos el dato a esperar
		int expectedValue = 999;
		testedMatrix.insertElement(expectedValue, 9);
		// Step 3. Obtiene el valor actual
		int actualValue = testedMatrix.searchElementByPosition(9);
		// Step 4. Compara el valor actual con el esperado
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testUpdateElement() {
		// Step 1. Instanciamos el dato a testear usando los metodos creados
		Matrix testedMatrix = new Matrix(10);
		// Step 2. Creamos el dato a esperar
		int[] expectedValue = new int[10];
		expectedValue[0] = 888;
		// Step 3. Obtiene el valor actual
		int[] actualValue = testedMatrix.updateElement(888, 0);
		// Step 4. Compara el valor actual con el esperado
		assertArrayEquals(expectedValue, actualValue);
	}

	@Test
	void testDeleteElement() {
		// Step 1. Instanciamos el dato a testear usando los metodos creados
		Matrix testedMatrix = new Matrix(10);
		// Step 2. Creamos el dato a esperar
		int expectedValue = 999;
		testedMatrix.insertElement(expectedValue, 9);
		// Step 3. Obtiene el valor actual
		int[] actualValue = testedMatrix.deleteElement(expectedValue);
		// Step 4. Compara el valor actual con el esperado
		int pos = testedMatrix.searchElementByValue(expectedValue);

		assertEquals(-1, pos);
	}
}
