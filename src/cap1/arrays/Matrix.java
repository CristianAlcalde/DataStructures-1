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

	public String searchElement(int element) {
		int i = 0;
		int j = 0;
		int yes = 0;
		for (i = 0; i < this.rows; i++) {
			for (j = 0; j < this.columns; j++) {
				int serchElement = elements[i][j];
				if (serchElement == element) {
					yes = 1;
					break;
				}
			}
			if (yes == 1) {
				break;
			}
		}
		return i + ", "+ j;
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
