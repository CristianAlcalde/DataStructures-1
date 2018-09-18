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
		DoublyLinkedList testedList = new DoublyLinkedList();
		// Step 2. Create the expected value variable
		// Se crean las canciones para probrar
		Mp3 primero = new Mp3();
		primero.setArtista("A");
		primero.setCancion("A");
		primero.setNombre("A");
		primero.setTrack(1);
		Mp3 segunto = new Mp3();
		segunto.setArtista("C");
		segunto.setCancion("C");
		segunto.setNombre("C");
		segunto.setTrack(4);

		testedList.insertNode(primero);
		testedList.insertNode(segunto);

		// Se inserta la cancion
		Mp3 newNode = new Mp3();
		newNode.setArtista("B");
		newNode.setCancion("B");
		newNode.setNombre("B");
		newNode.setTrack(2);

		// Step 3. Obtain the actual value
		boolean actualValue = testedList.insertNode(newNode);
		testedList.listElement();
		// Step 4. Compare the expected versus actual values
		assertEquals(true, actualValue);
	}

}
