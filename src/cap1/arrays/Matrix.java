package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	private int row;
	private int column;
	private int[][] elements;

	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int[][] getElements() {
		return elements;
	}

	public void setElements(int[][] elements) {
		this.elements = elements;
	}

	// Step 1.1. Create Constructor

	public Matrix(int row, int column) {
		System.out.println("creating matrix with row=" + row);
		System.out.println("creating matrix with column=" + column);
		this.row = row;
		this.column = column;
		this.elements = new int[row][column];
	}

	// Step 2.2. Create CRUD methods
	public int[][] insertElement(int element, int row, int column) {
		this.elements[row][column] = element;
		return this.elements;
	}

	public int searchElementByPosition(int row, int column) {
		if (row < row && column < column && row > 0 && column > 0) {

		} else {
			System.out.print("Error en datos");
		}
		return this.elements[row][column];
	}

}

