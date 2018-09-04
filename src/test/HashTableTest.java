package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import cap1.arrays.HashTable;
import cap1.arrays.Person;
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
		// String document="1088341248"; String name="Oscar"; String phone= "3269737";
		HashTable testedHashTable = new HashTable(13);
		Person newperson = new Person();
		newperson.setDocument("1088341248");
		newperson.setName("Oscar");
		newperson.setPhone("3269737");
		// Step 2. Create the expected value variable
		// Person[] expectedValue = new Person[10];
		// Person[] expectedValue =testedHashTable.insertElement("1088341248", "Oscar",
		// "3269737");
		int expectedValue[] = this.getDocument("1088341248");
		// System.out.println(expectedValue);
		// System.out.println(newperson);
		// Step 3. Obtain the actual value
		Person[] actualValue = testedHashTable.insertElement("1088341248", "Oscar", "3269737");
		// System.out.println(actualValue);
		assertEquals(expectedValue, actualValue);
	}

	// Step 1. instantiate the tested class using the constructor method
	// Step 2. Create the expected value variable
	// Step 3. Obtain the actual value
	// assertArrayEquals(expectedValue, actualValue);
	@Test
	void deleteElement() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHashTable = new HashTable(13);
		// Step 2. Create the expected value variable
		Person[] expectedValue = new Person[13];
		// testedVector.deleteElement(expectedValue, 9);
		// Step 3. Obtain the actual value
		Person[] actualValue = testedHashTable.deleteElement("1088341248");
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

}
