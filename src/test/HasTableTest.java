package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.HashTable;

class HasTableTest {

	
		@Test
		
		void hashFunctionTest() {
			// Step 1. instantiate the tested class using the constructor method
			HashTable testedHash = new HashTable(17);
			// Step 2. Create the expected value variable
			int expectedValue = 0;
			// Step 3. Obtain the actual value
			int actualValue = testedHash.hashFunction("1088346790");
			// Step 4. Compare the expected versus actual values
			assertEquals(expectedValue, actualValue);
		}
}
