package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes

	private int files;
	private int columns;
	private int elements[][];

	// Step 1.1. Create Constructor
	public Matrix(int newFiles, int newColumns) {
		System.out.println("Creating matrix with size = " + newFiles + "*" + newColumns);
		this.files = newFiles;
		this.columns = newColumns;
		this.elements = new int[newFiles][newColumns];
	}

	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods

	public int getFiles() {
		return files;
	}

	public void setFiles(int files) {
		this.files = files;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public int[][] getelements() {
		return elements;
	}

	public void setElements(int[][] elements) {
		this.elements = elements;
	}

	// Step 2.2. Create CRUD methods

	public int[][] insertElement(int element, int files, int columns) {
		this.elements[files][columns] = element;
		return this.elements;
	}

	public int searchElementByPosition(int filePosition, int columnPosition) {
		return this.elements[filePosition][columnPosition];
	}

	public int searchElementByValue(int element) {
		int result = -3;
		// Recorrer la matriz buscando el elemento dado.
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length; i++) {
				if (elements[i][j] == element) {
					result = i * j;
					// System.out.println(result);
				}
			}
		}
		return result;

	}

}
