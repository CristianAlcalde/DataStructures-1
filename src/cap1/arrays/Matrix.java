package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	private int sizerow;
	private int sizecolumn;
	private int[][] elements;

	// Step 1.1. Create Constructor

	public Matrix(int newsizerow, int newsizerowcolumn) {
		this.sizerow = newsizerow;
		this.sizecolumn = newsizerowcolumn;
		this.elements = new int[newsizerow][newsizerowcolumn];
	}

	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods

	public int getSizerow() {
		return sizerow;
	}

	public void setSizerow(int sizerow) {
		this.sizerow = sizerow;
	}

	public int getSizerowcolumn() {
		return sizecolumn;
	}

	public void setSizerowcolumn(int sizerowcolumn) {
		this.sizecolumn = sizerowcolumn;
	}

	public int[][] getElements() {
		return elements;
	}

	public void setElements(int[][] elements) {
		this.elements = elements;
	}
	
	// Step 2.2. Create CRUD methods
	
	public int[][] InsertElements(int element,int row,int column) {
		this.elements[row][column]= element;
		return this.elements;
	}
}
