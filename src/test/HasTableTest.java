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
			
			HashTable testedHashTable = new HashTable(17);
			Person person1 = new Person();
			person1.setDocument("1088346790");
			person1.setName("Maicol");
			person1.setPhone("3455250");
			Person expectedValue[] = new Person[17];
			expectedValue[12]= person1;
			Person[] actualValue = testedHashTable.insertElement("1088346790", "Maicol", "3455250");
			// System.out.println(actualValue);
			actualValue.equals(expectedValue);
		}

}
