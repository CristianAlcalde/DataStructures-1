package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	private int sizeLines;
	private int sizeColumns;
	private int[][] elements;
	
	// Step 1.1. Create Constructor
	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
	
	public int getSizeLines() {
		return sizeLines;
	}
	public void setSizeLines(int sizeLines) {
		this.sizeLines = sizeLines;
	}
	public int getSizeColumns() {
		return sizeColumns;
	}
	public void setSizeColumns(int sizeColumns) {
		this.sizeColumns = sizeColumns;
	}
	public int[][] getElements() {
		return elements;
	}
	public void setElements(int[][] elements) {
		this.elements = elements;
	}
	
	// Step 2.2. Create CRUD methods
	
	public int[][] insertElement(int sizeLines, int sizeColumns, int item) {
		this.sizeLines=sizeLines;
		this.sizeColumns=sizeColumns;
		this.elements[sizeLines][sizeColumns] = item;
		return this.elements;
	}
}
