package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import cap1.arrays.HashTable;


class HashTableTest {

	@Test
	void testHashFunction() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHashTable = new HashTable(13);
		// Step 2. Create the expected value variable
		int expectedValue = 7;
		// Step 3. Obtain the actual value
		int actualValue = testedHashTable.hashFunction("1088352207");
		// assertArrayEquals(expectedValue, actualValue);
		assertEquals(actualValue, expectedValue);
	}

}
