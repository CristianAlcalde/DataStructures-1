package cap1.arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HashTableTest {

	@Test
	void funcionHashTest() {
		HashTable tabla = new HashTable(5);
		int actual = tabla.hashFuncion("12345678");
		int esperado = 3;
		assertEquals(esperado, actual);
	}

	@Test
	void insertarElementoTest() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable tabla = new HashTable(5);
		// Step 2. Create the expected value variable
		String[] expectedValue = new String[5];
		expectedValue[3] = "12345678";
		// Step 3. Obtain the actual value
		String[] actualValue = tabla.insertartElemento("12345678");
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);

	}

	@Test
	void buscarElementoTest() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable tabla = new HashTable(5);
		// Step 2. Create the expected value variable
		int expectedValue = 3;
		// Step 3. Obtain the actual value
		int actualValue = tabla.buscarElemento("12345678");
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void borrarElementoTest() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable tabla = new HashTable(5);
		tabla.insertartElemento("12345678");
		// Step 2. Create the expected value variable
		String[] expectedValue = new String[5];
		// Step 3. Obtain the actual value
		String[] actualValue = tabla.borrarElemento("12345678");
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void actualizarElementoTest() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable tabla = new HashTable(5);
		tabla.insertartElemento("12345678");
		// Step 2. Create the expected value variable
		String[] expectedValue = new String[5];
		expectedValue[3]= "No puede ser";
		// Step 3. Obtain the actual value
		String[] actualValue = tabla.actualizarElemto("12345678", "No puede ser");
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
}
