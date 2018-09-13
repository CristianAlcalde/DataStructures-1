package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap2.lists.DoubleLinkedList;
import utils.Mp3;

class DoubleLinkedListTest {

	@Test
	void testInsertaPorCola() {
		// Creating the data structure
		DoubleLinkedList myList = new DoubleLinkedList();
		

		// Expected values

		String author = "Aerosmith";
		String file = "jjfdsklf3424432kdkjsflkjsgf##@#";
		String name = "Amazing";
		String trackNo = "004";

		myList.insertaPorCola(author, file, name, trackNo);
		
		
		//Query to database
		Mp3 cancion = myList.getHead().getDato();
		
		assertEquals(author, cancion.getAuthor());
		assertEquals(file, cancion.getFile());
		assertEquals(name, cancion.getName());
		assertEquals(trackNo, cancion.getTrackNo());
	}

	
	@Test
	void testInsertaPorCabeza() {
		// Creating the data structure
		DoubleLinkedList myList = new DoubleLinkedList();
		

		// Expected values

		String author = "kraken";
		String file = "sdfaerwessefr##@#";
		String name = "fragil";
		String trackNo = "003";

		
		myList.insertaPorCabeza(author, file, name, trackNo);
		
		
		
		//Query to database
		Mp3 cancion = myList.getHead().getDato();
		
		assertEquals(author, cancion.getAuthor());
		assertEquals(file, cancion.getFile());
		assertEquals(name, cancion.getName());
		assertEquals(trackNo, cancion.getTrackNo());
	}
}
