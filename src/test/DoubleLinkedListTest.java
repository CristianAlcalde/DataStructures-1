package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap2.lists.DoubleLinkedList;
import utils.Mp3;

class DoubleLinkedListTest {
	
	@Test
	void testaddSort() {
		// Creating the data structure
		
		DoubleLinkedList myList = new DoubleLinkedList();
		assertEquals(0, myList.getSize());


		// Expected values

		String author = "Franco de Vita";
		String file = "hkfjhdkjfh";
		String name = "si tu la ves";
		String trackNo = "9";

		myList.addSort(author, file, name, trackNo);
		assertEquals(1, myList.getSize());
		
		String author2 = "Ricardi ";
		String file2 = "gjhgjg##@#";
		String name2 = "el amanecer";
		String trackNo2 = "6";

		myList.addSort(author2, file2, name2, trackNo2);
		assertEquals(2, myList.getSize());
		
		String author3 = "Juan Fernando";
		String file3 = "uyggj##@#";
		String name3 = "bajo la luna";
		String trackNo3 = "4";

		myList.addSort(author3, file3, name3, trackNo3);
		assertEquals(3, myList.getSize());
		
		String author4 = "j Balvin";
		String file4 = "hahgjgj##@#";
		String name4 = "Hasta el atardecer";
		String trackNo4 = "5";

		myList.addSort(author4, file4, name4, trackNo4);
		assertEquals(4, myList.getSize());

		// Query to database
		Mp3 cancion = myList.getTail().getDato();

		// aSSERTING THE INFORMATION
/*		assertEquals(author3, cancion.getAuthor());
		assertEquals(file3, cancion.getFile());
		assertEquals(name3, cancion.getName());
	*/	assertEquals(trackNo4, myList.getHead().getNext().getDato().getTrackNo());
	
	}


}
