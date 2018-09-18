package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.HashTable;
import cap1.arrays.Vector;

class HashTableTest {

	@Test
	void hashFunctionTest() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable Hash = new HashTable(5);
		// Step 2. Create the expected value variable
		int expectedValue = 4;
		// Step 3. Obtain the actual value
		int actualValue = Hash.hashFunction("1225090354");
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable Hash = new HashTable(5);
		// Step 2. Create the expected value variable
		String[] expectedValue = new String[5];
		expectedValue[4] = "1225090354";
		// Step 3. Obtain the actual value
		String[] actualValue = Hash.insertElement("1225090354");
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
		// --------------------------------------------------------------------
		// --------------------------------------------------------------------
		// Step 2. Create the expected value variable
		float expectedValueFactor = 1 / 5;
		// Step 3. Obtain the actual value
		float actualValueFactor = Hash.getChargeFactor();
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValueFactor, actualValueFactor);
	}

	@Test
	void testSerchElement() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable Hash = new HashTable(5);
		// Step 2. Create the expected value variable
		int expectedValue = 4;
		// Step 3. Obtain the actual value
		int actualValue = Hash.serchElement("1225090354");
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testUpdateElement() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable Hash = new HashTable(5);
		// Step 2. Create the expected value variable
		String[] expectedValue = new String[5];
		expectedValue[4] = "1225090677";
		// Step 3. Obtain the actual value
		String[] actualValue = Hash.updateElement("1225090354", "1225090677");
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

	@Test
	void testDeleteElement() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable Hash = new HashTable(5);
		Hash.insertElement("1225090354");
		// Step 2. Create the expected value variable
		String[] expectedValue = new String[5];
		expectedValue[4] = "null";
		// Step 3. Obtain the actual value
		String[] actualValue = Hash.deleteElement("1225090354");
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
		// --------------------------------------------------------------------
		// --------------------------------------------------------------------
		// Step 2. Create the expected value variable
		float expectedValueFactor = 0 / 5;
		// Step 3. Obtain the actual value
		float actualValueFactor = Hash.getChargeFactor();
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValueFactor, actualValueFactor);
	}

	@Test
	void testDeletePosition() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable Hash = new HashTable(5);
		Hash.insertElement("1225090354");
		// Step 2. Create the expected value variable
		String[] expectedValue = new String[5];
		expectedValue[4] = "null";
		// Step 3. Obtain the actual value
		String[] actualValue = Hash.deletePosition(4);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
		// --------------------------------------------------------------------
		// --------------------------------------------------------------------
		// Step 2. Create the expected value variable
		float expectedValueFactor = 0 / 5;
		// Step 3. Obtain the actual value
		float actualValueFactor = Hash.getChargeFactor();
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValueFactor, actualValueFactor);
	}

}
