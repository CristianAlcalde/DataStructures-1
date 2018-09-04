package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.HashTable;


class HashTableTest {

	@Test
	public void testhashfuntion() {
		HashTable Hash = new HashTable(5);		
		int actualValue = Hash.hashfuntion("13477");
		int expectedValue = 2;
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHashTable = new HashTable(10);
		String[] person1 = new String[10];
		// Step 2. Create the expected value variable
		String[] expectedValue = new String[10];
		expectedValue[6] = expectedValue[0];
		// Step 3. Obtain the actual value
		String[]actualValue = testedHashTable.insertElement(person1);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	
	
}
}



	
