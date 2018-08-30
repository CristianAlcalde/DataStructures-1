package cap1.arrays;



import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MatrixTest {

	@Test
	void InsertTest() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix matriz = new Matrix(5, 5);
		// Step 2. Create the expected value variable
		int valorEsperado =89;
		// Step 3. Obtain the actual value
		int valorActual = matriz.insertarElemento(0, 0, 89);
		// Step 4. Compare the expected versus actual values
		assertEquals(valorEsperado, valorActual);
	}
	
		@Test
		void testUpdateElement() {
			// Step 1. instantiate the tested class using the constructor method
			Matrix testedMatrix = new Matrix(3, 4);
			testedMatrix.insertarElemento(0, 0, 999);
			// Step 2. Create the expected value variable		
			int[][] expectedValue = new int[3][4];
			expectedValue[0][0]=900;
			// Step 3. Obtain the actual value
			int[][] actualValue = testedMatrix.updateElement(0, 0, 900);
			// Step 4. Compare the expected versus actual values
			assertArrayEquals(expectedValue, actualValue);
		}
		
		@Test
		void testDeleteElement() {
			// Step 1. instantiate the tested class using the constructor method
			Matrix testedMatrix = new Matrix(3, 4);
			testedMatrix.insertarElemento(0, 0, 999);
			// Step 2. Create the expected value variable		
			int[][] expectedValue = new int[3][4];
			expectedValue[0][0]=0;
			// Step 3. Obtain the actual value
			int[][] actualValue = testedMatrix.deleteElement(0, 0);
			// Step 4. Compare the expected versus actual values
			assertArrayEquals(expectedValue, actualValue);
		}
		
		@Test
		void testSerchElement() {
			// Step 1. instantiate the tested class using the constructor method
			Matrix testedMatrix = new Matrix(3, 4);
			testedMatrix.insertarElemento(1, 3, 999);
			// Step 2. Create the expected value variable
			int[] expectedValue = new int[2];
			expectedValue[0] = 1;
			expectedValue[1] = 3;
			// Step 3. Obtain the actual value			
			int[] actualValue = testedMatrix.serchElement(999);
			// Step 4. Compare the expected versus actual values
			assertArrayEquals(expectedValue, actualValue);			
		}
}