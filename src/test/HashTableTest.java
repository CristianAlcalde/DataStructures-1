package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Utils.Person;
import cap1.arrays.HashTable;
import cap1.arrays.Vector;

class HashTableTest {

	@Test
	void testHashFunction() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHashTable = new HashTable(13);
		// Step 2. Create the expected value variable
		int expectedValue = 10;
		// Step 3. Obtain the actual value
		int actualValue = testedHashTable.hashFunction("1088341248");
		// assertArrayEquals(expectedValue, actualValue);
		assertEquals(actualValue, expectedValue);
	}

	@Test
	void insertELement() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHashTable = new HashTable(13);
		// Step 2. instantiate the class Person
		Person newperson = new Person();
		newperson.setDocument("1088341248");
		newperson.setName("Oscar");
		newperson.setPhone("3269737");
		// Step 3. Obtain the ExpectedValue
		Person expectedValue[] = new Person[13];
		expectedValue[12] = newperson;
		// Step 4. Obtain the ActualValue
		Person[] actualValue = testedHashTable.insertElement("1088341248", "Oscar", "3269737");
		// Step 5. COmpare the ActualValue and ExpectedValue
		actualValue.equals(expectedValue);
	}

	@Test
	void deleteElement() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHashTable = new HashTable(13);
		// Step 2. Create the expected value variable
		Person[] expectedValue = new Person[13];
		// Step 3. Obtain the actual value
		Person[] actualValue = testedHashTable.deleteElement("1088341248");
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

	@Test
	void updateElement() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHashTable = new HashTable(13);
		Person newperson = new Person();
		newperson.setDocument("1088341248");
		newperson.setName("Alberto");
		newperson.setPhone("3208796");
		// Step 2. Create the expected value variable
		Person[] expectedValue = new Person[13];
		expectedValue[10] = newperson;
		testedHashTable.insertElement("1088341248", "Oscar", "3269737");
		// Step 3. Obtain the actual value
		Person[] actualValue = testedHashTable.updateElement("1088341248", "Alberto", "3208796");
		// Step 4. Compare the expected versus actual values
		actualValue.equals(expectedValue);
	}

	@Test
	void searchElement() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHashTable = new HashTable(13);
		Person newperson = new Person();
		newperson.setDocument("1088341248");
		newperson.setName("Oscar");
		newperson.setPhone("3269737");
		// Step 2. Create the expected value variable
		Person[] expectedValue = new Person[13];
		expectedValue[10] = newperson; // ***
		testedHashTable.insertElement("1088341248", "Oscar", "3269737");
		// Step 3. Obtain the actual value
		Person[] actualValue = testedHashTable.searchElementByPosition(newperson.getDocument());
		// Step 4. Compare the expected versus actual values
		actualValue.equals(expectedValue);
	}

}