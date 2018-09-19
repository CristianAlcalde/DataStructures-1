package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap2.LinkedLists.DoubleList;

	
	public class DoubleListTest {

		DoubleList lista = new DoubleList();

		@Test
		public void testInsertarCabeza() {

			lista.insertarCabeza("primero");
			lista.insertarCabeza("segundo");
			lista.insertarCabeza("tercero");
			lista.insertarCabeza("quinto");
			lista.insertarCabeza(2);

			lista.imprimirLista();

			boolean resultadoBusqueda = lista.buscarElemento("primero");

			assertTrue(resultadoBusqueda);
		}
		
		// @Test
		public void testInsertarCola() {

			lista.insertarCola("primero");
			lista.insertarCola("segundo");
			lista.insertarCola("tercero");
			lista.insertarCola("quinto");
			lista.insertarCola("sexto");

			lista.imprimirLista();

			boolean resultadoBusqueda = lista.buscarElemento("primero");
			boolean resultadoBusqueda2 = lista.buscarElemento(1);

			assertTrue(resultadoBusqueda2);
			assertTrue(resultadoBusqueda);
		}
		
		// @Test
		public void testEliminar() {

			lista.insertarCola("primero");
			lista.insertarCola("segundo");
			lista.insertarCola("tercero");
			lista.insertarCola("quinto");
			lista.insertarCola("cuarto");

			boolean resultadoBusqueda = lista.eliminarElemento("segundo");

			lista.imprimirLista();

			assertTrue(resultadoBusqueda);
		}

		// @Test
		public void testListar() {

			lista.insertarCola("primero");
			lista.insertarCola("segundo");
			lista.insertarCola("tercero");
			lista.insertarCola("quinto");
			lista.insertarCola(4);

			Object[] resultadoLista = lista.listar();
			Object[] resultadoEsperado = { "primero", "segundo", "tercero", "quinto", 1 };

			assertArrayEquals(resultadoLista, resultadoEsperado);
		}

		// @Test
		public void testActualizar() {

			lista.insertarCola("primero");
			lista.insertarCola("segundo");
			lista.insertarCola("tercero");
			lista.insertarCola("quinto");
			lista.insertarCola("cuarto");

			boolean resultado = lista.ActualizarLista("cuarto", "3");

			lista.ActualizarLista("primero", "yeisson");
			lista.ActualizarLista("tercero", 22);
			lista.ActualizarLista("segundo", "Lista Doble Terminada");
			lista.imprimirLista();

			assertTrue(resultado);
		}

}

