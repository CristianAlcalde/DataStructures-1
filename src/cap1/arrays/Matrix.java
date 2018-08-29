package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	private int size;
	private int[][] elements;
	
	// Step 1.1. Create Constructor
	public Matrix(int newsizex, int newsizey) {	
		System.out.println("Creating vector with size=");
		this.size = size;
		this.elements = new int[newsizex][newsizey];
	}
	
	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int[][] getElement() {
		return elements;
	}
	public void setElement(int[][] element) {
		this.elements = element;
	}
	
	// Step 2.2. Create CRUD methods
	public int [][] insertElement(int element1 ,int positionA,int positionB) {
		this.elements[positionA][positionB] = element1;
		return this.elements;
	}
				
}
