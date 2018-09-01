package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import cap1.arrays.HashTable;
import cap1.arrays.Person;
import cap1.arrays.Vector;

class HashTableTest {

	@Test
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHashTable = new HashTable(5);
		// Step 2. Create the expected value variable
		int[] expectedValue = new int[5];
		expectedValue[0] = 3;
		// Step 3. Obtain the actual value
		Person actualValue = testedHashTable.insertElement(actualValue, 0);
		// Step 4. Compare the expected versus actual values
	//	assertArrayEquals(expectedValue, actualValue);
		assertEquals(actualValue, 3);
	}

}
