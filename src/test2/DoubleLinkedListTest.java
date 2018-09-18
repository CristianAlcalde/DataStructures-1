package test2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import Utils.MP3;
import org.junit.jupiter.api.Test;

import Cap2.list.LinkedList;

class DoubleLinkedListTest {

	@Test
	void testInsertElementInEmptyList() {

		// Creating the data structure
		LinkedList myList = new LinkedList();
		assertEquals(0, myList.getSize());

		// Expected values

		String author = "Aerosmith";
		String file = "jjfdsklf3424432kdkjsflkjsgf##@#";
		String name = "Amazing";
		Integer trackNo = 004;

		myList.add(author, file, name, trackNo);
		assertEquals(1, myList.getSize());

		// Query to database
		MP3 cancion = myList.getHead().getDato();

		// ASSERTING THE INFORMATION
		assertEquals(author, cancion.getAuthor());
		assertEquals(file, cancion.getFile());
		assertEquals(name, cancion.getName());
		assertEquals(trackNo, cancion.getTrackNo());
	}

	/* @Test
	void testSetHead() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTail() {
		fail("Not yet implemented");
	}

	@Test
	void testSetTail() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCursor() {
		fail("Not yet implemented");
	}

	@Test
	void testSetCursor() {
		fail("Not yet implemented");
	}

	@Test
	void testDoubleLinkedListAddHead() {
		fail("Not yet implemented");
	}

	@Test
	void testDoubleLinkedListAddTail() {
		fail("Not yet implemented");
	}

	@Test
	void testObject() {
		fail("Not yet implemented");
	}

	@Test
	void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	void testClone() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	void testWait() {
		fail("Not yet implemented");
	}

	@Test
	void testFinalize() {
		fail("Not yet implemented");
	} */

}
