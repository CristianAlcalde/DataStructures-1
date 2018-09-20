package test;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

import cap2.lists.DoubleLinkedList;
import cap2.lists.DoubleLinkedNode;
import utils.Mp3;

class DoubleLinkedListTest {

	@Test
	void testAddOrdered() {
		// Creating the data structure
		
		DoubleLinkedList myList = new DoubleLinkedList();
		assertEquals(0, myList.getSize());


		// Creating data

		String author = "Aerosmith";
		String file = "jjfdsklf3424432kdkteteter";
		String name = "Amazing";
		String trackNo = "1";

		myList.addOrdered(author, file, name, trackNo);
		assertEquals(1, myList.getSize());
		
		String author2 = "Iron Maiden";
		String file2 = "jjfdsklf34244efffsdzsfd32kdkjsflkjs";
		String name2 = "Flight of icarus";
		String trackNo2 = "4";

		myList.addOrdered(author2, file2, name2, trackNo2);
		assertEquals(2, myList.getSize());
		
		String author3 = "Metallica";
		String file3 = "uihjkjluik";
		String name3 = "Ride the lightning";
		String trackNo3 = "2";

		myList.addOrdered(author3, file3, name3, trackNo3);
		assertEquals(3, myList.getSize());
		
		String author4 = "Mago de oz";
		String file4 = "atgsgzhdsfhdf";
		String name4 = "Astaroth";
		String trackNo4 = "3";

		myList.addOrdered(author4, file4, name4, trackNo4);
		assertEquals(4, myList.getSize());

		// Query to database
		Mp3 nodeHead = myList.getHead().getDato(); 					
		Mp3 nodeNextHead = myList.getHead().getNext().getDato();	
		Mp3 nodeTail = myList.getTail().getDato();					

		// Asserting the information
		assertEquals(author, nodeHead.getAuthor());		//Probando la cabeza
		assertEquals(file3, nodeNextHead.getFile());	//Probando despues de la cabeza y antes de la cola
		assertEquals(trackNo2, nodeTail.getTrackNo());	//Probando la cola
	
	}
	
	
	@Test
	void testDeleteByElement() {
		
		// Creating the data structure
		
		DoubleLinkedList myList = new DoubleLinkedList();
		assertEquals(0, myList.getSize());


		//	Inserting data

		String author = "Aerosmith";
		String file = "jjfdsklf3424432kdkteteter";
		String name = "Amazing";
		String trackNo = "1";

		myList.addOrdered(author, file, name, trackNo);
		assertEquals(1, myList.getSize());
		
		String author2 = "Iron Maiden";
		String file2 = "jjfdsklf34244efffsdzsfd32kdkjsflkjs";
		String name2 = "Flight of icarus";
		String trackNo2 = "4";

		myList.addOrdered(author2, file2, name2, trackNo2);
		assertEquals(2, myList.getSize());
		
		boolean expectedValue = true;
		boolean deleteResponse = myList.deleteByElement("Amazing");
		assertEquals(1, myList.getSize());
		assertEquals(expectedValue, deleteResponse);
			
	}
	
	@Test
	void testlistSong() {
		// Creating the data structure
		
		DoubleLinkedList myList = new DoubleLinkedList();
		assertEquals(0, myList.getSize());

		// Inserting data

		String author = "Aerosmith";
		String file = "jjfdsklf3424432kdkteteter";
		String name = "Amazing";
		String trackNo = "1";

		myList.addOrdered(author, file, name, trackNo);
		assertEquals(1, myList.getSize());
		
		String author2 = "Iron Maiden";
		String file2 = "jjfdsklf34244efffsdzsfd32kdkjsflkjs";
		String name2 = "Flight of icarus";
		String trackNo2 = "4";

		myList.addOrdered(author2, file2, name2, trackNo2);
		assertEquals(2, myList.getSize());
		
		String author3 = "Metallica";
		String file3 = "uihjkjluik";
		String name3 = "Ride the lightning";
		String trackNo3 = "2";

		myList.addOrdered(author3, file3, name3, trackNo3);
		assertEquals(3, myList.getSize());
		
		String author4 = "Mago de oz";
		String file4 = "atgsgzhdsfhdf";
		String name4 = "Astaroth";
		String trackNo4 = "3";

		myList.addOrdered(author4, file4, name4, trackNo4);
		assertEquals(4, myList.getSize());

		// Query to database
		String expectedValue = "1. Amazing - 2. Ride the lightning - 3. Astaroth - 4. Flight of icarus - ";
		String listResponse = myList.listSongs();
		assertEquals(expectedValue, listResponse);
	
	}

}
