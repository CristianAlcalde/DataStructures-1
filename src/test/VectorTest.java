package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import cap1.arrays.Vector;

class VectorTest {

	@Test
	void test_InsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		Vector testedVector = new Vector(10);
		// Step 2. Create the expected value variable
		int[] expectedValue = new int[10];
		expectedValue[0]=999;
		// Step 3. Obtain the actual value
		int[] actualValue = testedVector.insertElement(999, 0);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void test_SearchElement() {
		// Step 1. instantiate the tested class using the constructor method
		Vector testedVector = new Vector(10);
		// Step 2. Create the expected value variable
		int expectedValue = 999;
		testedVector.insertElement(expectedValue, 9);
		// Step 3. Obtain the actual value
		int actualValue = testedVector.searchElementByPosition(9);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);		
	}
	
	@Test
	void test_UpdateByPosition() {
		// Step 1. instantiate the tested class using the constructor method
		Vector testedVector = new Vector(10);
		// Step 2. Create the initial and the expected value variable
		int initialValue= 1976;
		int expectedValue = 1996;
		// Step 3. Insert any value that will be update. Add it in position 3
		testedVector.insertElement(initialValue, 3);
		// Step 4. Update the position with the expected value
		int updatedValue = testedVector.updateElementByPosition(3, expectedValue);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, updatedValue);		
	}
	
	@Test
	void test_UpdateByElement() {
		// Step 1. instantiate the tested class using the constructor method
		Vector testedVector = new Vector(10);
		// Step 2. Create the initial and the expected value variable
		int initialValue= 1976;
		int expectedValue = 1996;
		// Step 3. Insert any value that will be update. Add it in position 3
		testedVector.insertElement(initialValue, 3);
		// Step 4. Update the position with the expected value
		int updatedValue = testedVector.updateElementByElement(initialValue, expectedValue);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, updatedValue);		
	}

	@Test
	void test_RemoveByPosition() {
		// Step 1. instantiate the tested class using the constructor method
		Vector testedVector = new Vector(10);
		// Step 2. Create the initial and the expected value variable
		int initialValue= 1976;
		int expectedValue = 0;
		// Step 3. Insert any value that will be update. Add it in position 3
		testedVector.insertElement(initialValue, 3);
		// Step 4. Update the position with the expected value
		int removedValue = testedVector.removeElementByPosition(3);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, removedValue);		
	}
	
	@Test
	void test_RemoveByElement() {
		// Step 1. instantiate the tested class using the constructor method
		Vector testedVector = new Vector(10);
		// Step 2. Create the initial and the expected value variable
		int initialValue= 1976;
		int expectedValue = 0;
		// Step 3. Insert any value that will be update. Add it in position 3
		testedVector.insertElement(initialValue, 3);
		// Step 4. Update the position with the expected value
		int removedValue = testedVector.removeElementByElement(initialValue);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, removedValue);		
	}
	
	
}