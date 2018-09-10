package test;


import static org.junit.Assert.*;

import org.junit.Test;

import cap1.arrays.HashTable;


public class HashTableTest {
	
	
	@Test
	public void testfunctionHash() {
		String cedula = "23456";
		int posicionEsperada = 27;

		HashTable miTabla = new HashTable(10);
	    int posicionObtenida = miTabla.funcionHash(cedula);
		assertEquals(posicionEsperada, posicionObtenida);

	}
}
