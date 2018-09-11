package test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import cap1.arrays.HashTable;
import cap1.arrays.Person;

class HashTableTest {
	
      @Test
		void testHashfunction() {
		
			HashTable testedHashTable = new HashTable(5);
			int actualValue = testedHashTable.functionHash("1086106357");
			int expectedValue = 9;
			assertEquals(expectedValue,actualValue);
		}



       	@Test
       	void testInsertElement() {
	// Step 1. instantiate the tested class using the constructor method
       			HashTable testedHashTable = new HashTable(10);
       			Person person = new Person();
       			person.setName("Hernan Reina");
       			person.setDocument("1086106357");
       	
    // Step 2. Create the expected value variable
       			Person[] expectedValue = new Person[10];
       			expectedValue[6] = person;
       			
	// Step 3. Obtain the actual value
       			Person[] actualValue = testedHashTable.insertElement(person.getName(), person.getDocument());
	
	// Step 4. Compare the expected versus actual values
       			person.equals(expectedValue, actualValue);
       	}

       	@Test
       	void testSearchElement() {
	// Step 1. instantiate the tested class using the constructor method
       		HashTable testedHashTable = new HashTable(13);
       		
	// Step 2. Create the expected value variable
       		String expectedValue = "1086106357";
       		
	// Step 3. Obtain the actual value
       		testedHashTable.insertElement("Hernan Reina", "106106357");
       		String actualValue = testedHashTable.searchElement("1086106357");
       		
	// Step 4. Compare the expected versus actual values
	assertEquals(expectedValue, actualValue);
       	}

       	@Test
       	void testUpdateElement() {
	// Step 1. instantiate the tested class using the constructor method
       		HashTable testedHashtable = new HashTable(10);
       		Person person = new Person();
       		person.setName("Hernan Reina");
       		person.setDocument("1086106357");
       		
	// Step 2. Create the expected value variable
       		Person[] expectedValue = new Person[10];
       		expectedValue[6]= person;
       		
	// Step 3. Obtain the actual value
       		testedHashtable.insertElement("Hernan Reina","1086106357");
       		Person[] actualValue = testedHashtable.updateElement(person.getName(),person.getDocument());
       		
	// Step 4. Compare the expected versus actual values
       		person.equals(expectedValue, actualValue);
       	}

       	@Test
       	void testDeleteElement() {
	// Step 1. instantiate the tested class using the constructor method
       		HashTable testedHashtable = new HashTable(13);
       		Person person = new Person();
       		person.setName("Hernan Reina");
       		person.setDocument("1086106357");
       		
       		
	// Step 2. Create the expected value variable
       		Person[] expectedValue = new Person[13];
       		
	// Step 3. Obtain the actual value
       		testedHashtable.insertElement(person.getName(),person.getDocument());
       		Person[] actualValue = testedHashtable.deleteElement(person.getDocument());
       		
	// Step 4. Compare the expected versus actual values
       		person.equals(expectedValue, actualValue);
       	}

}
