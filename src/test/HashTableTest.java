package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import utils.Person;
import cap1.arrays.HashTable;

class HashTableTest {
	
	
	@Test
	void insertELement() {
		
		HashTable testedHashTable = new HashTable(13);
		Person newperson = new Person();
		newperson.setDocument("1094949423");
		newperson.setName("Juan David");
		newperson.setPhone("3175756046");
		Person expectedValue[] = new Person[13];
		expectedValue[12]= newperson;
		Person[] actualValue = testedHashTable.insertElement("1094949423", "Juan David", "3175756046");
		actualValue.equals(expectedValue);
	}
	
	@Test
	void testHashFunction() {
		HashTable testedHashTable = new HashTable(13);
		int expectedValue = 10;
		int actualValue = testedHashTable.hashFunction("1094949423");
		assertEquals(actualValue, expectedValue);
	}
	

	@Test
	void deleteElement() {
		HashTable testedHashTable = new HashTable(13);
		Person[] expectedValue = new Person[13];
		Person[] actualValue = testedHashTable.deleteElement("1094949423");
		assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void updateElement() {
		HashTable testedHashTable = new HashTable(13);
		Person newperson = new Person();
		newperson.setDocument("1094949423");
		newperson.setName("David");
		newperson.setPhone("311154796");
		Person[] expectedValue = new Person[13];
		expectedValue[10] = newperson;
		testedHashTable.insertElement("1094949423", "Juan David", "3175756046");
		Person[] actualValue = testedHashTable.updateElement("1094949423", "David", "311154796");
		actualValue.equals(expectedValue);
	}
}