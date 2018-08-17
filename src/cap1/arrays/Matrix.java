package cap1.arrays;

public class Matrix {
	private int rows;
	private int columns;
	private int[][] elements;
	
	public Matrix(int newRows, int newColumns) {
		this.rows = newRows;
		this.columns = newColumns;
		this.elements = new int[newRows][newColumns];
	}
	
	public int getRows() {
		return rows;
	}
	
	public void setRows(int rows) {
		this.rows = rows;
	}
	
	public int getColumns() {
		return columns;
	}
	
	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public int[][] getElements() {
		return elements;
	}
	
	public void setElements(int[][] elements) {
		this.elements = elements;
	} 
	
	public int[][] insertElement(int row, int column, int element) {
		this.elements[row][column] = element;	
		return this.elements;
	}
	
	public int searchElement(int row, int column) {
		return this.elements[row][column];
	}
	
	public int[][] updateElement(int row, int column, int element) {
		this.elements[row][column] = element;
		return this.elements;
	}
	
	public int[][] deleteElement(int row, int column) {
		this.elements[row][column] = 0;	
		return this.elements;
	}

}
