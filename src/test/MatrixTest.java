package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.Matrix;

class MatrixTest {

	@Test
	void testInsertarElemento() {
		int Filas = 8;
		int Columnas = 4;
		int Elemento = 5;
		Matrix Matriz = new Matrix (Filas, Columnas);
		
		int NuevoElemento = Matriz.insertarElemento(3, 2, Elemento);
		
		assertEquals(NuevoElemento, Elemento);
		
	}

	

	@Test
	void testBuscarElementoValor() {
		int valor = 5;
		Matrix Matriz = new Matrix (8, 4);
		
		int[] Elemento = {3,2};
		int[] NuevoElemento = Matriz.buscarElementoValor(valor);
		
		assertEquals(Elemento, NuevoElemento);
	}

	@Test
	void testEliminarElemento() {
		int Filas = 3;
		int Columnas = 2;
		int valor = 0;
		Matrix Matriz = new Matrix (8, 4);
		
		int NuevoValor = Matriz.eliminarElemento(Filas, Columnas);
		assertEquals(NuevoValor, valor);
		
		
	}

}
