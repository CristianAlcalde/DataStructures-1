package test;


import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import cap1.arrays.Persons;
import cap1.arrays.hashTable;

class hashTableTest {

	@SuppressWarnings("deprecation")
	@Test
	void test_InsertPersona() {
		// Make the array that will be contain or filled Persons class
		hashTable testedHash = new hashTable(3);
		Persons[] expectedValue = testedHash.insertPersona(1088333702,"danielAlarcon","3005376634");
		// Instatiate actualValue and expectedValueof our filled Person class
		Persons[] actualValue = testedHash.insertPersona(1088333702,"danielAlarcon","3005376634");
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void test_searchPersona() {
		/*We will find a person data using only the index that we manually calculate
		 if gets true, we asure that we (but, really only me), made that hashFunction correctly*/
			hashTable testedHash = new hashTable(3);
			//We set and fill in the array the person's data
			@SuppressWarnings("unused")
			Persons[] expectedValue = testedHash.insertPersona(1088333702,"danielAlarcon","3005376634");
			//Get the position value with document value
			int ExpectedPosition = testedHash.hashFunction(1088333702);
			int actualValue = testedHash.searchPersona(ExpectedPosition, 1088333702);
			// Step 4. Compare the expected versus actual values
			assertEquals(ExpectedPosition, actualValue);
	}
	
	@Test
	void test_printPersonas() {
		/*We will find a person data using only the index that we manually calculate
		 if gets true, we asure that we (but, really only me), made that hashFunction correctly*/
			hashTable testedHash = new hashTable(3);
			//We set and fill in the array the person's data
			testedHash.insertPersona(1088333702,"danielAlarcon","3005376634");
			testedHash.insertPersona(42119715,"janisTabares","3007778922");
			testedHash.insertPersona(1088023438,"juanTabares","3193360932");
			//Get the position value with document value
			boolean Expected = true;
			boolean actual = testedHash.printPersonas();
			//int ExpectedPosition = testedHash.hashFunction(1088333702);
			//int actualValue = testedHash.searchPersona(ExpectedPosition, 1088333702);
			// Step 4. Compare the expected versus actual values
			assertEquals(Expected, actual);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	void test_updatePersona() {
		// Make the array that will be contain or filled Persons class
		hashTable testedHash = new hashTable(3);
		// Actual data with the initial values before will be updated
		Persons[] actualValue = testedHash.insertPersona(1088333702,"danielAlarcon","3005376634");
		// Execute the update
		testedHash.updatePersonas(1088333702,0,"danielKarosky","");
		// Expected data after the update
		Persons[] expectedValue = testedHash.insertPersona(1088333702,"danielKarofsky","30045276634");
		// Step 4. Compare the expected versus actual values
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void test_removePersona() {
		//Make the array that will be contain or filled Persons class
		hashTable testedHash = new hashTable(3);
		//Set data to remove
		testedHash.insertPersona(1088333702, "danielAlarcon", "3005376634");
		boolean expectedValue =  true;
		// Actual data with the expected data before the remove process
		boolean actualValue =  testedHash.deletePerson(1088333702);
		//Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}
	
}