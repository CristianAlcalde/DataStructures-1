package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap2.lists.DoubleLinkedList;
import cap2.lists.LinkedList;
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
	
	void testInsertaOrdenado() {
	// Creating the data structure
			DoubleLinkedList myList = new DoubleLinkedList();

			// Expected values

			String author = "Aerosmith";
			String file = "jjfdsklf3424432kdkjsflkjsgf##@#";
			String name = "Amazing";
			String trackNo = "4";

			myList.insertarOrdenado(author, file, name, trackNo);
//			assertEquals(1, myList.getSize());
			
			String author2 = "Iron Maiden";
			String file2 = "jjfdsklf34244efffsdzsfd32kdkjsflkjsgf##@#";
			String name2 = "Flight of icarus";
			String trackNo2 = "1";

			myList.insertarOrdenado(author2, file2, name2, trackNo2);
			//assertEquals(2, myList.getSize());
			
			String author3 = "Metallica";
			String file3 = "jjfdsklf34244efffsdzsfd32kdkjsflkjsgf##@#";
			String name3 = "Ride the lightning";
			String trackNo3 = "2";

			myList.insertarOrdenado(author3, file3, name3, trackNo3);
			//assertEquals(3, myList.getSize());
			
			Mp3 searchResponse = myList.getAt(2);
			assertNotNull(searchResponse);
			assertEquals(author3, searchResponse.getAuthor());
			assertEquals(file3, searchResponse.getFile());
			assertEquals(name3, searchResponse.getName());
			assertEquals(trackNo3, searchResponse.getTrackNo());
	}
}
