package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import cap1.arrays.HashTable;
import cap1.arrays.Person;

class HashTableTest {
	
	@Test
	void testHashFunction() {
		HashTable testedHashTable = new HashTable(15);
		int expectedValue = 10;
		int actualValue = testedHashTable.hashFunction("1088353219");
		assertEquals(actualValue, expectedValue);
	}

	@Test
	void insertELement() {
		
		HashTable testedHashTable = new HashTable(15);
		Person newperson = new Person();
		newperson.setDocument("1088353219");
		newperson.setName("Cristian Ospina");
		newperson.setPhone("3015832071");
		Person expectedValue[] = new Person[15];
		expectedValue[12] = newperson;
		Person[] actualValue = testedHashTable.insertElement("1088353219", "Cristian Ospina", "3015832071");
		actualValue.equals(expectedValue);
	}
	
	@Test
	void deleteElement() {
		HashTable testedHashTable = new HashTable(15);
		Person[] expectedValue = new Person[15];
		Person[] actualValue = testedHashTable.deleteElement("1088353219");
		assertArrayEquals(expectedValue, actualValue);
	}


	@Test
	void updateElement() {
		HashTable testedHashTable = new HashTable(15);
		Person newperson = new Person();
		newperson.setDocument("1088353219");
		newperson.setName("Cristian");
		newperson.setPhone("3015832071");
		Person[] expectedValue = new Person[15];
		expectedValue[10] = newperson;
		testedHashTable.insertElement("1088353219", "Cristian Ospina", "3015832071");
		Person[] actualValue = testedHashTable.updateElement("1088353219", "Cristian", "3103891472");
		actualValue.equals(expectedValue);
	}

	
}
