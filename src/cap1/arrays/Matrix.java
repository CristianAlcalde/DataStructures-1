package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	private int file;
	private int column;
	private int elements[][];
	
	// Step 1.1. Create Constructor
	public Matrix(int newFile,int newColumn) {
		System.out.println("Creating matrix with elements=" + newFile + newColumn);
		this.file = newFile;
		this.column = newColumn;
		this.elements = new int[newFile][newColumn];
	}
	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods

	public int getFile() {
		return file;
	}

	public void setFile(int file) {
		this.file = file;
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
	
	// Step 2.2. Create CRUD methods
	
	public int [][] insertElement(int element, int positionFile, int positionColumn){
		this.elements[positionFile][positionColumn] = element;
		return this.elements;
			
	}
	
	public int searchElementbyPosition(int positionFile, int positionColumn) {
		return this.elements[positionFile][positionColumn];
	}
	
	public int[] searchElementbyValue(int value) {
		int[] position =new int [2];
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements[i].length; j++) {
				if (elements[i][j] ==value) {
					position[0] = i;
					position[1] = j;
				}
			}
		}
		return position;
	}
	}

