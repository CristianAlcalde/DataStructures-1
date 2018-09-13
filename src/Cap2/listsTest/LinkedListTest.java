package Cap2.listsTest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import Cap2.lists.LinkedList;
import cap1.arrays.Vector;

class LinkedListTest {

	@Test
	//insertar en una lista
	void testInsertElementInEmpetyList() {
	//inicializar
		LinkedList myList = new LinkedList();
		assertEquals(0,myList.getSize());
		//valor esperado
		
		String author ="Toma Tu Lugar Band";
		String file ="Argentina";
		String name = "Toma Tu Lugar";
		String trackNo = "002";		
		
		myList.add(author, file, name, trackNo);		
		assertEquals(1,myList.getSize());
		
		assertEquals(author,myList.getHead().getData().getAuthor());
		assertEquals(file,myList.getHead().getData().getFile());
		assertEquals(name,myList.getHead().getData().getName());
		assertEquals(trackNo,myList.getHead().getData().getTrackNo());
		
	}
	
	@Test
	//insertar elemento en una lista solo or la cabeza
	void testInsertElementInListWithOnlyHead() {	
	}
	
	@Test
	//insertar elemento 
	void testInsertElementAtTheEnd() {	
	}

}
