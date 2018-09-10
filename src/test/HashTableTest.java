package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import cap1.arrays.HashTable;
import utils.Person;

class HashTableTest {


		@Test
		void testHashFunction() {
			// Step 1. instantiate the tested class using the constructor method
			HashTable testedHashTable = new HashTable();
			// Step 2. Create the expected value variable
			int expectedValue = 10;
			// Step 3. Obtain the actual value
			int actualValue = testedHashTable.hashFunction("1094949423");
			// assertArrayEquals(expectedValue, actualValue);
			assertEquals(actualValue, expectedValue);
		}

		@Test
		void insertELement() {
			
			HashTable testedHashTable = new HashTable(13);
			Person newperson = new Person();
			newperson.setDocument("1094949423");
			newperson.setName("Juan David");
			newperson.setPhone("3175756046");
			Person expectedValue[] = new Person[13];
			expectedValue[12]= newperson;
			Person[] actualValue = testedHashTable.insertElement("1094949423", "Oscar", "3175756046");
			// System.out.println(actualValue);
			actualValue.equals(expectedValue);
		}

		// Step 1. instantiate the tested class using the constructor method
		// Step 2. Create the expected value variable
		// Step 3. Obtain the actual value
		// assertArrayEquals(expectedValue, actualValue);
		@Test
		void deleteElement() {
			// Step 1. instantiate the tested class using the constructor method
			HashTable testedHashTable = new HashTable(13);
			// Step 2. Create the expected value variable
			Person[] expectedValue = new Person[13];
			// Step 3. Obtain the actual value
			Person[] actualValue = testedHashTable.deleteElement("1094949423");
			// Step 4. Compare the expected versus actual values
			assertArrayEquals(expectedValue, actualValue);
		}
		@Test
		void updateElement() {
			// Step 1. instantiate the tested class using the constructor method
			HashTable testedHashTable = new HashTable(13);
			Person newperson = new Person();
			newperson.setDocument("10949423");
			newperson.setName("Dimas Hernandez");
			newperson.setPhone("31532796");
			// Step 2. Create the expected value variable
			Person[] expectedValue = new Person[13];
			expectedValue[10]= newperson;
			testedHashTable.insertElement("1094949423","Juam David","3269737");
			// Step 3. Obtain the actual value
			Person[] actualValue = testedHashTable.updateElement("10949423","Dimas Hernandez","31532796");
			// Step 4. Compare the expected versus actual values
			actualValue.equals(expectedValue);
		}

	}