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

	@Test
	void testBuscarPersona() {
		// Step 1. instantiate the tested class using the constructor method
		Hashtable testHash4 = new Hashtable(5,0);
		
		// Step 2. Create the expected value variable
		int expectedValue = 4 ;
		
		// Step 3. Obtain the actual value
		 int actualValue = testHash4.buscarPersona("12345672");
						
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testBorrarPersona() {
		// Step 1. instantiate the tested class using the constructor method
		Hashtable testHash5 = new Hashtable(5,0);
		
		// Step 2. Create the expected value variable
		Person[] actualValue = testHash5.borrarPersona("12345672") ;
		
		// Step 3. Obtain the actual value
		Person[] expectedValue = testHash5.getElements();
						
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testActualizaPersona() {
		// Step 1. instantiate the tested class using the constructor method
		Hashtable testHash6 = new Hashtable(5,0);
		Person per1 = new Person();
		per1.setDocumento("81313214");
		per1.setName("Carlos");
		per1.setPhone("81313214");
		
		Person per2 = new Person();
		per2.setDocumento("81313214");
		per2.setName("Yeymi");
		per2.setPhone("3116547654");
		
		testHash6.insertaPersona(per1, "81313214");
		// Step 2. Create the expected value variable
		Person[] actualValue = testHash6.actualizaPersona(per2,"81313214") ;
		
		// Step 3. Obtain the actual value
		Person[] expectedValue = testHash6.getElements();
						
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

}
