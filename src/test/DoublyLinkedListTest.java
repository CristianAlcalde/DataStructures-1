package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import cap2.lists.DoublyLinkedList;
import utils.DoublyLinkedNode;
import utils.Mp3;

public class DoublyLinkedListTest {

	@Test
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		DoublyLinkedList tested = new DoublyLinkedList();
		// Step 2. Create the expected value variable
		DoublyLinkedNode expectedValue = new DoublyLinkedNode();
		Mp3 cancion = new Mp3();
		cancion.setArtista("Violeta");
		cancion.setCancion("jasfhndrchkanr hu<ebn");
		cancion.setNombre("Feels");
		cancion.setTrack(5);
		expectedValue.setDato(cancion);
		// Step 3. Obtain the actual value
		DoublyLinkedNode actualValue = tested.insertNodeHead(cancion);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

}
