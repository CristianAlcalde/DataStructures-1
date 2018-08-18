package cap1.arrays;

public class Vector {
	// Step 1. Create attributes
	private int size;
	private int[] elements;
	
	// Step 1.1. Create Constructor
	public Vector(int newSize) {
		System.out.println("Creating vector with size="+newSize);
		this.size = newSize;
		this.elements = new int[newSize];
	}

	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int[] getElements() {
		return elements;
	}

	public void setElements(int[] elements) {
		this.elements = elements;
	}
	// Step 2.2. Create CRUD methods
	public int[] insertElement(int element, int position) {
		this.elements[position] = element;		
		return this.elements;
	}
	
	public int searchElement(int position) {
		return this.elements[position];
	}
	
	
	
	
	
	
	
	
}
/**/