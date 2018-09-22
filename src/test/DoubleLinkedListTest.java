package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import cap2.lists.DoubleLinkedList;
import utils.Mp3;

class DoubleLinkedListTest {

	@Test
	void testhead() {
		// Creating the data structure
		DoubleLinkedList myList = new DoubleLinkedList();

		// Expected values
		String author = "Asereje";
		String file = "sdfaerwessefr##@#";
		String name = "Las Ketchup";
		String trackNo = "007";

		myList.inserthead(author, file, name, trackNo);

		// Query to database
		Mp3 cancion = myList.getHead().getDato();

		// aSSERTING THE INFORMATION
		assertEquals(author, cancion.getAuthor());
		assertEquals(file, cancion.getFile());
		assertEquals(name, cancion.getName());
		assertEquals(trackNo, cancion.getTrackNo());

	}

	@Test
	void testTail() {
		// Creating the data structure
		DoubleLinkedList myList = new DoubleLinkedList();

		// Expected values
		String author = "kraken";
		String file = "sdfaerwessefr##@#";
		String name = "fragil";
		String trackNo = "003";

		myList.insertail(author, file, name, trackNo);

		// Query to database
		Mp3 cancion = myList.getTail().getDato();

		// aSSERTING THE INFORMATION
		assertEquals(author, cancion.getAuthor());
		assertEquals(file, cancion.getFile());
		assertEquals(name, cancion.getName());
		assertEquals(trackNo, cancion.getTrackNo());

	}

}
