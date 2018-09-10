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
		}/
		@Test
		void DeleteTableHash() {
			// Step 1. instantiate the tested class using the constructor method
			HashTable testedHash = new HashTable(11);
			// Step 2. Create the expected value variable
			Person[] expectedValue = new Person[11];
			// Step 3. Obtain the actual value
			testedHash.InserTableHash("1088348033", "Alejandro", "3142193936");
			Person[] actualValue = testedHash.DeleteTableHash("1088348033");
			// Step 4. Compare the expected versus actual values
			System.out.println("Charge factor in (delete): " + testedHash.getChangefactor() + " % ");
			assertArrayEquals(expectedValue, actualValue);
		}

		@Test
		void SearchTableHash() {
			// Step 1. instantiate the tested class using the constructor method
			HashTable testedHash = new HashTable(11);
			// Step 2. Create the expected value variable
			String expectedValue = "1088348033";
			// Step 3. Obtain the actual value
			testedHash.InserTableHash("1088348033", "Alejandro", "3142193936");
			String actualValue = testedHash.SearchTableHash("18609698");
			// Step 4. Compare the expected versus actual values
			assertEquals(expectedValue, actualValue);
		}

	
	}

