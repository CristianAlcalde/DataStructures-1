package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import cap1.arrays.Vector;
import cap2.lists.DoublyLinkedList;
import utils.DoublyNode;
import utils.Mp3;

public class DoublyLinkedListTest {

	@Test
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		DoublyLinkedList testedList = new DoublyLinkedList();
		// Step 2. Create the expected value variable
		// Se crean las canciones para probrar
		Mp3 ultimo = new Mp3();
		ultimo.setArtista("D");
		ultimo.setCancion("D");
		ultimo.setNombre("D");
		ultimo.setTrack(6);
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

		testedList.insertNode(ultimo);
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
		// Step 4. Compare the expected versus actual values
		assertEquals(true, actualValue);
	}

	@Test
	void testDeleteElement() {
		// Step 1. instantiate the tested class using the constructor method
		DoublyLinkedList testedList = new DoublyLinkedList();
		Mp3 ultimo = new Mp3();
		ultimo.setArtista("D");
		ultimo.setCancion("D");
		ultimo.setNombre("D");
		ultimo.setTrack(6);
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
		Mp3 newNode = new Mp3();
		newNode.setArtista("B");
		newNode.setCancion("B");
		newNode.setNombre("B");
		newNode.setTrack(2);
		testedList.insertNode(ultimo);
		testedList.insertNode(primero);
		testedList.insertNode(segunto);
		testedList.insertNode(newNode);
		String mundo = testedList.listNodes();
		// Step 2. Create the expected value variable
		boolean expectedValue = true;
		// Step 3. Obtain the actual value
		boolean actualValue = testedList.deleteNode(2);
		String hola = testedList.listNodes();
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testListElement() {
		// Step 1. instantiate the tested class using the constructor method
		DoublyLinkedList testedList = new DoublyLinkedList();
		Mp3 ultimo = new Mp3();
		ultimo.setArtista("D");
		ultimo.setCancion("D");
		ultimo.setNombre("D");
		ultimo.setTrack(6);
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
		Mp3 newNode = new Mp3();
		newNode.setArtista("B");
		newNode.setCancion("B");
		newNode.setNombre("B");
		newNode.setTrack(2);
		testedList.insertNode(ultimo);
		testedList.insertNode(primero);
		testedList.insertNode(segunto);
		testedList.insertNode(newNode);
		// Step 2. Create the expected value variable
		String expectedValue = "ABCD";
		// Step 3. Obtain the actual value
		String actualValue = testedList.listNodes();
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

}
