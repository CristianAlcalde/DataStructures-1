package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.Hashtable;
import cap1.arrays.Person;

class HashtableTest {

	@Test
	void testHashfunction() {
	
		Hashtable testedHashtable = new Hashtable(5);
		int actualValue = testedHashtable.Hashfunction("1088019819");
		int expectedValue = 9;
		assertEquals(expectedValue,actualValue);
	}
		
	@Test
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		Hashtable testedHashtable = new Hashtable(10);
		Person person = new Person();
		person.setName("Mauricio Garcia");
		person.setDocument("1088019819");
		person.setPhone("3217086618");
		// Step 2. Create the expected value variable
		Person[] expectedValue = new Person[10];
		expectedValue[6] = person;
		// Step 3. Obtain the actual value
		Person[] actualValue = testedHashtable.insertElement(person.getName(), person.getDocument(), person.getPhone());
		// Step 4. Compare the expected versus actual values
		person.Equals(expectedValue, actualValue);
	}
	
	@Test
	void testSearchElement() {
		// Step 1. instantiate the tested class using the constructor method
		Hashtable testedHashtable = new Hashtable(13);
		// Step 2. Create the expected value variable
		String expectedValue = "1088019819";
		// Step 3. Obtain the actual value
		testedHashtable.insertElement("Mauricio Garcia","1088019819", "3222343");
		String actualValue = testedHashtable.searchElement("1088019819");
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testUpdateElement() {
		// Step 1. instantiate the tested class using the constructor method
		Hashtable testedHashtable = new Hashtable(10);
		Person person = new Person();
		person.setName("Mauricio Garcia");
		person.setDocument("1088019819");
		person.setPhone("3217086618");
		// Step 2. Create the expected value variable
		Person[] expectedValue = new Person[10];
		expectedValue[6]= person;
		// Step 3. Obtain the actual value
		testedHashtable.insertElement("Mauricio Garcia","1088019819", "3222343");
		Person[] actualValue = testedHashtable.updateElement(person.getName(),person.getDocument(),person.getPhone());
		// Step 4. Compare the expected versus actual values
		person.Equals(expectedValue, actualValue);
	}
	
	@Test
	void testDeleteElement() {
		// Step 1. instantiate the tested class using the constructor method
		Hashtable testedHashtable = new Hashtable(13);
		Person person = new Person();
		person.setName("Mauricio Garcia");
		person.setDocument("1088019819");
		person.setPhone("3217086618");
		// Step 2. Create the expected value variable
		Person[] expectedValue = new Person[13];
		// Step 3. Obtain the actual value
		testedHashtable.insertElement(person.getName(),person.getDocument(),person.getPhone());
		Person[] actualValue = testedHashtable.deleteElement(person.getDocument());
		// Step 4. Compare the expected versus actual values
		person.Equals(expectedValue, actualValue);
	}

}



	

