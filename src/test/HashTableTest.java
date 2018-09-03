package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.HashTable;
import cap1.arrays.Vector;

class HashTableTest {

	@Test
	void testHashtable() {
		// Step 1. instantiate the tested class using the constructor method
				HashTable testedHashTable = new HashTable(11);
				// Step 2. Create the expected value variable
				int expectedValue = 7;
				// Step 3. Obtain the actual value
				int actualValue = testedHashTable.HashFuntion("42011394");
				// Step 4. Compare the expected versus actual values
				assertEquals(expectedValue, actualValue);
	}

}
