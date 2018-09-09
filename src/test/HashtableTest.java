package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.Hashtable;
import cap1.arrays.Person;

class HashtableTest {

	@Test
	void testHashFunction() {		
		// Step 1. instantiate the tested class using the constructor method
		Hashtable testHash = new Hashtable(5,0);
		// Step 2. Create the expected value variable
		int expectedValue = 4;		
		// Step 3. Obtain the actual value
		int actualValue = testHash.hashFunction("12345672");
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
		void testCalculaFactor() {
			// Step 1. instantiate the tested class using the constructor method
			Hashtable testHash2 = new Hashtable(5,0);
			// Step 2. Create the expected value variable
			float expectedValue = 40;		
			// Step 3. Obtain the actual value
			float actualValue = testHash2.CalculaFactorCarga(2) ;
			// Step 4. Compare the expected versus actual values
			assertEquals(expectedValue, actualValue);
		}

	@Test
	void testInsertaPersona() {
		// Step 1. instantiate the tested class using the constructor method
		Hashtable testHash3 = new Hashtable(5,0);
		Person per = new Person();
		per.setDocumento("12345672");
		per.setName("Carlos");
		per.setPhone("345666555");
		// Step 2. Create the expected value variable
		Person[] actualValue = testHash3.insertaPersona(per,"12345672") ;
		
		// Step 3. Obtain the actual value
		Person[] expectedValue = testHash3.getElements();
						
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

	//@Test
	void testBuscarPersona() {
		fail("Not yet implemented");
	}

	//@Test
	void testBorrarPersona() {
		fail("Not yet implemented");
	}

	//@Test
	void testActualizaPersona() {
		fail("Not yet implemented");
	}

}
