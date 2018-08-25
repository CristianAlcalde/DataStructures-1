package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import cap1.arrays.Matrix;

class MatrixTest {

	@Test // INSERTAR
	void testInsertElement() {
		Matrix testedMatrix = new Matrix(5, 5);
		int[][] expectedValue = new int[5][5];
		expectedValue[0][0] = 99;
		int[][] actualValue = testedMatrix.insertElement(99, 0, 0);
		assertArrayEquals(expectedValue, actualValue);
	}

	@Test // BUSCAR
	void testSearchElement() {
		Matrix testedMatrix = new Matrix(5, 5);
		int expectedValue = 99;
		testedMatrix.insertElement(expectedValue, 4, 3);
		int actualValue = testedMatrix.searchElementByxyPosition(4, 3);
		assertEquals(expectedValue, actualValue);
	}

	@Test // ACTUALIZAR
	void testUpdateElement() {
		Matrix testedMatrix = new Matrix(5, 5);
		int[][] expectedValue = new int[5][5];
		expectedValue[0][0] = 99;
		int[][] actualValue = testedMatrix.insertElement(99, 0, 0);
		assertArrayEquals(expectedValue, actualValue);
	}

	@Test // LISTAR
	void testListElement() {
		Matrix testedMatrix = new Matrix(2, 2);
		int[][] expectedValue = { { 1, 2 }, { 3, 4 } };
		testedMatrix.insertElement(1, 0, 0);
		testedMatrix.insertElement(2, 0, 1);
		testedMatrix.insertElement(3, 1, 0);
		testedMatrix.insertElement(4, 1, 1);
		int[][] actualValue = testedMatrix.listElement();
		assert Arrays.deepEquals(expectedValue, actualValue);
		System.out.println("El valor esperado es: " + expectedValue);
		System.out.println("El valor actual es: " + actualValue);
	}
}
