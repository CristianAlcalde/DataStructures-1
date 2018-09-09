package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.HashTable;
import cap1.arrays.Person;

class HashTableTest {
	
	@Test
	void testHashFunction() {
		// Step 1. instantiate the tested class using the constructor method.
		HashTable testedHashTable = new HashTable(17);
		// Step 2. Create the expected value variable.
		int expectedValue = 2;
		float chargeFactorExpected = testedHashTable.getChargeFactor();
		// Step 3. Obtain the actual value.
		int actualValue = testedHashTable.hashFunction("1088004926");
		System.out.println("Item index: " + actualValue);
		System.out.println("Charge Factor: " + chargeFactorExpected);
		// Step 4. Compare the expected versus actual values.
		assertEquals(actualValue, expectedValue);
	}
	

	@Test
	public void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHashTable = new HashTable(17);
		Person personInserted = new Person ();
		personInserted.setName("leandro");
		personInserted.setDocument("1088004926");
		personInserted.setTelephone("3114562692");
		// Step 2. Create the expected value variable
		Person[] expectedValue = new Person[17];
		expectedValue[2] = personInserted;
		// Step 3. Obtain the actual value
		Person[]actualValue = testedHashTable.insertElement(personInserted.getName(), personInserted.getDocument(), personInserted.getTelephone());
		// Step 4. Compare the expected versus actual values
		personInserted.Equals(expectedValue, actualValue);
	}

}