package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cap2.lists.Queue;
import utils.Person;

public class QueueTest {

	@Test
	public void enQueueTest() {
		// Step 1. instantiate the tested class using the constructor method
		Queue testedQueue = new Queue();
		// Step 2. Create the expected value variable
		boolean expectedValue = true;
		// Step 3. Obtain the actual value
		Person dato = new Person();
		dato.setDocument("1225090354");
		dato.setName("Juan");
		dato.setPhone("322534530");

		Person dato2 = new Person();
		dato2.setDocument("1225090677");
		dato2.setName("Elizabeth");
		dato2.setPhone("322534531");

		Person dato3 = new Person();
		dato3.setDocument("1225090387");
		dato3.setName("Carlos");
		dato3.setPhone("322534532");

		testedQueue.enQueue(dato);
		testedQueue.enQueue(dato2);
		testedQueue.enQueue(dato3);

		Person newDato = new Person();
		newDato.setDocument("1225090358");
		newDato.setName("Jose");
		newDato.setPhone("322534530");
		boolean actualValue = testedQueue.enQueue(newDato);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

}
