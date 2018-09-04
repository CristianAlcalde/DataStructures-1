package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.HashTable;
import cap1.arrays.Person;

class HashTableTest {

	@Test
	void testHashFunction() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHashTable = new HashTable(13); // Se crea una variable "testedHashTable" de la clase HashTable y se llama al metodo constructor "HashTable" dandole un tamaño al vector elements
		String person1 = "1087984628";		// Asigno el valor de entrada para la prueba
		// Step 2. Create the expected value variable
		Integer expectedValue = 9;			// Crear una variable la cual va a almacenar el resultado de la prueba y le doy el valor del resultado de la prueba
		// Step 3. Obtain the actual value
		Integer actualValue = testedHashTable.hashFunction(person1);		// Ejecuto el metodo que voy a probar con el valor "person1"
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testInsert() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHashTable = new HashTable(13); // Se crea una variable "testedHashTable" de la clase HashTable y se llama al metodo constructor "HashTable" dandole un tamaño al vector elements
		String[] person1 = new String[3];			// Asigno el valor de entrada para la prueba
		person1[0] = "Alejo";	   
		person1[1] = "1087984628";
		person1[2] = "3105062444";
		// Step 2. Create the expected value variable
		String[] expectedValue = new String[13];			// Crear una variable la cual va a almacenar el resultado de la prueba y le doy el valor del resultado de la prueba
		expectedValue[9] = person1[0];
		
		// Step 3. Obtain the actual value
		Person[] actualValue = testedHashTable.insertElements(person1, person1.getDocument());		// Ejecuto el metodo que voy a probar con el valor "person1"
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

}
