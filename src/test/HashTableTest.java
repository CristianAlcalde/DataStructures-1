package test;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.api.Test;
import cap1.arrays.HashTable;
import cap1.arrays.Person;

class HashTableTest {

	@Test
	void testhashFunction() {
		HashTable testedHashTable =new HashTable(13);
		String Person1="1032363651";
		Integer expectedValue= 7;
		Integer actualValue=testedHashTable.hashFunction(Person1);
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testchargeFactor() {
		HashTable testedHashTable =new HashTable(8);
		float expectedValue= 0.5f;
		float actualValue=testedHashTable.chargeFactor(4);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void testinsertElement() {
		HashTable testedHashTable =new HashTable(13);
		Person[] expectedValue = new Person[13];
		Person Person1 = new Person("1032363651","PEDRO","194565784");
		expectedValue[7]=Person1;
		Person[] actualValue =testedHashTable.insertElement(Person1, Person1.getDocument());
		assertArrayEquals(expectedValue, actualValue);
	}
	@Test
	void testsearchElementByValue() {
		HashTable testedHashTable = new HashTable(13); 
		Person[] expectedValue = new Person[13];	
		Person Person1 = new Person("1032363651", "PEDRO", "194565784");
		expectedValue[7] = Person1;
		testedHashTable.insertElement(Person1, Person1.getDocument());
		Person[] actualValue = testedHashTable.searchElementByValue(Person1.getDocument());	
		assertArrayEquals(expectedValue, actualValue);
	}
	@Test
	void testupdateElement() {
		
		HashTable testedHashTable = new HashTable(13);
		Person[] expectedValue = new Person[13];			
		Person Person1 = new Person("1032363651", "PEDRO", "194565784");
		Person Person2 = new Person("1054922771", "JUAN", "194565784");
		expectedValue[7] = Person2;
		testedHashTable.insertElement(Person1, Person1.getDocument());
		Person[] actualValue = testedHashTable.updateElement(Person2, Person2.getDocument());		
		assertArrayEquals(expectedValue, actualValue);
	}
	@Test
		void testDeleteElements() {
		HashTable testedHashTable = new HashTable(13); 
		Person[] expectedValue = new Person[13];			
		Person Person1 = new Person("1032363651", "PEDRO", "194565784");
		expectedValue[7] = null;
		testedHashTable.insertElement(Person1, Person1.getDocument());
		Person[] actualValue = testedHashTable.deleteElements(Person1.getDocument());		
		assertArrayEquals(expectedValue, actualValue);
	}



}