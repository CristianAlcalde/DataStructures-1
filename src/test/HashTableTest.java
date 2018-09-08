package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.HashTable;

class HashTableTest {


	@Test
	void testHashTable() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable TestedHashTable = new HashTable(11);
		// Step 2. Create the expected value variable
		int expectedValue = 8;
		// Step 3. Obtain the actual value
		int actualValue = TestedHashTable.HashFuntion("42011394");
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

	
	/*
		@Test
		void testInsertElement() {
			// Step 1. instantiate the tested class using the constructor method
			Matrix testedMatrix = new Matrix(5,5);
			// Step 2. Create the expected value variable
			int[][] expectedValue = new int[5][5];
			expectedValue[0][0] = 999;
			// Step 3. Obtain the actual value
			int[][] actualValue = testedMatrix.insertElement(999, 0, 0);
			// Step 4. Compare the expected versus actual values
			assertArrayEquals(expectedValue, actualValue);
		}
		
		@Test
		void testUpdateElement() {
			// Step 1. instantiate the tested class using the constructor method
			Matrix testedMatrix = new Matrix(5,5);
			// Step 2. Create the expected value variable
			int[][] expectedValue = new int[5][5];
			expectedValue[0][0] = 888;
			// Step 3. Obtain the actual value
			int[][] actualValue = testedMatrix.updateElement(888, 0, 0);		// Step 4. Compare the expected versus actual values
			assertArrayEquals(expectedValue, actualValue);
		}

		@Test
		void testDeleteElement() {
			// Step 1. instantiate the tested class using the constructor method
			Matrix testedMatrix = new Matrix(5,5);
			// Step 2. Create the expected value variable
			int expectedValue = 999;
			testedMatrix.insertElement(expectedValue, 0, 0);
			// Step 3. Obtain the actual value
			int[][] actualValue = testedMatrix.deleteElement(expectedValue);
			// Step 4. Compare the expected versus actual values
			int pos = testedMatrix.searchElementByValue(expectedValue);

			assertEquals(-1, pos);
		}
		
		@Test
		void testSearchElement() {
			// Step 1. instantiate the tested class using the constructor method
			Matrix testedMatrix = new Matrix(5,5);
			// Step 2. Create the expected value variable
			int expectedValue = 999;
			testedMatrix.insertElement(expectedValue, 0, 0);
			// Step 3. Obtain the actual value
			int actualValue = testedMatrix.searchElementByPosition(0, 0);
			// Step 4. Compare the expected versus actual values
			assertEquals(expectedValue, actualValue);
		}
		
		@Test
		void ListElement() {
			// Step 1. instantiate the tested class using the constructor method
			Matrix testedMatrix = new Matrix(5,5);
			// Step 2. Create the expected value variable
			int expectedValue = 999;
			testedMatrix.insertElement(expectedValue, 0, 0);
			// Step 3. Obtain the actual value
			int actualValue = testedMatrix.searchElementByPosition(0, 0);
			//int[][] actualValue = testedMatrix.ListElement(999, 0, 0);
			// Step 4. Compare the expected versus actual values
			assertEquals(expectedValue, actualValue);
						}
		*/
}

