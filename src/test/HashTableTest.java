package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.HashTable;

class HashTableTest {

	@Test
	void hashFunctionTest() {
		HashTable Hash = new HashTable(5);
		int actualValue = Hash.hashFunction1("1225090354");
		int expectedValue = 4;
		assertEquals(expectedValue, actualValue);
	}

}
