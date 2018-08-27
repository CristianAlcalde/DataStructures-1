package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes

	private int size;
	private int[][] element;
	
	
	// Step 2. Create methods
		// Step 2.1. Generate encapsulation methods
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int[][] getElement() {
		return element;
	}
	public void setElement(int[][] element) {
		this.element = element;
	}
	
	// Step 2.2. Create CRUD methods
	
	public int [][] insertElement(int element1 ,int positionx,int positiony) {
		this.element[positionx][positiony] = element1;
		return this.element;
	}
	
	
	
	
	
	
	
	
}