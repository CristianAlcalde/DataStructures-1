package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.HashTable;
import cap1.arrays.person;

class HashTableTest {

	@Test
	public void testhashfuntion() {
		HashTable Hash = new HashTable(5);
		int actualValue = Hash.hashfuntion("13477");
		int expectedValue = 2;
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method.
		HashTable testedHashTable = new HashTable(10);
		person Person = new person();
		Person.setName("Paola Ramirez");
		Person.setDocument("1088347722");
		Person.setPhone("3146207044");
		// Step 2. Create the expected value variable.
		person[] expectedValue = new person[10];
		expectedValue[6] = Person;
		// Step 3. Obtain the actual value.
		person[] actualValue = testedHashTable.insertElement(Person.getName(), Person.getDocument(), Person.getPhone());
		Person.Equals(expectedValue, actualValue);
	}

	@Test
	void testUpdateElement() {
		// Step 1. instantiate the tested class using the constructor method.
		HashTable testedHashTable = new HashTable(10);
		person Person = new person();
		Person.setName("Angee Ramirez");
		Person.setDocument("1088347722");
		Person.setPhone("3146207044");
		// Step 2. Create the expected value variable
		person[] expectedValue = new person[10];
		expectedValue[6] = Person;
		testedHashTable.insertElement(Person.getName(), Person.getDocument(), Person.getPhone());
		// Step 3. Obtain the actual value.
		person[] actualValue = testedHashTable.updateElement("Angee Ramirez", "1088347722", "3270266");
		// Step 4. Compare the expected versus actual values.
		Person.Equals(expectedValue, actualValue);
	}

	@Test
	void testDeleteElement() {
		// Step 1. instantiate the tested class using the constructor method.
		HashTable testedHashTable = new HashTable(10);
		// Step 2. Create the expected value variable
		person[] expectedValue = new person[10];
		testedHashTable.insertElement("Angee Ramirez", "1088347722", "31462070444");
		// Step 3. Obtain the actual value.
		person[] actualValue = testedHashTable.deleteElement("1088347722");
		// Step 4. Compare the expected versus actual values.
		assertArrayEquals(expectedValue, actualValue);
	}

}
