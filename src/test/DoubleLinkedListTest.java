package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap2.arrays.DoubleLinkedList;
import utils.Mp3;

class DoubleLinkedListTest {

	@Test
	void testInsertaPorCabeza() {
		// Creating the data structure
		DoubleLinkedList myList = new DoubleLinkedList();
		

		// Expected values

		String author = "Aerosmith";
		String file = "jjfdsklf3424432kdkjsflkjsgf##@#";
		String name = "Amazing";
		String trackNo = "004";

		myList.insertaPorCabeza(author, file, name, trackNo);
		myList.insertaPorCabeza("queen","sdfaerwer", "bohemia", "001");
		myList.insertaPorCabeza("kraken","sdfaerwessefr", "fragil", "003");
		
		
		//Query to database
		Mp3 cancion = myList.getHead().getDato();
		
		assertEquals(author, cancion.getAuthor());
		assertEquals(file, cancion.getFile());
		assertEquals(name, cancion.getName());
		assertEquals(trackNo, cancion.getTrackNo());
	}

}
