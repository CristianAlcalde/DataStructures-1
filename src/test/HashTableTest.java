package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.HashTable;
import cap1.arrays.Vector;

class HashTableTest {

	@Test
	void FuntionHash() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHash = new HashTable(13);
		// Step 2. Create the expected value variable
		int expectedValue = 12;
		// Step 3. Obtain the actual value
		int actualValue = testedHash.FuntionHash("18609698");
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}
}
