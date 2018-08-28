package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	private int sizex;
	private int sizey;
	private int[][] elements;

	// Step 1.1 Create constructor
	public Matrix(int newsizex, int newsizey) {
		System.out.println("Creating mMtrix with size=" + newsizex + "by " + newsizey);
		this.sizex = newsizex;
		this.sizey = newsizey;
		this.elements = new int[newsizex][newsizey];
	}

	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
	public int getSizex() {
		return sizex;
	}

	public void setSizex(int sizex) {
		this.sizex = sizex;
	}

	public int getSizey() {
		return sizey;
	}

	public void setSizey(int sizey) {
		this.sizey = sizey;
	}

	public int[][] getElements() {
		return elements;
	}

	public void setElements(int[][] elements) {
		this.elements = elements;
	}
	
	// Step 2.2. Create CRUD methods
	
	public int[][] insertElement(int element, int positionx, int positiony) {
		this.elements[positionx][positiony] = element;		
		return this.elements;
	}
	
	public int searchElement(int positionx, int positiony) {
		return this.elements[positionx][positiony];
	}
}