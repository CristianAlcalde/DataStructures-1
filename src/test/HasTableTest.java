package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.HashTable;
import cap1.arrays.Person;

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
		
		
		@Test
		void insertELement() {
			// Step 1. instantiate the tested class using the constructor method.
			HashTable testedHashTable = new HashTable(17);
			Person person1 = new Person();
			person1.setDocument("1088346790");
			person1.setName("maicol");
			person1.setPhone("3455250");
			// Step 2. Create the expected value variable
			Person expectedValue[] = new Person[17];
			expectedValue[12]= person1;
			// Step 3. Obtain the actual value.
			Person[] actualValue = testedHashTable.insertElement("1088346790", "maicol", "3455250");
			// Step 4. Compare the expected versus actual values.
			actualValue.equals(expectedValue);
		}
		
		
		@Test
		void searchElement() {
			// Step 1. instantiate the tested class using the constructor method
			HashTable testedHash = new HashTable(17);
			// Step 2. Create the expected value variable
			String expectedValue = "1088346790";
			// Step 3. Obtain the actual value
			testedHash.insertElement("1088346790", "maicol", "3455250");
			String actualValue = testedHash.searchElement("1088346790");
			// Step 4. Compare the expected versus actual values
			assertEquals(expectedValue, actualValue);
		}
		
		@Test
		void testDeleteElement() {
			// Step 1. instantiate the tested class using the constructor method.
			HashTable testedHashTable = new HashTable(17);
			// Step 2. Create the expected value variable
			Person[] expectedValue = new Person[17];
			testedHashTable.insertElement("1088346790", "maicol", "3455250");
			// Step 3. Obtain the actual value.
			Person[] actualValue = testedHashTable.deleteElement("1088346790");
			// Step 4. Compare the expected versus actual values.
			assertArrayEquals(expectedValue, actualValue);
		}
		
		
		@Test
		void testupdateElements() {
			// Step 1. instantiate the tested class using the constructor method
			HashTable testedHashTable = new HashTable (13);
			Person person1= new Person();
			person1.setName("maicol");
			person1.setDocument("1088014584");
			person1.setPhone("3455250");
			// Step 2. Create the expected value variable
			Person[] expectedValue= new Person[13];
			expectedValue [7] = person1;
			// Step 3. Obtain the actual value
			testedHashTable.insertElement("1088014584","daniel","3441357");
			Person[] actualValue = testedHashTable.insertElement("1088014584","maicol","3455250");
			// Step 4. Compare the expected versus actual values
			person1.equals(expectedValue, actualValue);
		}
		
		
		
}
