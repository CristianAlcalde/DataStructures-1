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
	
	@Test
	void testDeQueue() {
		
		Queue persons = new Queue();
		assertEquals(0, persons.getSize());
		
		String document = "1087984628";
		String name = "Alejo";
		String phone = "3105062444";
		
		persons.enQueue(document, name, phone);
		assertEquals(1, persons.getSize());
		
		String document2 = "2088007641";
		String name2 = "Luis";
		String phone2 = "3125874130";
		
		persons.enQueue(document2, name2, phone2);
		assertEquals(2, persons.getSize());
				
		String document3 = "30789423";
		String name3 = "Hellen";
		String phone3 = "3105062444";
		
		persons.enQueue(document3, name3, phone3);
		assertEquals(3, persons.getSize());
		
		// Atendiendo personas
		persons.deQueue();					// Usando primera vez vez deQueue.
		assertEquals(2, persons.getSize());
		
		persons.deQueue();					// Usando segunda vez deQueue.
		assertEquals(1, persons.getSize());
				
		// Asserting the information
		assertEquals(document3, persons.getFirst().getPerson().getDocument()); // Probando el nuevo first despues de
																			   // usar dos veces deQueue.
		
	}

}
