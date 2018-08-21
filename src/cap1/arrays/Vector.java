package cap1.arrays;

public class Vector {
	// Step 1. Create attributes
	private int size;
	private int[] elements;
	
	// Step 1.1. Create Constructor
	public Vector(int newSize) {
		//System.out.println("Creating vector with size="+newSize);
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
		System.out.println("Adding an element");
		return this.elements;
	}
	
	public int searchElementByPosition(int position) {
		System.out.println("Searching an element");
		return this.elements[position];
	}
	
	//Update an element by the position
	public int updateElementByPosition(int position, int newElement) {
		this.elements[position]=newElement;
		System.out.println("Update an element by position");
		return this.elements[position];
	}
	//Update an element by the value
	//We assume that the value is not repeated in the vector.
	
	public int updateElementByElement(int element, int newElement) {
		int arr_size = elements.length;
		for(int i=0; i<arr_size; i++) {
			if(elements[i]==element) {
				elements[i]=newElement;
				return elements[i];
			}
		}
		System.out.println("Update an element by previous element");
		return 0;
	}
	
	//Delete an element by the position
	//We treat "delete" as set 0 value on the position
	public int removeElementByPosition(int position) {
		this.elements[position]=0;
		System.out.println("Remove element by position");
		return this.elements[position];
	}
	
	//Delete an element by the value
	//We assume that the value is not repeated in the vector
	//if is repeated, all of the positions that have the same value will be change to 0.
	public int removeElementByElement(int element) {
		int arr_size = elements.length;
		for(int i=0; i<arr_size; i++) {
			if(elements[i]==element) {
				elements[i]=0;
			}
		}
		System.out.println("Remove element by previous element");
		return 0;
	}
	
	
	public static String YaMatenmePorFavor(boolean Allow) {
		if(Allow==true) {return "Ya puedes morir.";} else {return "Aun no, necesitamos que sufras un poco más";}
	}
	
	
	
}
/*Last access: LUNES-20AGOSTO-2018 7:53pm*/
