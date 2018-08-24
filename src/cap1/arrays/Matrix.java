package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	private int file;
	private int column;
	private int[][] elements;
	// Step 1.1. Create Constructor
	public Matrix (int newFile, int newColumn) {
		System.out.println("Creating Matrix with size= " + newFile + newColumn);
		this.file= newFile;
		this.column= newColumn;
		this.elements= new int[newFile][newColumn];
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
			//INSERTAR ELEMENTO
	public int [][] insertElement(int element, int x, int y){
		this.elements[x][y] = element;
		return this.elements;
	}
}
