package cap1.arrays;

public class HashTable {
	//Attributes
	person[] element;
	int size;
	float changeFactor;
	
	
	//Constructor
	
	public HashTable(int newSize) {
		System.out.println("Creating hastTable with size= " + newSize);
		this.size=newSize;
		this.element = new person [newSize];		
		this.changeFactor =0;
	}

	//encapsulation methods
	public person[] getElement() {
		return element;
	}


	public void setElement(person[] element) {
		this.element = element;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public float getChangeFactor() {
		return changeFactor;
	}


	public void setChangeFactor(float changeFactor) {
		this.changeFactor = changeFactor;
	}
	


	//CRUD
	
	
	
	
	
	
	
}
