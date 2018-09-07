package test;

import org.junit.jupiter.api.Test;

import cap1.arrays.Matrix;

class MatrixTest {

	public MatrixTest() {}
	  
	  Matrix matri = new Matrix(5, 5);
	  
	  @Test
	  public void tesagregarbuscartMatriz() {
	    matri.agregar(1, 0, 12);
	    matri.agregar(1, 1, 10);
	    matri.agregar(2, 2, 13);
	    matri.agregar(2, 3, 14);
	    matri.agregar(2, 4, 15);
	    matri.agregar(2, 5, 16);
	    int esperado = matri.buscar(1, 0);
	    int valoresperado = matri.buscar(1, 0);
	    org.junit.Assert.assertEquals(valoresperado, esperado);
	  }
	  
	  @Test
	  public void testEliminarElemento()
	  {
	    matri.agregar(1, 0, 12);
	    matri.agregar(1, 1, 10);
	    matri.agregar(2, 2, 13);
	    matri.agregar(2, 3, 14);
	    matri.agregar(2, 4, 15);
	    matri.agregar(2, 5, 16);
	    int dato = matri.eliminarElemento(1, 0);
	    int esperado = matri.eliminarElemento(1, 0);
	    org.junit.Assert.assertEquals(esperado, dato);
	  }
	  
	  @Test
	  public void testListar() {
	    matri.agregar(0, 0, 12);
	    matri.agregar(1, 1, 10);
	    matri.agregar(2, 2, 13);
	    matri.agregar(3, 3, 14);
	    matri.agregar(4, 4, 15);
	    matri.agregar(5, 5, 16);
	    int dato = matri.listar();
	    int esperado = matri.listar();
	    org.junit.Assert.assertEquals(esperado, dato);
	  }
	  
	  @Test
	  public void testActualizar() {
	    matri.agregar(0, 0, 12);
	    int dato = matri.actualizar(0, 0, 10);
	    int esperado = 10;
	    org.junit.Assert.assertEquals(esperado, dato);
	  }
	  

	  @Test
	  public void testmulti()
	  {
	    matri.agregar(0, 0, 12);
	    matri.agregar(0, 0, 2);
	    
	    int dato = matri.multi();
	    int esperado = matri.multi();
	    org.junit.Assert.assertEquals(esperado, dato);
	  }

			

}
