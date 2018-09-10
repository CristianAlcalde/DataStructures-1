package test;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

import cap1.arrays.Hashtable;
import cap1.arrays.Person;


class Hashtabletest {
	
	@Test
	public void testHashfunction() {
		Hashtable testedHashtable = new Hashtable(10);
		Person Person = new Person();
		Person.setDocument("1088019819");
		Person[] expectedValue = new Person[10];
		int actualValue = testedHashtable.Hashfunction(Person.getDocument());
		assertEquals(expectedValue, actualValue);
	}
	 
	@Test
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		Hashtable testedHashtable = new Hashtable(10);
		Person Person = new Person();
		Person.setName("Mauricio Garcia");
		Person.setDocument("1088019819");
		Person.setPhone("3217086618");
		// Step 2. Create the expected value variable
		Person[] expectedValue = new Person[10];
		expectedValue[4] = Person;
		// Step 3. Obtain the actual value
		Person[] actualValue = testedHashtable.insertElement(Person.getName(), Person.getDocument(), Person.getPhone());
		// Step 4. Compare the expected versus actual values
		Person.equals(expectedValue, actualValue);
	}

	@Test
	void testSearchElement() {
		// Step 1. instantiate the tested class using the constructor method
		Hashtable testedHashtable = new Hashtable(10);
		Person Person = new Person();
		Person.setName("Mauricio Garcia");
		Person.setDocument("1088019819");
		Person.setPhone("3217086618");
		// Step 2. Create the expected value variable
		Person[] expectedValue = new Person[10];
		testedHashtable.insertElement(Person.getName(), Person.getDocument(), Person.getPhone());
		// Step 3. Obtain the actual value
		Person[] actualValue = testedHashtable.searchElement(Person.getDocument());
		// Step 4. Compare the expected versus actual values
		Person.equals(expectedValue, actualValue);
	}

	@Test
	void testUpdateElement() {
		// Step 1. instantiate the tested class using the constructor method
		Hashtable testedHashtable = new Hashtable(10);
		Person Person = new Person();
		Person.setName("Alexis Sanchez");
		Person.setDocument("18019813");
		Person.setPhone("3345667");
		// Step 2. Create the expected value variable
		Person[] expectedValue = new Person[10];
		expectedValue[0] = Person;
		// Step 3. Obtain the actual value
		Person[] actualValue = testedHashtable.updateElement(Person.getName(), Person.getDocument(), Person.getPhone());
		// Step 4. Compare the expected versus actual values
		Person.equals(expectedValue, actualValue);
	}

	@Test
	void testDeleteElement() {
		// Step 1. instantiate the tested class using the constructor method
		Hashtable testedHashtable = new Hashtable(10);
		Person Person = new Person();
		Person.setName("Mauricio Garcia");
		Person.setDocument("1088019819");
		Person.setPhone("3217086618");
		// Step 2. Create the expected value variable
		int expectedValue = 8;
		testedHashtable.insertElement(Person.getName(),Person.getDocument(),Person.getDocument());
		// Step 3. Obtain the actual value
		Person[] actualValue = testedHashtable.deleteElement(Person.getDocument());
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}
}