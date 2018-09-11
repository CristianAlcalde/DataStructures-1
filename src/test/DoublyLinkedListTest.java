package test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

import utils.DoublyLinkedNode;

public class DoublyLinkedListTest {

	@Test
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		DoublyLinkedListTest testedVector = new DoublyLinkedListTest();
		// Step 2. Create the expected value variable
		DoublyLinkedNode expectedValue = new DoublyLinkedNode();
		expectedValue.setDato("A");
		expectedValue.setSiguiente(null);
		expectedValue.setAnterior(null);
		// Step 3. Obtain the actual value
		int[] actualValue = testedVector.insertElement(999, 0);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

}
