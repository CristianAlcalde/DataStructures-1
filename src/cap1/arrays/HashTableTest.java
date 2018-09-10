package cap1.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HashTableTest {

	@Test
	void FuntionHashTest() {
			// Step 1. instantiate the tested class using the constructor method
			HashTable testedHash = new HashTable(17);
			// Step 2. Create the expected value variable
			int expectedValue = 0;
			// Step 3. Obtain the actual value
			int actualValue = testedHash.FuntionHash("1088346790");
			// Step 4. Compare the expected versus actual values
			assertEquals(expectedValue, actualValue);
	
	}
	
	@Test
	void testInsertPerson() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable FuntionHash = new HashTable(17);
		Person Person = new Person();
		Person.setDocument("1088346790");
		Person.setName("Vladimir");
		Person.setPhone("3165209805");
		// Step 2. Create the expected value variable
		Person[] actualValue = FuntionHash.insertPerson("Vladimir", "1088346790", "3165209805");
		// Step 3. Obtain the actual value
		Person[] expectedValue = FuntionHash.getElements();
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
		
	}
	
	@Test
	void searchElement() {
		// Step 1. instantiate the tested class
		HashTable FuntionHash = new HashTable(17);
		Person Persons = new Person();
		Persons.setDocument("1088346790");
		Persons.setName("Vladimir");
		Persons.setPhone("3165209805");
		Person [] expectedValue = new Person[17]; 
		FuntionHash.insertPerson("Vladimir", "1088346790", "3165209805");
		Person[] actualValue = FuntionHash.searchPerson(Persons.getDocument());
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void TestdeletePerson() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable FuntionHash = new HashTable(17);
		Person[] expectedValue = new Person[17];
		Person[] actualValue = FuntionHash.deletePerson("1088346790");
		assertArrayEquals(expectedValue, actualValue);
	}
	
	
	
}



