package test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

import cap2.lists.DoublyLinkedList;
import utils.DoublyLinkedNode;

public class DoublyLinkedListTest {

	@Test
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		DoublyLinkedList tested = new DoublyLinkedList();
		// Step 2. Create the expected value variable
		DoublyLinkedNode expectedValue = new DoublyLinkedNode();
		expectedValue.setDato("A");
		expectedValue.setSiguiente(null);
		expectedValue.setAnterior(null);
		// Step 3. Obtain the actual value
		int[] actualValue = tested.insertNodeHead("A");
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

}
