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
	void testInsertElements() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHashTable = new HashTable(13); // Se crea una variable "testedHashTable" de la clase HashTable y se llama al metodo constructor "HashTable" dandole un tamaño al vector elements
		Person[] expectedValue = new Person[13];			// Crear una variable la cual va a almacenar el resultado de la prueba y le doy el valor del resultado de la prueba
		Person person1 = new Person("1087984628", "Alejo", "3104062444");
		// Step 2. Create the expected value variable
		expectedValue[9] = person1;
		// Step 3. Obtain the actual value
		Person[] actualValue = testedHashTable.insertElements(person1, person1.getDocument());		// Ejecuto el metodo que voy a probar con el valor "person1"
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void testSearchElements() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHashTable = new HashTable(13); // Se crea una variable "testedHashTable" de la clase HashTable y se llama al metodo constructor "HashTable" dandole un tamaño al vector elements
		Person[] expectedValue = new Person[13];			// Crear una variable la cual va a almacenar el resultado de la prueba y le doy el valor del resultado de la prueba
		Person person1 = new Person("1087984628", "Alejo", "3104062444");
		// Step 2. Create the expected value variable
		expectedValue[9] = person1;
		testedHashTable.insertElements(person1, person1.getDocument());
		// Step 3. Obtain the actual value
		Person[] actualValue = testedHashTable.searchElements(person1.getDocument());		// Ejecuto el metodo que voy a probar con el valor "person1"
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void testUpdateElements() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHashTable = new HashTable(13); // Se crea una variable "testedHashTable" de la clase HashTable y se llama al metodo constructor "HashTable" dandole un tamaño al vector elements
		Person[] expectedValue = new Person[13];			// Crear una variable la cual va a almacenar el resultado de la prueba y le doy el valor del resultado de la prueba
		Person person1 = new Person("1087984628", "Alejo", "3104062444");
		Person person2 = new Person("1087984628", "Maria", "3116164734");
		// Step 2. Create the expected value variable
		expectedValue[9] = person2;
		testedHashTable.insertElements(person1, person1.getDocument());
		// Step 3. Obtain the actual value
		Person[] actualValue = testedHashTable.updateElements(person2, person2.getDocument());		// Ejecuto el metodo que voy a probar con el valor "person1"
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

}
