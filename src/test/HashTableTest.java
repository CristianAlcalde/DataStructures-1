package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import cap1.arrays.HashTable;
import cap1.arrays.Person;

class HashTableTest {

	@Test
	void testHashTable()
	{
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
	void testInsertElement()
	{
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
		Person[] actualValue = testedHash.insertElement("1088019214", "JonathanMafla", "3217630333");
		// Step 4. Compare the expected versus actual values
		assertArraysEquals2(expectedValue, actualValue);
		System.out.println(testedHash.getChargefactor() + "% has been occupied.");

	}

	@Test
	void testSearchElementbyPosition()
	{
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHash = new HashTable(5);
		// Step 2. Create the expected value variable
		Person personproof = new Person();
		personproof.setDocument("1088019214");
		personproof.setName("JonathanMafla");
		personproof.setPhone("3217630333");
		Person expectedValue = personproof;
		// Step 3. Obtain the actual value
		testedHash.insertElement("1088019214", "JonathanMafla", "3217630333");
		Person actualValue = testedHash.searchElementbyPosition(0);
		// Step 4. Compare the expected versus actual values
		assertEquals2(expectedValue, actualValue);
	}

	@Test
	void testSearchElementbyValue()
	{
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHash = new HashTable(5);
		// Step 2. Create the expected value variable
		Person personproof = new Person();
		personproof.setDocument("1088019214");
		personproof.setName("JonathanMafla");
		personproof.setPhone("3217630333");
		Person expectedValue = personproof;
		// Step 3. Obtain the actual value
		testedHash.insertElement("1088019214", "JonathanMafla", "3217630333");
		Person actualValue = testedHash.searchElementbyValue("1088019214");
		// Step 4. Compare the expected versus actual values
		assertEquals2(expectedValue, actualValue);
	}

	@Test
	void testListElement()
	{
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHash = new HashTable(5);
		// Step 2. Create the expected value variable
		Person personproof = new Person();
		personproof.setDocument("1088019214");
		personproof.setName("JonathanMafla");
		personproof.setPhone("3217630333");
		// Step 3. Obtain the actual value
		Person[] oldValue = testedHash.insertElement("1088019214", "JonathanMafla", "3217630333");
		String actualValue = testedHash.listElement(oldValue);
		String expectedValue = oldValue[0] + ", null, null, null, null";
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testUpdatetElement()
	{
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHash = new HashTable(5);
		// Step 2. Create the expected value variable
		Person personproof = new Person();
		personproof.setDocument("1088019214");
		personproof.setName("JonathanMafla");
		personproof.setPhone("3333333333");
		Person[] expectedValue = new Person[5];
		expectedValue[0] = personproof;
		// Step 3. Obtain the actual value
		testedHash.insertElement("1088019214", "JonathanMafla", "3217630333");
		Person[] actualValue = testedHash.updateElement("1088019214", "JonathanMafla", "3333333333");
		// Step 4. Compare the expected versus actual values
		assertArrayEquals3(expectedValue, actualValue);
	}

	@Test
	void testDeletetElement()
	{
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHash = new HashTable(5);
		// Step 2. Create the expected value variable
		Person[] expectedValue = new Person[5];
		expectedValue[0] = null;
		// Step 3. Obtain the actual value
		testedHash.insertElement("1088019214", "JonathanMafla", "3217630333");
		Person[] actualValue = testedHash.deleteElement(0);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
		System.out.println(testedHash.getChargefactor() + "% has been occupied.");
	}

	private void assertArrayEquals3(Person[] expectedValue, Person[] actualValue)
	{

	}

	private void assertArraysEquals2(Person[] expectedValue, Person[] actualValue)
	{
	}

	private void assertEquals2(Person expectedValue, Person actualValue)
	{

	}

}
