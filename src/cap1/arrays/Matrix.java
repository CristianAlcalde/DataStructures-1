package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	private int sizeLines;
	private int sizeColumns;
	private int[][] elements;
	
	// Step 1.1. Create Constructor
	
	public Matrix(int newSizeLines, int newSizeColumns) {
		
		this.sizeLines = newSizeLines;
		this.sizeColumns= newSizeColumns;
		this.elements = new int[newSizeLines][newSizeColumns];
	}
		
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
	
	public int searchElement (int item) {
		
		for (int sizeLines=0; sizeLines<this.sizeLines; sizeLines++);
		for (int sizeColumns=0; sizeColumns<this.sizeColumns; sizeColumns++);
		{if (this.elements[sizeLines][sizeColumns]==item)
			System.out.println( sizeLines + "," + sizeColumns);
	}
	return item;
}

	public int[][] updateElement(int newItem, int sizeLines, int sizeColumns) {
		this.elements[sizeLines][sizeColumns] = newItem;
		return this.elements;
	}
	
	public int[][] deleteElement(int element) {

		for (int i = 0; i < elements.length; i++)
		for (int j=0; j<elements.length; j++){
			if (elements[i][j] == element) {
				elements[i][j] = 0;
			}
		}
		return this.elements;
	}
}