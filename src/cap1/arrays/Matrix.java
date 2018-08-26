package cap1.arrays;

public class Matrix {
	//PruebaMatrix
	// Step 1. Create attributes
	private int size1;
	private int size2;
	private int[][] elements;

	// Step 1.1. Create Constructor
	
	public Matrix(int newSize1, int newSize2) {
		System.out.println("Creating vector with row=" + newSize1);
		System.out.println("Creating vector with column=" + newSize2);
		this.size1 = newSize1;
		this.size2 = newSize2;
		this.elements = new int[newSize1][newSize2];
	}

	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
	
	public int getSize1() {
		return size1;
	}

	public void setSize1(int size1) {
		this.size1 = size1;
	}

	public int getSize2() {
		return size2;
	}

	public void setSize2(int size2) {
		this.size2 = size2;
	}

	public int[][] getElements() {
		return elements;
	}

	public void setElements(int[][] elements) {
		this.elements = elements;
	}
	
	// Step 2.2. Create CRUD methods
	
	public int[][] insertElement(int element, int row, int column) {
		this.elements[row][column] = element;
		return this.elements;
	}
}
