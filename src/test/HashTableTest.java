package test; //
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import Utils.Person;
import cap1.arrays.HashTable;

class HashTableTest {

	@Test
	void testHashFunction() {
		// Step 1. Instance is created using the constructor method
		HashTable testedHashTable = new HashTable(12);
		
		// Step 2. Expected value is created
		int expectedValue = 0;
		
		// Step 3. Get the current value
		int actualValue = testedHashTable.hashFunction("1112104728");
		
		// Step 4. Compare values
		assertEquals(actualValue, expectedValue);
	}

	@Test
	void insertELement() {
		// Step 1. Instance is created using the constructor method		
		HashTable testedHashTable = new HashTable(12);
		
		// Step 2. Instantiate the class Person
		Person newperson = new Person();
		newperson.setDocument("1112104728");
		newperson.setName("Cristian");
		newperson.setPhone("3134485");
		
		// Step 3. Expected value is created
		Person expectedValue[] = new Person[12];
		expectedValue[0] = newperson;
		
		// Step 4. Get the current value
		Person[] actualValue = testedHashTable.insertElement("1112104728", "Cristian", "3134485");
		
		// Step 5. Compare values
		actualValue.equals(expectedValue);
	}
	
	@Test
	void deleteElement() {
		// Step 1. Instance is created using the constructor method		
		HashTable testedHashTable = new HashTable(12);
		
		// Step 2. Instantiate the class Person
		Person[] expectedValue = new Person[0];

		// Step 3. Obtain the actual value
		Person[] actualValue = testedHashTable.deleteElement("1112104728");
		
		// Step 4. Get the current value
		actualValue.equals(expectedValue);
	}
	
	@Test
	void updateElement() {
		// Step 1. Instance is created using the constructor method		
		HashTable testedHashTable = new HashTable(12);
		Person newperson = new Person();
		newperson.setDocument("1112104728");
		newperson.setName("David");
		newperson.setPhone("3134485");
		
		// Step 2. Instantiate the class Person
		Person[] expectedValue = new Person[12];
		expectedValue[10] = newperson;
		testedHashTable.insertElement("1112104728", "Crsitian", "3134485");
		
		// Step 3. Obtain the actual value
		Person[] actualValue = testedHashTable.updateElement("1088341248", "David", "3208796");
		
		// Step 4. Get the current value
		actualValue.equals(expectedValue);
	}
	
	@Test
	void searchElement() {
		// Step 1. Instance is created using the constructor method		
		HashTable testedHashTable = new HashTable(12);
		Person newperson = new Person();
		newperson.setDocument("1112104728");
		newperson.setName("Crsitian");
		newperson.setPhone("3134485");
		
		// Step 2. Instantiate the class Person
		Person[] expectedValue = new Person[12];
		expectedValue[0] = newperson;
		testedHashTable.insertElement("1112104728", "Crsitian", "3134485");
	
		// Step 3. Obtain the actual value
		Person[] actualValue = testedHashTable.searchElementByPosition(newperson.getDocument());
		
		// Step 4. Compare the expected versus actual values
		actualValue.equals(expectedValue);
	}
	
}