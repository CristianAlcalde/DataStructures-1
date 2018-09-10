package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import cap1.arrays.HashTable;
import cap1.arrays.Person;

class HashTableTest {

	
	@Test
	void testHashTable() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHash = new HashTable(5);
		// Step 2. Create the expected value variable
		Person personproof = new Person();
		personproof.setDocument("1088019214");
		personproof.setName("JonathanMafla");
		personproof.setPhone("3217630333");
		int expectedValue = 0;
		// Step 3. Obtain the actual value
		int actualValue = testedHash.ToHash(personproof);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}
		
	
	@Test
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHash = new HashTable(5);
		// Step 2. Create the expected value variable
		Person personproof = new Person();
		personproof.setDocument("1088019214");
		personproof.setName("JonathanMafla");
		personproof.setPhone("3217630333");
		Person[] expectedValue = new Person[5];
		expectedValue[0] = personproof;
		// Step 3. Obtain the actual value
		Person[] actualValue = testedHash.insertElement("1088019214","JonathanMafla","");
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

}
