package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.HashTable;
import cap1.arrays.Person;
import cap1.arrays.Vector;

class HashTableTest {
	@Test
	void testHashtable() {
		// Step 1. instantiate the tested class using the constructor method
				HashTable testedHashTable = new HashTable(13);
				// Step 2. Create the expected value variable
				int expectedValue = 7;
				// Step 3. Obtain the actual value
				int actualValue = testedHashTable.HashFuntion("1088014584");
				// Step 4. Compare the expected versus actual values
				assertEquals(expectedValue, actualValue);
	}
	@Test
	void testinsertElements() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHashTable = new HashTable (13);
		Person newdato= new Person();
		newdato.setName("anibal");
		newdato.setDocument("1088014584");
		newdato.setPhone("3057987534");
		// Step 2. Create the expected value variable
		Person[] expectedValue= new Person[13];
		expectedValue [7] = newdato;
		// Step 3. Obtain the actual value
		Person[] actualValue = testedHashTable.insertElements("anibal","1088014584","3057987534");
		// Step 4. Compare the expected versus actual values
		newdato.equals(actualValue);
	}
	
	@Test
	void testsearchtElements() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHashTable = new HashTable (13);
		Person newdato= new Person();
		newdato.setName("anibal");
		newdato.setDocument("42011394");
		newdato.setPhone("3057987534");
		// Step 2. Create the expected value variable
		Person[] expectedValue= new Person[13];
		expectedValue [7] = newdato;
		// Step 3. Obtain the actual value
		Person[] actualValue = testedHashTable.insertElements("anibal","1088014584","3057987534");
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}
}