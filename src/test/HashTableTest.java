package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.HashTable;
import cap1.arrays.Persona;

class HashTableTest {

	@Test
	void FuncionHashtest() {
		
		// Step 1. instantiate the tested class using the constructor method
		HashTable funcion = new HashTable(12);
		// Step 2. Create the expected value variable
		int valorEsperado = 9;
		// Step 3. Obtain the actual value
		int valorActual = funcion.funcionHash("1088029344", 0);
		// Step 4. Compare the expected versus actual values
		assertEquals(valorEsperado, valorActual);		
	}
	
	@Test
	void InsertHashtest() {
		
		// Step 1. instantiate the tested class using the constructor method
		HashTable funcion = new HashTable(12);
		Persona nuevaPersona = new Persona("1088029344","Daniel Ciro","3230821");
		// Step 2. Create the expected value variable
		Persona[] valorEsperado = new Persona[12];
		valorEsperado[9] = nuevaPersona;
		// Step 3. Obtain the actual value
		Persona[] valorActual = funcion.InsertHash("1088029344","Daniel Ciro", "3230821");
		// Step 4. Compare the expected versus actual values
		System.out.println("Factor de Cambio (Insertando) : " + funcion.getFactorCambio() + " % ");
		nuevaPersona.assertArrayEquals(valorEsperado, valorActual);
	}

	@Test
	void DeleteHashtest() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable funcion = new HashTable(12);
		// Step 2. Create the expected value variable
		Persona[] valorEsperado = new Persona[12];
		// Step 3. Obtain the actual value
		funcion.InsertHash("1088029344", "Daniel Ciro", "3230821");
		Persona[] valorActual = funcion.DeleteHash("1088029344");
		// Step 4. Compare the expected versus actual values
		System.out.println("Factor de Cambio (Eliminando) : " + funcion.getFactorCambio() + " % ");
		assertArrayEquals(valorEsperado, valorActual);
	}

	@Test
	void SearchHashtest() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable funcion = new HashTable(12);
		// Step 2. Create the expected value variable
		String valorEsperado = "1088029344";
		// Step 3. Obtain the actual value
		funcion.InsertHash("1088029344", "Daniel Ciro", "3230821");
		String valorActual = funcion.SearchHash("1088029344");
		// Step 4. Compare the expected versus actual values
		assertEquals(valorEsperado, valorActual);
	}

	@Test
	void UpdateHashtest() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable funcion = new HashTable(12);
		Persona nuevaPersona = new Persona("1088029344", "Daniel Ciro", "3230821");
		// Step 2. Create the expected value variable
		Persona[] valorEsperado = new Persona[12];
		valorEsperado[9] = nuevaPersona;
		// Step 3. Obtain the actual value
		funcion.InsertHash("1088029344", "Daniel Ciro", "3230821");
		Persona[] valorActual = funcion.UpdateHash("1088029344", "Daniel Ciro", "3230821");
		// Step 4. Compare the expected versus actual values
		nuevaPersona.assertArrayEquals(valorEsperado, valorActual);
	}
	
	@Test
	void ListHashtest() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable funcion = new HashTable(12);
		Persona nuevaPersona = new Persona("1088029344", "Daniel Ciro", "3230821");
		// Step 2. Create the expected value variable
		Persona[] valorEsperado = new Persona[12];
		valorEsperado[9] = nuevaPersona;
		// Step 3. Obtain the actual value
		funcion.InsertHash("1234567", "Juanito Alimaña", "2312323");
		Persona[] valorActual = funcion.InsertHash("1088029344", "Daniel Ciro", "3230821");
		// Step 4. Compare the expected versus actual values
		funcion.ListaHash("1088029344", "1234567");
		System.out.println("Factor de Cambio : " + funcion.getFactorCambio() + " % ");
		nuevaPersona.assertArrayEquals(valorEsperado, valorActual);
	}

}
