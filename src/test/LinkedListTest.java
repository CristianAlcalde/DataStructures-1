package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap2.list.LinkedList;
import utils.Mp3;

class LinkedListTest {

	@Test
	void testInsertElementInEmptyList() {

		// Creating the data structure.
		LinkedList myList = new LinkedList();
		assertEquals(0, myList.getSize());

		// Expected values.

		String author = "Yuri";
		String file = "kljsadkj2kj34lk324";
		String name = "Yo te amo te amo";
		String trackNo = "004";

		myList.add(author, file, name, trackNo);
		assertEquals(1, myList.getSize());
		
		//Query to database.
		Mp3 cancion = myList.getHead().getDato();
		
		assertEquals(author, cancion.getAuthor());
		assertEquals(file, cancion.getFile());
		assertEquals(name, cancion.getName());
		assertEquals(trackNo, cancion.getTrackNo());
		
	}
	
	@Test
	void testInsertElementListWithOnlyHead() {
		
	}

	@Test
	void testInsertElementAtTheEnd() {
		
	}
}
