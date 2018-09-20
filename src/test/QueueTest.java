package test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import cap2.lists.Queue;


class QueueTest {

	@Test
	void testEnQueue() {
		
		Queue persons = new Queue();
		assertEquals(0, persons.getSize());
		
		String document = "1087984628";
		String name = "Alejo";
		String phone = "3105062444";
		
		persons.enQueue(document, name, phone);
		assertEquals(1, persons.getSize());
		
		// Asserting the information
		assertEquals(document, persons.getFirst().getPerson().getDocument());
		assertEquals(name, persons.getFirst().getPerson().getName());
		assertEquals(phone, persons.getFirst().getPerson().getPhone());
	}

}
