package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.HashTable;
import cap1.arrays.Person;

class HashTableTest {

	@Test
	void testHashFunction() {
		// Step 1. instantiate the tested class using the constructor method.
		HashTable testedHashTable = new HashTable(13);
		// Step 2. Create the expected value variable.
		int expectedValue = 6;
		// Step 3. Obtain the actual value.
		int actualValue = testedHashTable.hashFunction("1088352207");
		// Step 4. Compare the expected versus actual values.
		assertEquals(actualValue, expectedValue);

	}

	@Test
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method.
		HashTable testedHashTable = new HashTable(13);
		Person newPerson = new Person();
		newPerson.setDocument("1088352207");
		newPerson.setName("Dimas Hernandez");
		newPerson.setPhone("3219719928");
		// Step 2. Create the expected value variable.
		Person[] expectedValue = new Person[13];
		expectedValue[6] = newPerson;
		// Step 3. Obtain the actual value.
		Person[] actualValue = testedHashTable.insertElement(newPerson.getDocument(), newPerson.getName(),
				newPerson.getPhone());
		// Step 4. Compare the expected versus actual values.
		newPerson.Equals(expectedValue, actualValue);
	}

	@Test
	void testDeleteElement() {
		// Step 1. instantiate the tested class using the constructor method.
		HashTable testedHashTable = new HashTable(13);
		// Step 2. Create the expected value variable
		Person[] expectedValue = new Person[13];
		testedHashTable.insertElement("1088352207", "Dimas Hernandez", "3219719928");
		// Step 3. Obtain the actual value.
		Person[] actualValue = testedHashTable.deleteElement("1088352207");
		// Step 4. Compare the expected versus actual values.
		assertArrayEquals(expectedValue, actualValue);
	}

	@Test
	void testUpdateElement() {
		// Step 1. instantiate the tested class using the constructor method.
		HashTable testedHashTable = new HashTable(13);
		Person newPerson = new Person();
		newPerson.setDocument("1088352207");
		newPerson.setName("Dimas Hernandez");
		newPerson.setPhone("3219719928");
		// Step 2. Create the expected value variable
		Person[] expectedValue = new Person[13];
		expectedValue[6] = newPerson;
		testedHashTable.insertElement(newPerson.getDocument(), newPerson.getName(), newPerson.getPhone());
		// Step 3. Obtain the actual value.
		Person[] actualValue = testedHashTable.updateElement("1088352207", "Jhon Rambo", "3333335");
		// Step 4. Compare the expected versus actual values.
		newPerson.Equals(expectedValue, actualValue);
	}

	@Test
	void testSearchElement() {
		// Step 1. instantiate the tested class using the constructor method.
		HashTable testedHashTable = new HashTable(13);
		Person newPerson = new Person();
		newPerson.setDocument("1088352207");
		newPerson.setName("Dimas Hernandez");
		newPerson.setPhone("3219719928");
		// Step 2. Create the expected value variable
		boolean expectedValue = true;
		testedHashTable.insertElement(newPerson.getDocument(), newPerson.getName(), newPerson.getPhone());
		// Step 3. Obtain the actual value.
		boolean actualValue = testedHashTable.searchElement("1088352207");
		// Step 4. Compare the expected versus actual values.
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testListEment() {
		// Step 1. instantiate the tested class using the constructor method.
		HashTable testedHashTable = new HashTable(13);
		Person firtsPerson = new Person();
		firtsPerson.setDocument("1088352207");
		firtsPerson.setName("Dimas Hernandez");
		firtsPerson.setPhone("3219719928");
		// Step 2. Create the expected value variable.
		Person[] expectedValue = new Person[13];
		expectedValue[6] = firtsPerson;
		// Step 3. Obtain the actual value.
		Person[] actualValue = testedHashTable.insertElement(firtsPerson.getDocument(), firtsPerson.getName(),
				firtsPerson.getPhone());

		Person secondPerson = new Person();
		secondPerson.setDocument("2462338");
		secondPerson.setName("Jhon Rambo");
		secondPerson.setPhone("3333335");
		testedHashTable.insertElement(secondPerson.getDocument(), secondPerson.getName(), secondPerson.getPhone());

		Person thirdPerson = new Person();
		thirdPerson.setDocument("25202409");
		thirdPerson.setName("Penelope Rodriguez");
		thirdPerson.setPhone("3456783");
		testedHashTable.insertElement(thirdPerson.getDocument(), thirdPerson.getName(), thirdPerson.getPhone());
		// Step 4. Compare the expected versus actual values.
		testedHashTable.listElement("1088352207", "2462338", "25202409");
		firtsPerson.Equals(expectedValue, actualValue);
	}

}
