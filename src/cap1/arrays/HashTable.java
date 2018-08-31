package cap1.arrays;

public class HashTable {
	
	// Step 1. Create attributes
	Person[] elements;
	float chargeFactor;
	int size;
	
	// Step 1.1. Create Constructor
	public HashTable(int newSize) {
		System.out.println("Creating vector with size: " + newSize);
		this.size = newSize;
		this.elements = new Person[newSize];
		
	}
	
	// Step 2. Generate encapsulation methods
	public Person[] getElements() {
		return elements;
	}
	public void setElements(Person[] elements) {
		this.elements = elements;
	}
	
	public float getChargeFactor() {
		return chargeFactor;
	}
	public void setChargeFactor(float chargeFactor) {
		this.chargeFactor = chargeFactor;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	// Step 3. Create CRUD methods
	
	// metodo para hallar el indice
	//public int hashFunction(Person intDocument) {
	//	int code = Integer.parseInt(getDocument());
		
	//}
	
	// Step 3.1 Creating Insert methods
	
	
	

}
