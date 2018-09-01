package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.HashTable;

class HashTableTest {

	@Test
	void hashFunctionTest() {
		HashTable Hash = new HashTable(5);		
		int actualValue = Hash.hashFunction("1568175974151758");
		int expectedValue = 0;
		assertEquals(expectedValue, actualValue);
	}

}
