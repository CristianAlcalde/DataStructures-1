package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import cap1.arrays.Matrix;


class MatrixTest {

	@Test
	void test_insert_SingleElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(4, 4);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[4][4];
		expectedValue[1][3]=999;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.insert_SingleElement(999, 1, 3);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void test_insert_ManyElements() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(4, 4);
		// Step 2. Create the expected value variable
		int[][] expectedValue = {{1, 10, 20, 30}, {40, 25, 97, 20}, {25, 23, 25, 52}, {25, 36, 1, 20}};
		//expectedValue[1][3]=999;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.insert_ManyElements(expectedValue);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void test_search_Element() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(4, 4);
		// Step 2. Create the expected value variable
		int[][] ExampleMatrix = {{1, 10, 20, 30}, {40, 25, 97, 20}, {25, 23, 25, 52}, {25, 36, 1, 20}};
		// Step 2.1 Insert data to search
		testedMatrix.insert_ManyElements(ExampleMatrix);
		boolean expectedValue = true;
		// Step 3. Obtain the actual value
		boolean actualValue = testedMatrix.search_Element(97);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void test_update_Element() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(4, 4);
		// Step 2. Create the expected value variable
		int[][] ExampleMatrix = {{1, 10, 20, 30}, {40, 25, 97, 20}, {25, 23, 25, 52}, {25, 36, 1, 20}};
		// Step 2.1 Insert data to search
		testedMatrix.insert_ManyElements(ExampleMatrix);
		int[][] expectedValue = {{1, 10, 20, 1996}, {40, 25, 97, 20}, {25, 23, 25, 52}, {25, 36, 1, 20}};
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.update_SingleElement(1996, 0, 3);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void test_update_Elements() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(4, 4);
		// Step 2. Create the expected value variable
		int[][] ExampleMatrix = {{1, 10, 20, 30}, {40, 25, 97, 20}, {25, 23, 25, 52}, {25, 36, 1, 20}};
		// Step 2.1 Insert data to search
		testedMatrix.insert_ManyElements(ExampleMatrix);
		int[][] expectedValue = {{1, 9, 9, 6}, {1, 9, 7, 6}, {1, 9, 5, 9}, {2, 1, 0 ,3}};
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.update_ManyElements(expectedValue);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void test_remove_SingleElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(4, 4);
		// Step 2. Create the expected value variable
		int[][] ExampleMatrix = {{1, 9, 9, 6}, {1, 9, 7, 6}, {1, 9, 5, 9}, {2, 1, 0 ,3}};
		// Step 2.1 Insert data to search
		testedMatrix.insert_ManyElements(ExampleMatrix);
		int[][] expectedValue = {{1, 0, 0, 6}, {1, 0, 7, 6}, {1, 0, 5, 0}, {2, 1, 0 ,3}};
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.remove_SingleElement(9);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void test_remove_Matrix() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(4, 4);
		// Step 2. Create the expected value variable
		int[][] ExampleMatrix = {{1, 9, 9, 6}, {1, 9, 7, 6}, {1, 9, 5, 9}, {2, 1, 0 ,3}};
		// Step 2.1 Insert data to search
		testedMatrix.insert_ManyElements(ExampleMatrix);
		int[][] expectedValue = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.remove_Matrix();
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
}
