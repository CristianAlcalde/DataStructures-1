package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	private int sizeX;
	private int sizeY;
	private int[][] matrix;
		
	// Step 1.1. Create Constructor
	public Matrix(int newSizeX, int newSizeY) {
		System.out.println("Creating vector with size=" + newSizeX + " En X y " + newSizeY +  "en Y");
		this.sizeX = newSizeX;
		this.sizeY = newSizeY;
		this.matrix = new int[newSizeX][newSizeY];
	}
	
	// Step 2. Create methods
	
		// Step 2.1. Generate encapsulation methods
	public int getSizeX() {
		return sizeX;
	}

	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}
	
	public int getSizeY() {
		return sizeY;
	}

	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
	
	// Step 2.2. Create CRUD methods
	
}
