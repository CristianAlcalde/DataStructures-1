package cap1.arrays;

public class Matrix {
	
	// Step 1. Create attributes
	private int matrix[][];
	private int columns;
	private int lines;
	
	// Step 1.1. Create Constructor
	public Matrix(int columns, int lines) {
		this.columns = columns;
		this.lines = lines;
		this.matrix = new int [lines][columns]; 
	}
	
	
	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
	public int getLines() {
		return lines;
	}

	public void setLines(int lines) {
		this.lines = lines;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
	
	
	// Step 2.2. Create CRUD methods
	public int InsertMatrix(int line, int column, int data) {
		if ((line < lines && column < columns) && (line > 0 && column > 0)) {
			this.matrix[line][column] = data;
		} else {
			System.out.print("Position does not exist..");
		}
		return data;
	}
	
	@SuppressWarnings("unused")
	public boolean ListMatrix() {
		boolean answer = false;

		for (int l = 0; l < lines; l++) {
			for (int c = 0; c < columns; c++) {
				System.out.println(this.matrix[l][c]);
			}
			System.out.println();

		}
		if (matrix.length > 0) {
			answer = true;
		}
		return true;

	}
	
	public int SearchMatrix(int data) {
		for (int l = 0; l < matrix.length; l++) {
			for (int c = 0; c < matrix.length; c++) {
				if (this.matrix[l][c] == data) {
					System.out.println("Data is there" + l + "-" + c);
				}
			}
		}
		return 0;
	}
	
	public int DeleteMatrix(int l, int c) {
		this.lines = l;
		this.columns = c;
		this.matrix[l][c] = 0;
		return 0;
	}
}


