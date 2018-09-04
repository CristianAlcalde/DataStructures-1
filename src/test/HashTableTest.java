package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.HashTable;
import cap1.arrays.Person;

class HashTableTest {

	@Test
	void testHashFunction() {
		// Step 1. instantiate the tested class using the constructor method.
		HashTable testedHashTable = new HashTable(13);
		// Step 2. Create the expected value variable.
		int expectedValue = 6;
		float chargeFactorExpected = testedHashTable.getChargeFactor();
		// Step 3. Obtain the actual value.
		int actualValue = testedHashTable.hashFunction("1088352207");
		System.out.println("posición del elemento: " + actualValue);
		System.out.println("Factor de carga: " + chargeFactorExpected + "%");
		// Step 4. Compare the expected versus actual values.
		assertEquals(actualValue, expectedValue);

	}

	@Test
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method.
		HashTable testedHashTable = new HashTable(13);
		Person newPerson = new Person();
		newPerson.setDocument("1088352207");
		newPerson.setName("Dimas Hernandez");
		newPerson.setPhone("3219719928");
		// Step 2. Create the expected value variable.
		Person[] expectedValue = new Person[13];
		expectedValue[6] = newPerson;
		// Step 3. Obtain the actual value.
		Person[] actualValue = testedHashTable.insertElement("1088352207", "Dimas Hernandez", "3219719928");
		// Step 4. Compare the expected versus actual values.
		expectedValue.equals(actualValue);
	}
	
	@Test
	void testDeleteElement() {
		// Step 1. instantiate the tested class using the constructor method.
		HashTable  testedHashTable = new HashTable(13);
		// Step 2. Create the expected value variable
		Person[] expectedValue = new Person[13];
		// Step 3. Obtain the actual value.
		Person[] actualValue = testedHashTable.deleteElement("1088352207");
		// Step 4. Compare the expected versus actual values.
		assertArrayEquals(expectedValue, actualValue);
	}

}
