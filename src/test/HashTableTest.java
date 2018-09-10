package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.HashTable;
import cap1.arrays.Person;
import cap1.arrays.Vector;

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

	

		@Test
		void testInsertElement() {
			// Step 1. instantiate the tested class using the constructor method
			HashTable Hash = new HashTable(11);
			// Step 2. Create the expected value variable
			Person NewDato = new Person();
			NewDato.setDocument("42011394");
			NewDato.setName("Alejandro");
			NewDato.setPhone("3142193936");
			Person[]  expectedvalue = new Person[11];
			expectedvalue[8] = NewDato;
			// Step 3. Obtain the actual value
			Person[] actualValue = Hash.insertElements("42011394", "Alejandro", "3142193936");
					// Step 4. Compare the expected versus actual values
			NewDato.assertArrayEquals(expectedvalue, actualValue);
		}

		
		@Test
		void testUpdateElement() {
			// Step 1. instantiate the tested class using the constructor method
			HashTable Hash = new HashTable(11);
			// Step 2. Create the expected value variable
			Person NewDato = new Person();
			NewDato.setDocument("1088348033");
			NewDato.setName("Alejandro");
			NewDato.setPhone("3142193936");
			Person[]  expectedvalue = new Person[11];
			expectedvalue[3] = NewDato;
			// Step 3. Obtain the actual value
			Person[] actualValue = Hash.updateElements("1088348033", "Alejandro", "3142193936");
					// Step 4. Compare the expected versus actual values
			NewDato.assertArrayEquals(expectedvalue, actualValue);
		}/*
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

