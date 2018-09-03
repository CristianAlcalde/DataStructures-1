package test;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import cap1.arrays.Persons;
import cap1.arrays.hashTable;

class hashTableTest {

	@SuppressWarnings("deprecation")
	@Test
	void test_InsertPersona() {
		// Instatiate vars that will be set in the Person array
		int doc = 1088023438; String nom = "danielAlarcon"; String phone = "3005376634"; 
		// Make the array that will be contain or filled Persons class
		hashTable testedHash = new hashTable(3);
		//hashTable expectedHash = new hashTable(3);
		Persons expectedPersonas = new Persons();
		expectedPersonas.setDocument(doc);
		expectedPersonas.setName(nom);
		expectedPersonas.setPhone(phone);
		Persons[] expectedValue = testedHash.insertPersona(expectedPersonas);
		// Instatiate actualValue and expectedValueof our filled Person class
		Persons[] actualValue = testedHash.insertPersona(expectedPersonas);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void test_searchPersona() {
		/*We will find a person data using only the index that we manually calculate
		 if gets true, we asure that we (but, really only me), made that hashFunction correctly*/
	// Instatiate vars that will be set in the Person array
			int doc = 1088023438; String nom = "danielAlarcon"; String phone = "3005376634"; 
			// Make the array that will be contain or filled Persons class
			hashTable testedHash = new hashTable(3);
			Persons expectedPersonas = new Persons();
			expectedPersonas.setDocument(doc);
			expectedPersonas.setName(nom);
			expectedPersonas.setPhone(phone);		
			//We set and fill in the array the person's data
			@SuppressWarnings("unused")
			Persons[] expectedValue = testedHash.insertPersona(expectedPersonas);
			//Get the position value with document value
			int ExpectedPosition = testedHash.hashFunction(doc);
			int actualValue = testedHash.searchPersona(ExpectedPosition, doc);
			// Step 4. Compare the expected versus actual values
			assertEquals(ExpectedPosition, actualValue);
	}
	
}