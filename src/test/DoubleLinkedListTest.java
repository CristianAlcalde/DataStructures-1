package test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import cap2.lists.DoubleLinkedList;

import utils.Mp3;

class DoubleLinkedListTest {

	@Test
	void testAddOrdered() {
		// Creating the data structure
		
		DoubleLinkedList myList = new DoubleLinkedList();
		assertEquals(0, myList.getSize());


		// Expected values

		String author = "Aerosmith";
		String file = "jjfdsklf3424432kdkjsflkjsgf##@#";
		String name = "Amazing";
		String trackNo = "1";

		myList.addOrdered(author, file, name, trackNo);
		assertEquals(1, myList.getSize());
		
		String author2 = "Iron Maiden";
		String file2 = "jjfdsklf34244efffsdzsfd32kdkjsflkjsgf##@#";
		String name2 = "Flight of icarus";
		String trackNo2 = "4";

		myList.addOrdered(author2, file2, name2, trackNo2);
		assertEquals(2, myList.getSize());
		
		String author3 = "Metallica";
		String file3 = "jjfdsklf34244efffsdzsfd32kdkjsflkjsgf##@#";
		String name3 = "Ride the lightning";
		String trackNo3 = "2";

		myList.addOrdered(author3, file3, name3, trackNo3);
		assertEquals(3, myList.getSize());
		
		String author4 = "Mago de oz";
		String file4 = "jjfdskl222fd32kdkjsflkjsgf##@#";
		String name4 = "Astaroth";
		String trackNo4 = "3";

		myList.addOrdered(author4, file4, name4, trackNo4);
		assertEquals(4, myList.getSize());

		// Query to database
		Mp3 cancion = myList.getHead().getDato();

		// Asserting the information
		assertEquals(author, cancion.getAuthor());
		assertEquals(file, cancion.getFile());
		assertEquals(name, cancion.getName());
		assertEquals(trackNo, cancion.getTrackNo());
	
	}

}
