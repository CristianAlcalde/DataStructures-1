package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cap2.lists.Stack;
import utils.Process;;

public class StackTest {

	@Test
	public void addTest() {
		// Step 1. instantiate the tested class using the constructor method
		Stack testedStack = new Stack();
		// Step 2. Create the expected value variable
		boolean expectedValue = true;
		// Step 3. Obtain the actual value
		Process dato = new Process();
		dato.setId(1);
		dato.setName("Google");
		dato.setUser("Juan");

		Process dato2 = new Process();
		dato2.setId(2);
		dato2.setName("Utorrent");
		dato2.setUser("Jose");

		Process dato3 = new Process();
		dato3.setId(3);
		dato3.setName("Eclipse");
		dato3.setUser("Carlos");

		testedStack.add(dato);
		testedStack.add(dato2);
		testedStack.add(dato3);

		Process newDato = new Process();
		newDato.setId(4);
		newDato.setName("Youtube");
		newDato.setUser("Camilo");
		boolean actualValue = testedStack.add(newDato);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void removeTest() {
		// Step 1. instantiate the tested class using the constructor method
		Stack testedStack = new Stack();
		// Step 2. Create the expected value variable
		boolean expectedValue = true;
		// Step 3. Obtain the actual value
		Process dato = new Process();
		dato.setId(1);
		dato.setName("Google");
		dato.setUser("Juan");

		Process dato2 = new Process();
		dato2.setId(2);
		dato2.setName("Utorrent");
		dato2.setUser("Jose");

		Process dato3 = new Process();
		dato3.setId(3);
		dato3.setName("Eclipse");
		dato3.setUser("Carlos");

		Process newDato = new Process();
		newDato.setId(4);
		newDato.setName("Youtube");
		newDato.setUser("Camilo");

		testedStack.add(dato);
		testedStack.add(dato2);
		testedStack.add(dato3);
		testedStack.add(newDato);

		boolean actualValue = testedStack.remove();
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void listTest() {
		// Step 1. instantiate the tested class using the constructor method
		Stack testedStack = new Stack();
		// Step 2. Create the expected value variable
		String expectedValue = "YoutubeEclipseUtorrentGoogle";
		// Step 3. Obtain the actual value
		Process dato = new Process();
		dato.setId(1);
		dato.setName("Google");
		dato.setUser("Juan");

		Process dato2 = new Process();
		dato2.setId(2);
		dato2.setName("Utorrent");
		dato2.setUser("Jose");

		Process dato3 = new Process();
		dato3.setId(3);
		dato3.setName("Eclipse");
		dato3.setUser("Carlos");

		Process newDato = new Process();
		newDato.setId(4);
		newDato.setName("Youtube");
		newDato.setUser("Camilo");

		testedStack.add(dato);
		testedStack.add(dato2);
		testedStack.add(dato3);
		testedStack.add(newDato);

		String actualValue = testedStack.list();
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

}
