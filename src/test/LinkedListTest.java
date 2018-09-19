package test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

import cap2.lists.LinkedList;
import utils.Mp3;

class LinkedListTest {

	@Test
	void testInsertElementInEmptyList()
	{

		// Creating the data structure
		LinkedList myList = new LinkedList();
		assertEquals(0, myList.getSize());

		// Expected values

		String author = "Aerosmith";
		String file = "jjfdsklf3424432kdkjsflkjsgf##@#";
		String name = "Amazing";
		String trackNo = "004";

		myList.add(author, file, name, trackNo);
		assertEquals(1, myList.getSize());

		// Query to database
		Mp3 cancion = myList.getHead().getDato();

		// Asserting the Information
		assertEquals(author, cancion.getAuthor());
		assertEquals(file, cancion.getFile());
		assertEquals(name, cancion.getName());
		assertEquals(trackNo, cancion.getTrackNo());
	}

	@Test
	void testSearchElementInEmptyList()
	{

		// Creating the data structure
		LinkedList myList = new LinkedList();
		assertEquals(0, myList.getSize());

		// Expected values

		String author = "Aerosmith";
		String file = "jjfdsklf3424432kdkjsflkjsgf##@#";
		String name = "Amazing";
		String trackNo = "004";

		myList.add(author, file, name, trackNo);
		assertEquals(1, myList.getSize());

		// Query to database
		Mp3 cancion = myList.getHead().getDato();

		// aSSERTING THE INFORMATION
		assertEquals(author, cancion.getAuthor());
		assertEquals(file, cancion.getFile());
		assertEquals(name, cancion.getName());
		assertEquals(trackNo, cancion.getTrackNo());

		Mp3 searchResponse = myList.searchByName("Amazing");
		assertNotNull(searchResponse);
		assertEquals(author, searchResponse.getAuthor());
		assertEquals(file, searchResponse.getFile());
		assertEquals(name, searchResponse.getName());
		assertEquals(trackNo, searchResponse.getTrackNo());
	}

	@Test
	void testSearchByPosition()
	{

		// Creating the data structure
		LinkedList myList = new LinkedList();
		assertEquals(0, myList.getSize());

		// Expected values

		String author = "Aerosmith";
		String file = "jjfdsklf3424432kdkjsflkjsgf##@#";
		String name = "Amazing";
		String trackNo = "004";

		myList.add(author, file, name, trackNo);
		assertEquals(1, myList.getSize());

		String author2 = "Iron Maiden";
		String file2 = "jjfdsklf34244efffsdzsfd32kdkjsflkjsgf##@#";
		String name2 = "Flight of icarus";
		String trackNo2 = "001";

		myList.add(author2, file2, name2, trackNo2);
		assertEquals(2, myList.getSize());

		String author3 = "Metallica";
		String file3 = "jjfdsklf34244efffsdzsfd32kdkjsflkjsgf##@#";
		String name3 = "Ride the lightning";
		String trackNo3 = "002";

		myList.add(author3, file3, name3, trackNo3);
		assertEquals(3, myList.getSize());

		Mp3 searchResponse = myList.getAt(2);
		assertNotNull(searchResponse);
		assertEquals(author3, searchResponse.getAuthor());
		assertEquals(file3, searchResponse.getFile());
		assertEquals(name3, searchResponse.getName());
		assertEquals(trackNo3, searchResponse.getTrackNo());
	}

	@Test
	void testListElements()
	{

		// Creating the data structure
		LinkedList myList = new LinkedList();
		assertEquals(0, myList.getSize());

		// Expected values

		String author = "Aerosmith";
		String file = "file01";
		String name = "Amazing";
		String trackNo = "004";

		myList.add(author, file, name, trackNo);
		assertEquals(1, myList.getSize());

		String author2 = "Iron Maiden";
		String file2 = "file02";
		String name2 = "Flight of icarus";
		String trackNo2 = "001";

		myList.add(author2, file2, name2, trackNo2);
		assertEquals(2, myList.getSize());

		String author3 = "Metallica";
		String file3 = "file03";
		String name3 = "Ride the lightning";
		String trackNo3 = "002";

		myList.add(author3, file3, name3, trackNo3);
		assertEquals(3, myList.getSize());

		String list = myList.listElements();

		String expl = "N° 1- Aerosmith, file01, Amazing, 004\n"
				+ "N° 2- Iron Maiden, file02, Flight of icarus, 001\n"
				+ "N° 3- Metallica, file03, Ride the lightning, 002\n";

		System.out.println("Datos en la lista:\n");
		System.out.println(list);

		assertEquals(expl, list);
	}

	@Test
	void testDeletebyName()
	{

		// Creating the data structure
		LinkedList myList = new LinkedList();
		assertEquals(0, myList.getSize());

		// Expected values

		String author = "Aerosmith";
		String file = "file01";
		String name = "Amazing";
		String trackNo = "004";

		myList.add(author, file, name, trackNo);
		assertEquals(1, myList.getSize());

		String author2 = "Iron Maiden";
		String file2 = "file02";
		String name2 = "Flight of icarus";
		String trackNo2 = "001";

		myList.add(author2, file2, name2, trackNo2);
		assertEquals(2, myList.getSize());

		String author3 = "Metallica";
		String file3 = "file03";
		String name3 = "Ride the lightning";
		String trackNo3 = "002";

		myList.add(author3, file3, name3, trackNo3);
		assertEquals(3, myList.getSize());

		myList.deletebyName("Flight of icarus");
		assertEquals(2, myList.getSize());

		Mp3 nextSong = myList.getAt(1);

		assertEquals(author3, nextSong.getAuthor());
		assertEquals(file3, nextSong.getFile());
		assertEquals(name3, nextSong.getName());
		assertEquals(trackNo3, nextSong.getTrackNo());
	}

}
